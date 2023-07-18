package bankaccountapp;

public class Savings extends Account{
	//List properties of Savings account
	private int safetyDepositBoxId;
	private int safetyDepositBoxKey;
	
	//Constructor to initialize settings for savings account
	public Savings(String name, String ssn, double initDeposit) {
		super(name, ssn, initDeposit);
		accountNumber = "1" + accountNumber;
		setSafetyDepositBox();
	}
	@Override
	public void setRate() {
		 rate = getBaseRate() - .25;
	}
	private void setSafetyDepositBox() {
		safetyDepositBoxId = (int) (Math.random() * Math.pow(10, 3));
		safetyDepositBoxKey = (int) (Math.random() * Math.pow(10, 4));
	}

	//list all methods specific to savings account
	public void showInfo() {
		System.out.println("Account Type: Savings");
		super.showInfo();
		System.out.println(
				"Your Savings account feature:"+
				"\nSafety Deposit Box Id: " + safetyDepositBoxId +
				"\nSafety Deposit Box Key: " + safetyDepositBoxKey
				);
		}
	
}