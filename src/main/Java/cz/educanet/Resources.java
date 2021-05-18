package cz.educanet;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;


@Path("polozky")
public class Resources {

    @GET
    public Response getPrices() {
        try {
            return Response.ok(JsonLoader.loadJson("data.json")).build();
        } catch (Exception e) {
            return Response.status(500, "Soubor nenalezen.").build();
        }
    }
}
