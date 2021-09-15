package com.yash.jerseytypedemo;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("/MyResource")
public class MyResource {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getItplan() {
        return "plan text read from rest API!";
    }
    /**
     * 
     * @return String that will be returned as a XMl response.
     */
    @GET  
    @Produces(MediaType.TEXT_XML)  
    public String sayXMLHello() {  
      return "<?xml version=\"1.0\"?>" + "<hello> Hello Jersey" + "</hello>";  
    }  
    /**
     * 
     * @return String that will be returned as a HTML response.
     */
    
    @GET  
    @Produces(MediaType.TEXT_HTML)  
    public String sayHtmlHello() {  
      return "<html> " + "<title>" + "Hello Jersey" + "</title>"  
          + "<body><h1>" + "Hello Jersey HTML" + "</h1></body>" + "</html> ";  
    }  
}
    
 
