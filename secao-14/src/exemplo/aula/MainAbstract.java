package exemplo.aula;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.exemplo.aula.Account;
import entities.exemplo.aula.BusinessAccount;
import entities.exemplo.aula.SavingsAccount;

public class MainAbstract {

	public static void main(String[] args) {

		// Códigos realizados com a classe Account como abstract

		Locale.setDefault(Locale.US);

		List<Account> list = new ArrayList<>();

		list.add(new SavingsAccount(1001, "Alex", 500.0, 0.01));
		list.add(new BusinessAccount(1002, "Maria", 1000.0, 400.0));
		list.add(new SavingsAccount(1003, "Bob", 300.00, 0.01));
		list.add(new BusinessAccount(1004, "Anna", 500.00, 500.0));

		double sum = 0;
		for (Account acc : list) {
			sum += acc.getBalance();
		}

		System.out.printf("Total balance: %.2f%n", sum);

		for (Account acc : list) {
			acc.deposit(10.0);
		}

		for (Account acc : list) {
			System.out.printf("Update balance for account %d: $%.2f%n", acc.getNumber(), acc.getBalance());
		}

	}
}
