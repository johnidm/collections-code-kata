package br.com.geladaonline.services;


import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import br.com.geladaonline.model.Cerveja;


@Path("/cervejas")
@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
public class CervejasService {
	
	private List<Cerveja> cervejas = new ArrayList<Cerveja>() 
			{			
				private static final long serialVersionUID = 1L;
			{
				add(new Cerveja(1, "Brhama", "Brhama"));
				add(new Cerveja(2, "Kaiser", "Kaiser"));	
				add(new Cerveja(3, "Boon", "Belgia"));
			}};
	
	@GET	
    public List<Cerveja> getCustomer() {	
		
        return cervejas;        
    }
	
	
	@GET
	@Path("{id}")
	public Cerveja encontrarCerveja(@PathParam("id") Integer id) {	 
        return cervejas.stream().filter( c -> { return c.getId() == id; } ).findFirst().get();
		       
		
	}
	
	@POST		
	public Response criarCerveja(Cerveja cerveja) {
		
		URI uri = UriBuilder.fromPath("cervejas/{nome}").build(cerveja.getNome());		
		return Response.created(uri).entity(cerveja).build();
				
		
	}
	
	@PUT
	@Path("{id}")
	public void atualizaCerveja(@PathParam("id") Integer id, Cerveja cerveja ) {
		Cerveja c = cervejas.get(id + 1);
		
		c.setMarca(cerveja.getMarca());
		c.setNome(cerveja.getNome());
		
	}
	
	@DELETE
	@Path("{id}")
	public void atualizaCerveja(@PathParam("id") Integer id ) {
		cervejas.remove(id + 1);
	}
	
	
	
}
