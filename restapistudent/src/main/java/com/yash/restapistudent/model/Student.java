package com.yash.restapistudent.model;

import java.util.List;

/**
 * model class for student
 * @author usha.more
 *
 */

public class Student {
	public int id;
	public String name;
	public String address;
	public int marks;

	public Student() {
		super();
	}

	public Student(int id, String name, String address, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.marks = marks;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + ", marks=" + marks + "]";
	}

	public void addAll(List<Student> asList) {
		// TODO Auto-generated method stub
		
	}

}
