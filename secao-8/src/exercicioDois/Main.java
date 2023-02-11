package exercicioDois;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee e = new Employee();

		System.out.print("Name: ");
		e.setName(sc.nextLine());
		System.out.print("Gross salary: ");
		e.setGrossSalary(sc.nextDouble());
		System.out.print("Tax: ");
		e.setTax(sc.nextDouble());
		
		System.out.printf("\nEmployee: %s, $ %.2f", e.getName(), e.netSalary());
		
		System.out.print("\n\nWich percentage to increase salary? ");
		e.increaseSalary(sc.nextDouble());
		
		System.out.printf("\nUpdate data: %s, $ %.2f", e.getName(), e.getGrossSalary());
		
		sc.close();
	}
}
