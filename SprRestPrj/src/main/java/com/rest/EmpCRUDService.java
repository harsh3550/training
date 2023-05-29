package com.rest;
import com.rest.entity.*;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/empCRUD")
public class EmpCRUDService {
    @GET
    @Path("/")
    @Produces(MediaType.TEXT_PLAIN)
    public Response getMsg() {
        return Response.status(200).entity("<h1>Emp CRUD works</h1>").build();
    }
    @GET @Path("/getAll")
    @Produces({"application/json", "application/xml"})
    public List<Emp> ListEmps() {
        EmpDAO edao=new EmpDAO();
        return edao.getAllEmps();
    }
    @GET
    @Path("/getEmp")
    @Produces({"application/json", "application/xml"})
    public Emp getEmp( @QueryParam("eid") int eid) {
        EmpDAO edao=new EmpDAO();
        return edao.getEmp(eid);
    }

    @GET @Path("/updateEmp")
    //@Produces({"application/json", "application/xml"})
    @Produces(MediaType.TEXT_PLAIN)
    public String upEmp(
            @QueryParam("eid") int eid,
            @QueryParam("ename") String ename)
    {
        Emp e=new Emp(eid,ename);
        EmpDAO edao=new EmpDAO();
        String r=edao.updateEmp(e);
        return r;

    }
    @GET @Path("/delEmp")
    @Produces({"application/json", "application/xml"})
    //@Produces(MediaType.TEXT_PLAIN)
    public List<Emp> delEmp(
            @QueryParam("eid") int eid)
    {
        EmpDAO edao=new EmpDAO();
        return  edao.delEmp(eid);

    }
    @POST
    @Path("/addPost")
    //@Consumes(MediaType.MULTIPART_FORM_DATA)
    @Produces(MediaType.TEXT_PLAIN)
    public String addEmpPost(
            @FormParam("eid") int eid,
            @FormParam("ename") String ename)
    {
        Emp e=new Emp(eid,ename);
        EmpDAO edao=new EmpDAO();
        edao.addEmp(e);
        return "success by post";
    }
    @GET
    @Path("/add")
    //@Produces({"application/json", "application/xml"})
    @Produces(MediaType.TEXT_PLAIN)
    public String addEmp(
            @QueryParam("eid") int eid,
            @QueryParam("ename") String ename)
    {
        Emp e=new Emp(eid,ename);
        EmpDAO edao=new EmpDAO();
        edao.addEmp(e);
        return "success";
    }
}
