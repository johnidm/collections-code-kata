package controllers;

import models.Validacao;
import play.data.Form;
import play.data.validation.ValidationError;
import play.mvc.Controller;
import play.mvc.Result;

public class ControllerValidacao extends Controller {

	private static Form<Validacao> formValidacao = Form.form(Validacao.class);

	public static Result gravar() {

		Form<Validacao> formGravar = formValidacao.bindFromRequest();
		
		if (formGravar.field("nome").valueOr("").equals("johni")) {
			formGravar.reject("nome", "Nome nao pode ser johni");
		}
		
		if(formGravar.field("nome").valueOr("").equals("douglas")) {
			ValidationError erro = new ValidationError("nome", "Nome nao pode ser douglas");
		    formGravar.reject(erro);
		}
		
				
		if (formGravar.hasErrors()) {
			return badRequest(views.html.validacao.render(formGravar));
		}

		// Validacao validacao = formGravar.get();

		return ok(views.html.validacao.render(formValidacao));

	}

	public static Result mostrar() {
		return ok(views.html.validacao.render(formValidacao));

	}

}
