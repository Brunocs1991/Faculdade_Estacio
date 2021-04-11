/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unesa;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;

/**
 * REST Web Service
 *
 * @author brunocs
 */
@Path("calculadora")
public class CalculadoraResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of CalculadoraResource
     */
    public CalculadoraResource() {
    }

    /**
     * Retrieves representation of an instance of unesa.CalculadoraResource
     *
     * @return an instance of unesa.CalculadoraResult
     */
    @GET
    @Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
    public CalculadoraResult getJson() {
        //TODO return proper representation object
        CalculadoraResult cr = new CalculadoraResult();
        cr.setOperacao("nenhuma");
        return cr;
    }

    @GET
    @Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
    @Path("somar/{a}/{b}")
    public CalculadoraResult somar(
            @PathParam("a") int a, @PathParam("b") int b) {
        CalculadoraResult cr = new CalculadoraResult();
        cr.setA(a);
        cr.setB(b);
        cr.setOperacao("somar");
        cr.setResultado(a + b);
        return cr;
    }

    /**
     * PUT method for updating or creating an instance of CalculadoraResource
     *
     * @param content representation for the resource
     */
    @PUT
    @Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
    public void putJson(CalculadoraResult content) {
    }
    
}
