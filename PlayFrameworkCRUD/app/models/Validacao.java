package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import play.data.validation.Constraints;
import play.db.ebean.Model;

@Entity
public class Validacao extends Model {
	
	@Id
	@GeneratedValue
	public Long id;
	
	@Constraints.MaxLength(60)
	@Constraints.Required(message="E necessario informar o nome")
	public String nome;
	
	@Constraints.Email(message="E-mail invalido") 
	@Constraints.Required(message="E necessario informar o email") 
	@Constraints.MaxLength(100)
	public String email;
	
	@Constraints.MaxLength(9)
	@Constraints.Pattern(value = "[0-9]{5}-[0-9]{3}", message="CEP incorreto")
	@Constraints.Required(message="E necessario informar o CEP")
	public String cep;	
	
	
	public Integer idade;

}
