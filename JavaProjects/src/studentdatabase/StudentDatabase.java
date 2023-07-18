package studentdatabase;

import java.util.Scanner;

public class StudentDatabase {

	public static void main(String[] args) {
		// TODO Auto-generated method student
		
		//Ask  how many new students we want to add
		System.out.println("Enter number of students to enroll: ");
		Scanner in = new Scanner(System.in);
		int numOfStudents = in.nextInt();
		Student[] students = new Student[numOfStudents];
		
		//Create n number of students
		for (int n=0; n<numOfStudents; n++) {
			students[n] = new Student();
			students[n].enroll();
			students[n].payTuition();
			System.out.println(students[n].toString());

		} 
		for (int n=0; n<numOfStudents; n++) {
			System.out.println(students[n].toString());
		}


	}

}
