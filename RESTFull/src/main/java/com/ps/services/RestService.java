package com.ps.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.web.bind.annotation.RestController;

@Path("/restService")
@RestController
public class RestService {
	@GET
	@Path("/getInfo")
	@Produces(MediaType.TEXT_PLAIN)
	public String getService(){
		return "Hello World";
	}
}
