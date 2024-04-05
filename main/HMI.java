package main;

import java.util.Scanner;

import models.Person;
import models.School;
import models.Student;
import models.Teacher;
import services.Schoolservices;

public class HMI {
	private static Schoolservices schoolservices;
	
	public static void start() {
		Scanner scanner = new Scanner(System.in);
		School school=HMI.createSchool();
		
		System.out.println("Welcome to "+school.getName());
	    String action;
		
		do {
			System.out.println("Hi sir/lady , what do you want to do?? \n 1.add a student \n 2.Print all the students \n 3.Find a student by his name \n 4. Remove a student \n 5.add a teacher"
					+ " \n 6.Print all the teachers \n 7.Find a teacher by his name \n 8.Remove a techer \n 9.exit");
			action=scanner.next();
			switch (action) {
			case "1" : HMI.addStudent();
			           break;
			           
			case "2" : HMI.PrintAllStudents();
			           break;
			           
			case "3" : HMI.findStudentByName();
	                   break;
			           
			case "4" : HMI.removeStudent();
			           break;
				
			case "5" : HMI.addTeacher();
			           break;
			           
			case "6" : HMI.PrintAllTeachers();
	                   break;
	                   
			case "7" : HMI.findTeacherByName();
                       break;
			}
		}while(!action.equals("8"));
	}
	
	private static School createSchool() {
		School school=new School();
		school.setName("EXCELLENCE SCHOOL");
		school.setAddress("********,MOROCCO");
		school.setPhoneNumber("05...");
		HMI.schoolservices=new Schoolservices(school);
		return school;
	}
	
	private static void addStudent() {
		Scanner scanner = new Scanner(System.in);
		Student student = new Student();
        System.out.println("Please enter the student's name");
        student.setName(scanner.next());
        System.out.println("Please enter the student's age");
        student.setAge(scanner.nextInt());
        System.out.println("Please enter the student's parent phone number");
        student.setParentPhoneNumber(scanner.next());
        HMI.schoolservices.addStudent(student);
	}
	
	private static void PrintAllStudents() {
		for(Student student: HMI.schoolservices.getSchool().getStudents()) {
		       System.out.println(student.getData());
	    }
	}
	
	private static void addTeacher() {
		Scanner scanner = new Scanner(System.in);
		Teacher teacher = new Teacher();
        System.out.println("Please enter the teacher's name");
        teacher.setName(scanner.next());
        System.out.println("Please enter the teacher's age");
        teacher.setAge(scanner.nextInt());
        System.out.println("Please enter the teacher's salary");
        teacher.setSalary(scanner.nextFloat());
        HMI.schoolservices.addTeacher(teacher);
	}
	
	private static void PrintAllTeachers() {
		for(Teacher teacher: HMI.schoolservices.getSchool().getTeachers()) {
		       System.out.println(teacher.getData());
	    }
	}
	
	private static Student findStudentByName() {
		Scanner reader=new Scanner(System.in);
		System.out.println("Please enter the name of the student you are looking for");
		String name=reader.next();
		Student student = HMI.schoolservices.getStudentByName(name);
		
		return student;
	}
	
	private static Teacher findTeacherByName() {
		Scanner reader=new Scanner(System.in);
		System.out.println("Please enter the name of the teacher you are looking for");
		String name=reader.next();
		Teacher teacher = HMI.schoolservices.getTeacherByName(name);
		
		return teacher;
	}
	
	private static void printDataStudent(Student student) {
		if(student==null) {
			System.out.println("We can't find this student!!");
		}
		else {
			System.out.println(student.getData());
		}
	}
	
	private static void printDataTeacher(Teacher teacher) {
		if(teacher==null) {
			System.out.println("We can't find this teacher!!");
		}
		else {
			System.out.println(teacher.getData());
		}
	}
	
	private static void removeStudent() {
		Student student = HMI.findStudentByName();
		HMI.schoolservices.removeStudent(student);
	}
	
	private static void removeTeacher() {
		Teacher teacher = HMI.findTeacherByName();
		HMI.schoolservices.removeTeacher(teacher);
	}
	
	
}
