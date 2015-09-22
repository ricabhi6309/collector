package com.xyz.collector.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path(value = "/hello")
public class EchoResource {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response echo() {
		return Response.ok("{\"value\":\"echo-ping\"}").build();
	}
}
