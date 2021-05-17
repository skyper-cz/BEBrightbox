package cz.educanet;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("polozky")
@Produces(MediaType.APPLICATION_JSON)
public class PolozkaResources {

    @GET
    @Path("load")
    public Response getPrices() {
        try {
            return Response.ok(JsonLoader.loadJson("/Users/user/Documents/GitHub/BEBrightbox/src/main/Java/cz/educanet/data.json")).build();
        } catch (Exception e) {
            return Response.status(500, "Soubor nenalezen.").build();
        }
    }
}
