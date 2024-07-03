package io.desert.ipcde17.sn100c;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import io.smallrye.mutiny.Uni;

@Path("/sn100c")
public class StaticNodeController {

    /**
     * Gibt den Namen eines Static Nodes zurück.
     */
    @GET
    @Path("/get/{name}")
    public Uni<String> get(String name) {
        throw new UnsupportedOperationException("Unimplemented method 'get'");
    }
}
