package com.itso.example;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/example")
public class ITSOJaxrsExample {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public Response getString() {
		return Response.ok("Hello ITSO from JAX-RS").build();
	}

	@POST
	@Consumes(MediaType.TEXT_PLAIN)
	@Produces(MediaType.TEXT_PLAIN)
	public Response postString(String incomingMessage) {
		return Response.ok("Hello, " + incomingMessage + " from JAX-RS").build();
	}
}
