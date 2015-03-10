package br.com.geladaonline.services;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/v1")
public class ApplicationJAXRS extends Application {
		
	@Override
	public Set<Class<?>> getClasses() {		
		Set<Class<?>> classes = new HashSet<Class<?>>();	
				
		classes.add(CervejasService.class);
		classes.add(TesteService.class);
		
		return classes;		
	}
	
}
