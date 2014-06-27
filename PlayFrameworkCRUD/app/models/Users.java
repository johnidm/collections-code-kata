package models;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import play.data.validation.Constraints;
import play.db.ebean.Model;

@Entity
public class Users extends Model {
	
	private static final long serialVersionUID = 1L;
	
	public static Model.Finder<Long, Users> find = new Model.Finder<Long, Users>(Long.class, Users.class); 
	
	@Id
	@GeneratedValue
	public Long id;	
	
	//@Constraints.Required	
	//@Constraints.MaxLength(60) 
	public String name;
	
	//@Constraints.Required
	//@Constraints.Email
	//@Constraints.MaxLength(100) 
	public String email;
	
	//@Column(columnDefinition="text")
	public String observacao;	
	
}
