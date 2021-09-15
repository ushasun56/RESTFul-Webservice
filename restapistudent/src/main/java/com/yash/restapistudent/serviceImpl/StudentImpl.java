package com.yash.restapistudent.serviceImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.yash.restapistudent.model.Student;
import com.yash.restapistudent.service.StudentService;

public class StudentImpl  implements StudentService
{
   List <Student> student;
   
   public StudentImpl() {
	   student = new ArrayList<>();
	   Student student = new Student(1,"soham","pune",60);
	   Student student1 = new Student(2,"nikita","pune",75);
	   Student student2 = new Student(3,"soham","pune",60);
	   student.addAll(Arrays.asList(student,student1,student2));
   }
	@Override
	public List<Student> getAllStudent() {
		
		return student;
	}

	@Override
	public Student getbyid(int id) {
		
		return null;
	}

}
