package com.yash.restapistudent.controller;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


import com.yash.restapistudent.model.Student;
import com.yash.restapistudent.serviceImpl.StudentImpl;

@Path("student")
public class StudentController 
{
	StudentImpl stud = new StudentImpl(); 
	
@GET
@Produces(MediaType.APPLICATION_JSON)
public List<Student> getStudent()
{
	return stud.getAllStudent();
}



}
