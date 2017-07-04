package com.ps.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Component;

@Path("userRes")
@Component
public class UserController {
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getName(){
		return "Jinghe";
	}
}
