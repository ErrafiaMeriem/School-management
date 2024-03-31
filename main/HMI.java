package main;

import java.util.Scanner;

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
			System.out.println("Hi sir/lady , what do you want to do?? \n 1.add a student \n 2.Print all the students \n 3.add a teacher"
					+ " \n 4.Print all the teachers");
			action=scanner.next();
			switch (action) {
			case "1" : HMI.addStudent();
			           break;
			           
			case "2" : HMI.PrintAllStudents();
			           break;
			           
			case "3" : HMI.addTeacher();
			           break;
			           
			case "4" : HMI.PrintAllTeachers();
	           break;
			}
		}while(!action.equals("exit"));
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
	
}
