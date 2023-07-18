package emailapp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int mailboxCapacity = 500;
	private int defaultPasswordLength;
	private String companySuffix = "aeycompany.com";
	private String alternateEmail;
	
	
	//constructor to receive the first name and last name
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		
		//call a method asking for the department = return the department
		this.department = setDepartment();
		
		//call a method that returns the random password
		this.password = randomPassword(8);
		
		//combine elements to generate email
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
	}
	//Ask for the department
	private String setDepartment() {
		System.out.println("New Worker:" + firstName + "\nDepartment Codes: \n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter Department Code: ");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		if (depChoice == 1) { 
			return "sales"; 
			}
		else if (depChoice == 2) { 
			return "dev"; 
			}
		else if (depChoice == 3) { 
			return "acct"; 
			}
		else {
			return "";
			}
	}
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYA0123456789$%^&*";
		char[] password = new char[length];
		for(int i=0;i<length;i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}
	public void changePassword(String password) {
		this.password = password;
	}
	public int getMailboxCapacity() { return mailboxCapacity; }
	public String getAlternateEmail() { return alternateEmail; }
	public String getPassword() { return password; }
	
	public String showInfo() {
		return "Display Name: " + firstName + "" + lastName + 
				"\nCompany Email: " + email + 
				"\nMaiboxCapacity: " + mailboxCapacity + "mb";
	}
}
