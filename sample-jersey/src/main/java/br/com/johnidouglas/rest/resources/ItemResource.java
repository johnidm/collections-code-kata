package br.com.johnidouglas.rest.resources;

import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

public interface ItemResource {    
    @GET
    @Produces({MediaType.APPLICATION_JSON}) 
    List<Item> getItems();
}
