package exemplo.aula;

import java.util.Locale;

import entities.exemplo.aula.Account;
import entities.exemplo.aula.BusinessAccount;
import entities.exemplo.aula.SavingsAccount;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Account acc = new Account(1001, "Alex", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

		// UPCASTING

		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
		Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);

		// DOWNCASTING

		System.out.println("Downcasting");
		BusinessAccount acc4 = (BusinessAccount) acc2; // Precisa fazer o casting manual
		acc4.loan(100.0);

		// BusinessAccount acc5 = (BusinessAccount)acc3;
		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount) acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
		}
		if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount) acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
		
		// OVERRIDE
		
		System.out.println("\n@Override");
		Account acc6 = new Account(1006, "Alex", 1000.0);
		acc6.withdraw(200.0);
		System.out.println(acc6.getBalance());
		
		Account acc7 = new SavingsAccount(1007, "Maria", 1000.0, 0.01);
		acc7.withdraw(200.0);
		System.out.println(acc7.getBalance());
		
		// SUPER
		
		System.out.println("\nSuper:");
		Account acc8 = new BusinessAccount(1008, "Bob", 1000.0, 500.0);
		acc8.withdraw(200);
		System.out.println(acc8.getBalance());
		
		// POLIMORFISMO
		
		System.out.println("\nPolimorfismo:");
		Account x = new Account(1020, "Alex", 1000.0);
		Account y = new SavingsAccount(1023, "Maria", 1000.0, 0.01);
		
		x.withdraw(50.0);
		y.withdraw(50.0);
		
		System.out.println(x.getBalance());
		System.out.println(y.getBalance());
		
	}

}
