// http://www.blogdofornias.com.br/servicos-rest-com-glassfish-4/


package br.com.johnidouglas.sample.rest.jersey.services;

import br.com.johnidouglas.sample.rest.jersey.models.Cliente;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/cliente")
public class ClienteService {
    
    @GET
    @Path("/todos")
    @Produces(MediaType.APPLICATION_JSON)
    public Cliente getTodos() {
         return null;
    }    
    
}
