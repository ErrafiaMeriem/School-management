package models;

import java.util.ArrayList;

public class School {
	String name;
	String Address;
	String phoneNumber;
	
	ArrayList<Student> students;
	ArrayList<Teacher> teachers;
	ArrayList<Grade> grades;
	
	public School() {
		this.Arrays();
		
	}
	
	public School(String name) {
		this.name=name;
		this.Arrays();
	}
	
	public School(String name,String Address,String phoneNumber) {
		this.name=name;
		this.Address=Address;
		this.phoneNumber=phoneNumber;
		this.Arrays();
	}
	
	private void Arrays() {
		students=new ArrayList<Student>();
		teachers=new ArrayList<Teacher>();
		grades=new ArrayList<Grade>();
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getAddress() {
		return Address;
	}
	
	public void setAddress(String Adress) {
		this.Address=Address;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber=phoneNumber;
	}
	
	public ArrayList<Student> getStudents(){
		return students;
	}
	
	public ArrayList<Teacher> getTeachers(){
		return teachers;
	}
	
	public ArrayList<Grade> getGrades() {
		return grades;
		
	}
}
