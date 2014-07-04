package br.com.johnidouglas.rest;

import com.sun.jersey.api.core.PackagesResourceConfig;
import javax.ws.rs.ApplicationPath;


@ApplicationPath("/")
public class InitApplication extends PackagesResourceConfig {

    public InitApplication() {
        super("br.com.johnidouglas.rest.resources.impl");
    }
}
