package models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import play.db.ebean.Model;

@Entity
public class Users extends Model {
	
	private static final long serialVersionUID = 1L;
	
	public static Model.Finder<Long, Users> find = new Model.Finder<Long, Users>(Long.class, Users.class); 
	
	@Id
	@GeneratedValue
	public Long id;	
	
	public String name;	
	public String email;
	public String observacao;	
	
}
