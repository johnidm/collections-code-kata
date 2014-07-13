package controllers;

import static play.data.Form.form;

import java.util.List;

import models.Users;
import play.api.templates.Html;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;

import com.avaje.ebean.Ebean;

public class Application extends Controller {

	private static Form<Users> formUsers = Form.form(Users.class);
	
	
	@Security.Authenticated(Secured.class)
	public static Result index() {
		return ok(views.html.index.render("Your new application is ready."));
	}

	public static Result addUser() {
				
		return ok(views.html.insertuser.render(formUsers));
	}

	public static Result insertUser() {

		Form<Users> formInsert = formUsers.bindFromRequest();

		Users user = formInsert.get();
		
		System.out.println(user.name);
		
		Ebean.save(user);

		return redirect(routes.Application.listUsers());
	}

	public static Result deleteUser(Long id) {

		Users.find.ref(id).delete();

		return redirect(routes.Application.listUsers());
	}

	public static Result listUsers() {

		List<Users> users = Ebean.find(Users.class).orderBy("name").findList();

		Html view = views.html.listuser.render(users);
		return ok(view);
	}

	public static Result detailUser(Long id) {

		Form<Users> formDetail = form(Users.class).fill(Users.find.byId(id));

		return ok(views.html.modifyuser.render(id, formDetail));
	}

	public static Result modifyUser(Long id) {

		Form<Users> formModify = form(Users.class).bindFromRequest();

		formModify.get().update(id);

		return redirect(routes.Application.listUsers());
	}

}
