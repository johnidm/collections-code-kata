package br.com.geladaonline.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/olaMundo")
public class TesteService {
	
	@GET
	@Produces("text/plain")
	public String dizOla() {
		return "Ola, mundo REST";
	}
    

}
