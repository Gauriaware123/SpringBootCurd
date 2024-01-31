package com.java.student.model;


public class StudentForm {
	
	private int sno;
	private String sname;
	private int age;
	
	public StudentForm(int sno, String sname, int age) {
		super();
		this.sno = sno;
		this.sname = sname;
		this.age = age;
	}
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}
