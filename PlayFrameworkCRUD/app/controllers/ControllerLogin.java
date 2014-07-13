package controllers;

import static play.data.Form.form;
import models.Login;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;

public class ControllerLogin extends Controller {
	
	public static Result authenticate() {
		
		System.out.println("Login");
		
	    Form<Login> loginForm = form(Login.class).bindFromRequest();
	    if (loginForm.hasErrors()) {
	        return badRequest(views.html.login.render(loginForm));
	    } else {
	        session().clear();
	        session("email", loginForm.get().email);
	        return redirect(
	            routes.Application.index()
	        );
	    }
	}
	
	public static Result login() {
	    return ok(
	    		views.html.login.render(form(Login.class))
	    );
	}
	
	public static Result logout() {
	    session().clear();
	    flash("success", "You've been logged out");
	    return redirect(
	        routes.ControllerLogin.login()
	    );
	}

}
