package com.xyz.collector.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.xyz.collector.generated.Status;

@Path("/updateRouter")
public class RouterResources {
	
	@Path("/status")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response updateConnectionStatus(Status status) {
		return null;
	}
	
	@Path("/property")
	@GET
	public Response updatePropertyValue(@QueryParam("user") String userId,
			@QueryParam("device") String deviceId, @QueryParam("property") String property,
			@QueryParam("value") String propertyValue) {
		return null;
		
	}

}
