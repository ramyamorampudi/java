package bankaccountapp;

public abstract class Account implements IBaseRate{
	//List common properties for both checking and savings account
	private String name;
	private String ssn;
	private double balance;
	private static int index = 10000;
	protected String accountNumber;
	protected double rate;
	
	//constructor to set base properties an d initialize the account
	public Account(String name, String ssn, double initDeposit) {
		this.name = name;
		this.ssn = ssn;
		balance = initDeposit;
		
		//Set Account Number
		index++;
		this.accountNumber = setAccountNumber();
		setRate();
	}
	public abstract void setRate();
	
	private String setAccountNumber() {
		String lastTwoOfSsn = ssn.substring(ssn.length() - 2, ssn.length());
		int uniqueId = index;
		int randomNumber = (int) ( Math.random() * Math.pow(10, 3));
		return lastTwoOfSsn + uniqueId + randomNumber;
	}
	public void compound() {
		double accruedInterest = balance * (rate/100);
		balance = balance + accruedInterest;
		System.out.println("Accrued Interest: $" + accruedInterest);
		printBalance();
	}
	//List common methods
	public void deposit(double amount) {
		balance = balance+amount;
		System.out.println("Depositing Amount: $"+ amount);
		printBalance();
	}
	public void withdraw(double amount) {
		balance = balance - amount;
		System.out.println("Withdrawing Amount: $"+ amount);
		printBalance();
	}
	public void transfer(String toWhere, double amount) {
		balance = balance - amount;
		System.out.println("Transfering $" + amount + " " + "to" + " " + toWhere);
		printBalance();
	}
	public void printBalance() {
		System.out.println("Your balance is now: $" + balance);
	}
	public void showInfo() {
		System.out.println(
				"Name: " + name + 
				"\nSSN: " + ssn + 
				"\nBalance: " + balance + 
				"\nAccount Number: " + accountNumber +
				"\nRate: " + rate + "%"
				);
	}
}
