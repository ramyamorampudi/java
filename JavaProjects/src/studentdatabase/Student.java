package studentdatabase;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses = "";
	private int tuitionBalance = 0;
	private static int costOfCourse = 600;
	private static int id =1000;
	
	//constructor for student's name and grade year
	public Student() {
	Scanner in = new Scanner(System.in);
	System.out.print("Enter first name: ");
	this.firstName = in.nextLine();
	
	System.out.print("Enter last name: ");
	this.lastName = in.nextLine();
	
	System.out.print("1. Freshman\n2.Sophmore\n3. Junior\n4. Senior\nEnter class level: ");
	this.gradeYear = in.nextInt();
	
	setStudentID();
	System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentID);
	
	}
	//generate an ID 
	private void setStudentID() {
		//Grade Level + ID
		id++;
		this.studentID = gradeYear + "" + id;
	}
	//enroll courses
	public void enroll() {
		//get inside a loop, user hits 0
		do {
			System.out.print("Enter course to enroll(Q to quit):");
			Scanner in = new Scanner(System.in);
			String course = in.nextLine();
			if (!course.equals("Q")) {
				courses = courses + "\n" + course;
				tuitionBalance = tuitionBalance + costOfCourse;
			}
			else
			{
				break;
			}
		}
		while (1!=0);
		System.out.println("Enrolled in: " + courses);
		System.out.println("Tuition Balance: " + tuitionBalance);
	}
	//view balance
	public void viewBalance() {
		System.out.println("Your balance is : $"+tuitionBalance);
	}
	//pay tuition
	public void payTuition() {
		System.out.print("Enter payment: $");
		Scanner in = new Scanner(System.in);
		int payment = in.nextInt();
		tuitionBalance = tuitionBalance - payment;
		System.out.println("Thank you for the payment: $"+payment);
		viewBalance();
	}
	//show status
	public String toString() {
		return "Name: " + firstName + " " + lastName +
				"\nCourses Enrolled: " + courses +
				"\nBalance is: $" + tuitionBalance; 
	}
}
