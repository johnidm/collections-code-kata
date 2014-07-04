
package br.com.johnidouglas.rest.resources.impl;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

// http://www.mkyong.com/webservices/jax-rs/jersey-hello-world-example/
@Path("/hello")
public class Hello {
    
    @GET
    @Path("/{param}")
    public Response getMsg(@PathParam("param") String msg) {
        String output = "Hi, how are you " + msg;
        return Response.status(200).entity(output).build();
    }
    
    
    @GET
    @Path("t1/{parameter}")   

    //http://examples.javacodegeeks.com/enterprise-java/rest/jersey/jersey-hello-world-example/
    //http://localhost:8080/JAXRS-HelloWorld/rest/helloWorldREST/JavaCodeGeeks?value=enjoy-REST 
    public Response responseMsg( @PathParam("parameter") String parameter, 
            @DefaultValue("sem valor") @QueryParam("value") String value ) {
        
        String output = "Hello from:" + parameter + " : " + value;
        return Response.status(200).entity(output).build();
        
    }
    
}


