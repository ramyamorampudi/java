package bankaccountapp;

public class Checking extends Account{
	//list properties of checking account
	private int debitCardNumber;
	private int debitCardPin;
	
	//Constructor to initialize checking account properties
	public Checking(String name, String ssn, double initDeposit) {
		super(name, ssn, initDeposit);
		accountNumber = "2" + accountNumber;
		setDebitCard();
	}
	@Override
	public void setRate() {
		 rate = getBaseRate() * .15;
	}
	private void setDebitCard() {
		debitCardNumber = (int)(Math.random() * Math.pow(10,12));
		debitCardPin = (int)(Math.random() * Math.pow(10,4));
	}
	public void showInfo() {
		System.out.println("Account Type: Checking");
		super.showInfo();
		System.out.println(
				"Debit card features:" + 
				"\nDebit Card Number is : " + debitCardNumber +
				"\nDebit Card Pin: " + debitCardPin 
				);
	}
	//list methods specific to checking account
	
}
 