package com.example.projetoinicialrest.paths;

import com.google.gson.Gson;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/person")
public class Person {
    @GET
    @Path("hi")
    @Produces("application/json")
    public Response hi () {
        return Response.ok(new Gson().toJson("it's working")).build();
    }
}
