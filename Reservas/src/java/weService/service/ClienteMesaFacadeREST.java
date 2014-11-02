/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package weService.service;

import Jpa.entites.ClienteMesa;
import Jpa.entites.ClienteMesaPK;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.PathSegment;

/**
 *
 * @author Ildevana
 */
@Stateless
@Path("jpa.entites.clientemesa")
public class ClienteMesaFacadeREST extends AbstractFacade<ClienteMesa> {
    @PersistenceContext(unitName = "ReservasPU")
    private EntityManager em;

    private ClienteMesaPK getPrimaryKey(PathSegment pathSegment) {
        /*
         * pathSemgent represents a URI path segment and any associated matrix parameters.
         * URI path part is supposed to be in form of 'somePath;idmesa=idmesaValue;idcliente=idclienteValue;idperiodo=idperiodoValue'.
         * Here 'somePath' is a result of getPath() method invocation and
         * it is ignored in the following code.
         * Matrix parameters are used as field names to build a primary key instance.
         */
        Jpa.entites.ClienteMesaPK key = new Jpa.entites.ClienteMesaPK();
        javax.ws.rs.core.MultivaluedMap<String, String> map = pathSegment.getMatrixParameters();
        java.util.List<String> idmesa = map.get("idmesa");
        if (idmesa != null && !idmesa.isEmpty()) {
            key.setIdmesa(new java.lang.Integer(idmesa.get(0)));
        }
        java.util.List<String> idcliente = map.get("idcliente");
        if (idcliente != null && !idcliente.isEmpty()) {
            key.setIdcliente(new java.lang.Integer(idcliente.get(0)));
        }
        java.util.List<String> idperiodo = map.get("idperiodo");
        if (idperiodo != null && !idperiodo.isEmpty()) {
            key.setIdperiodo(new java.lang.Integer(idperiodo.get(0)));
        }
        return key;
    }

    public ClienteMesaFacadeREST() {
        super(ClienteMesa.class);
    }

    @POST
    @Override
    @Consumes({"application/xml", "application/json"})
    public void create(ClienteMesa entity) {
        super.create(entity);
    }

    @PUT
    @Path("{id}")
    @Consumes({"application/xml", "application/json"})
    public void edit(@PathParam("id") PathSegment id, ClienteMesa entity) {
        super.edit(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") PathSegment id) {
        Jpa.entites.ClienteMesaPK key = getPrimaryKey(id);
        super.remove(super.find(key));
    }

    @GET
    @Path("{id}")
    @Produces({"application/xml", "application/json"})
    public ClienteMesa find(@PathParam("id") PathSegment id) {
        Jpa.entites.ClienteMesaPK key = getPrimaryKey(id);
        return super.find(key);
    }

    @GET
    @Override
    @Produces({"application/xml", "application/json"})
    public List<ClienteMesa> findAll() {
        return super.findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({"application/xml", "application/json"})
    public List<ClienteMesa> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
        return super.findRange(new int[]{from, to});
    }

    @GET
    @Path("count")
    @Produces("text/plain")
    public String countREST() {
        return String.valueOf(super.count());
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
}
