package br.com.johnidouglas.services;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;


public class ApplicationJAXRS extends Application {

	@Override
	public Set<Class<?>> getClasses() {
		Set<Class<?>> classes = new HashSet<>();
		classes.add(TesteService.class);
		return classes;
	}
	
}
