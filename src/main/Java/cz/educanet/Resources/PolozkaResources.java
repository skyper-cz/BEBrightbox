package cz.educanet.Resources;

import cz.educanet.Manager.PolozkaManager;


import javax.inject.Inject;
import javax.websocket.server.PathParam;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("polozky")
@Produces(MediaType.APPLICATION_JSON)
public class PolozkaResources {

    @Inject
    private PolozkaManager Polozky;

    @GET
    @Path("get-all")
    public Response getAll() {
        return Response.ok(Polozky.getPolozkas()).build();
    }

    @GET
    @Path("get-specific")
    public Response getSpecific(@QueryParam("id") int id) {
        return Response.ok(Polozky.getSpecificPolozka(id-1)).build();
    }

    @POST
    @Path("create")
    public Response create(Polozka Polozka) {
        Polozky.putPolozka(Polozka);
        return Response.ok(Polozka).build();
    }

    @DELETE
    @Path("scrap")
    public Response scrap(@QueryParam("id") int removeid) {
        Polozky.Scrap(removeid-1);
        return Response.ok().build();
    }
}
