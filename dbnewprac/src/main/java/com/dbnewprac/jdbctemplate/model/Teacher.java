package com.dbnewprac.jdbctemplate.model;

public class Teacher {
	int emp_id;
	   String name;
	   int age;
	   
	@Override
	public String toString() {
		return "Teacher [emp_id=" + emp_id + ", name=" + name + ", age=" + age + "]";
	}
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Teacher(int emp_id, String name, int age) {
		super();
		this.emp_id = emp_id;
		this.name = name;
		this.age = age;
	}
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
