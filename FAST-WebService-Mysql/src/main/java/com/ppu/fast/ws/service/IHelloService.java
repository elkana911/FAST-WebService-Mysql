package com.ppu.fast.ws.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.ppu.fast.ws.service.response.HelloWebResponse;

@Path("/hello")
@Produces({ "application/xml", "application/json" })
public interface IHelloService {
	@GET
	@Path("/{name}")
	public HelloWebResponse hello(@PathParam("name") String name);

	@GET
	@Path("/world")
	public HelloWebResponse hello();

}
