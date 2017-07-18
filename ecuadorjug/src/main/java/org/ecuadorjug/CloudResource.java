package org.ecuadorjug;

import javax.inject.Inject;
import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonArrayBuilder;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

/**
 * Created by alberto on 7/17/17.
 */
@Path("clouds")
public class CloudResource {

    @Inject
    private BusinessLogic businessLogic;

    @GET
    public JsonArray getClouds(){
        return businessLogic.getClouds().stream().map(c -> Json.createObjectBuilder()
                .add("name", c.getName())
                .add("hype", c.getHype())
                .build()).collect(Json::createArrayBuilder, JsonArrayBuilder::add, JsonArrayBuilder::add);
        //return null;
    }

    // Bean Validation @NotNull @Valid
    // @Valid say to jax-rs please valida de object if it incorrent return http 400 bad request

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void createCloud(@NotNull @Valid final Cloud cloud){

        businessLogic.createCloud(cloud);

    }
}
