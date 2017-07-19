package org.ecuadorjug;

import javax.inject.Inject;
import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObject;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

/**
 * Created by alberto on 7/17/17.
 */
@Path("clouds")
public class CloudResource {

    @Inject
    private BusinessLogic businessLogic;

    @Context
    UriInfo uriInfo;

    @GET
    public JsonArray getClouds(){
        //return businessLogic.getClouds().stream().map(c -> Json.createObjectBuilder()
        //        .add("name", c.getName())
        //        .add("hype", c.getHype())
        //        .build()).collect(Json::createArrayBuilder, JsonArrayBuilder::add, JsonArrayBuilder::add);
        return businessLogic.getClouds().stream().map(this::createCloudJson).collect(Json::createArrayBuilder, JsonArrayBuilder::add, JsonArrayBuilder::add).build();

        //return null;
    }

    // Bean Validation @NotNull @Valid
    // @Valid say to jax-rs please valida de object if it incorrent return http 400 bad request

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void createCloud(@NotNull @Valid final Cloud cloud){

        businessLogic.createCloud(cloud);

    }

    private JsonObject createCloudJson(final Cloud cloud) {
        return Json.createObjectBuilder()
                .add("name", cloud.getName())
                .add("hype", cloud.getHype())
                //.add("_self", uriInfo.getBaseUriBuilder().path(CloudResource.class).path(CloudResource.class, "getClouds").build(cloud.getName()).toString())
                .build();
    }

    @GET
    @Path("{name}")
    public JsonObject getSingleCloud(@PathParam("name") final String name){
        return createCloudJson(businessLogic.getCloud(name));
    }
}
