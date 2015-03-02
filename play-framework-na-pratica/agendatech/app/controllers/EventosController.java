package controllers;


import java.util.List;

import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;

import com.avaje.ebean.Ebean;

public class EventosController extends Controller {

	private static Form<Evento> eventoForm = Form.form(Evento.class);
	
	
	public static Result novo() {
		
		return ok(views.html.eventos.novo.render());
	}
	
	public static Result cria() {
					
		/*
	   	Request request = request();
		request.body().asFormUrlEncoded().get(nome)[0]
		request.body().asJSON
		request.body().asXML
		*/
		
		Form<Evento> formFromRequest = eventoForm.bindFromRequest();		
		Evento evento = formFromRequest.get();
		
		Ebean.save(evento);
		
	   	return redirect(routes.EventosController.lista());
		
	}
	
	public static Result lista() {
		
		List<Evento> eventos = Ebean.find(Evento.class).findList();
		
		return ok(views.html.eventos.lista.render(eventos));
		
	}
	
}
