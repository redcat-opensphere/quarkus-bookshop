package com.santander.developergames.redcatopensphere.quarkuschallenge;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.santander.developergames.redcatopensphere.quarkuschallenge.model.Book;

@Path("{a:books|all}")
public class BookshopResource {

    @GET
    @Path("")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Book> books() {
        return Book.listAll();
    }
    @GET
    @Path("byName/{name}")
    @Produces(MediaType.APPLICATION_JSON)
    public Book bookByName(@PathParam("name") String name) {
        return Book.findByName(name);
    }
    @GET
    @Path("byPublicationYearBetween/{lowerYear}/{higherYear}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Book> booksByYear(@PathParam("lowerYear") Integer lowerYear, @PathParam("higherYear") Integer higherYear) {
        return Book.findByPublicationYearRange(lowerYear,higherYear);
    }
}