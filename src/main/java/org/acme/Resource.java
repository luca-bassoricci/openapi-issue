package org.acme;

import org.jboss.resteasy.reactive.ResponseStatus;

import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;

@Path("openapi-issue")
public class Resource
{
	@POST
	@Path("")
	@ResponseStatus(204)
	public void doAction(DoActionRequest request)
	{

	}
}
