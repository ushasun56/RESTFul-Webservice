package com.yash.restapistudent.service;

import java.util.List;

import com.yash.restapistudent.model.Student;

public  interface StudentService 
{
	
	public List<Student> getAllStudent();
	public Student getbyid(int id);

}
