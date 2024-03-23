package models;

public class Student extends Person{
	String parentPhoneNumber ;
	
	public Student(String name, int age ,String parentPhoneNumber) {
		super(name,age);
		this.parentPhoneNumber=parentPhoneNumber;
	}
	
	public Student() {
		
	}
	
	public String getPrentPhoneNumber() {
		return parentPhoneNumber;
	}
	
	public void setPrentPhoneNumber(String ParentPhoneNumber ) {
		this.parentPhoneNumber=parentPhoneNumber;
	}

}
