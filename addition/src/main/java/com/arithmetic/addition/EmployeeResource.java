package com.arithmetic.addition;

import java.util.Collection;


import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;




@RequestScoped
@Path("/hr")
public class EmployeeResource {

EmployeeRepository database = new EmployeeRepository();

@Path("/employees")
@GET
@Produces(MediaType.APPLICATION_JSON)
public Collection<Employee> getAllEmployees() {
	return database.getAllEmployees();
}

	
	

}
