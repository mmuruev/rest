package ee.mf.rest;

import java.util.ArrayList;
import java.util.List;

import ee.mf.transaction.ITransactionBo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Component
@Path("/service")
public class CProductService {
    @Autowired
    ITransactionBo transactionBo;   

    @GET
    @Path("categories")
    @Produces({MediaType.APPLICATION_JSON})
    public List<String> getCategories() {
    	List<String> result = new ArrayList<String>();
    	result.add("Cat1");
    	result.add("Cat2");
    	result.add("Cat3");
        return result;
    }
    @GET
    @Path("products/{category}")
    public List<String> getProducts(@PathParam("category") final String category){
    	List<String> result = new ArrayList<String>();
    	result.add(category); // <<--- for test only
    	result.add("prod1");
    	result.add("prod2");
    	result.add("prod3");
    	
    	return result;
    }
    @GET
    @Path("product/{id}")
    public String getProduct(@PathParam("id") final String id){
    	return "product " + id + "description";
    }
}
