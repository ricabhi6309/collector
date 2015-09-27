package com.xyz.collector.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.xyz.collector.StatusAdapter.StatusAdapter;
import com.xyz.collector.StatusAdapter.StatusAdapterFactory;
import com.xyz.collector.Utils.PropertyStatusMapper;
import com.xyz.collector.Utils.StatusStateMapper;
import com.xyz.collector.generated.Status;
import org.apache.commons.lang.StringUtils;

@Path("/updateRouter")
public class RouterResources {

	private final StatusAdapter statusAdapter = StatusAdapterFactory.getStatusAdapter();
	@Path("/status")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response updateConnectionStatus(Status status) {
		if (StatusStateMapper.validStatus(status)) {
			statusAdapter.putStatus(status);
			return Response.ok("{\"value\":\"StatusUpdated\"}").build();
		}
		return Response.ok("{\"value\":\"ErrorOccurred\"}").build();
	}
	
	@Path("/property")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response updatePropertyValue(@QueryParam("user") String userId,
			@QueryParam("device") String deviceId, @QueryParam("property") String property,
			@QueryParam("value") String propertyValue) {

		if (StringUtils.isNotEmpty(userId) && StringUtils.isNotEmpty(deviceId) &&
				StringUtils.isNotEmpty(property) && StringUtils.isNotEmpty(propertyValue)) {
			Status status = PropertyStatusMapper.populatePropertyinStatus(userId,deviceId,property,propertyValue);
            statusAdapter.updateStatus(status);
			return Response.ok("{\"value\":\"propertyUpdated\"}").build();
		}

		return Response.ok("{\"value\":\"ErrorOccurred\"}").build();
	}

}
