package bankaccountapp;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {

	public static void main(String[] args) {
		List<Account> accounts = new LinkedList<Account>();
		
		/*
		Checking chckacc1 = new Checking("Ramya M","123456789",1500);
		Savings saveacc1 = new Savings("Pandu M","987654321",2000);
		chckacc1.showInfo();
		
		System.out.println("-------------");
		saveacc1.showInfo();
		*/

		//Read a CSV file then create new accounts based on that data
		String file = "C:\\Users\\19083\\Documents\\NewBankAccounts.txt";
		List<String[]> newAccountHolders = utilities.CSV.read(file);
		for (String[] accountHolder : newAccountHolders) {
			String name = accountHolder[0];
			String ssn = accountHolder[1];
			String accountType = accountHolder[2];
			double initDeposit = Double.parseDouble(accountHolder[3]);
			//System.out.println(name + " " + ssn + " " + accountType + " " + "$" + initDeposit);
			if (accountType.equals("Savings")) {
				accounts.add(new Savings(name,ssn,initDeposit));
			}
			else if (accountType.equals("Checking")) {
				accounts.add(new Checking(name,ssn,initDeposit));
			}
			else {
				System.out.println("Error reading, Account Type");
			}
		}
		for (Account acc : accounts)
		{
			System.out.println("\n**************");
			acc.showInfo();
		}
	}

}
