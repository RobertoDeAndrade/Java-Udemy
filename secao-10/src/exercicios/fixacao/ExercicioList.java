package exercicios.fixacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class ExercicioList {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Employee> list = new ArrayList<>();

		System.out.print("How many employees wiil be registered? ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("\nEmployee #" + (i + 1) + ":");
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			sc.nextLine();
			System.out.print("Name: ");
			String nome = sc.nextLine();
			System.out.print("Salary: ");
			Double salario = sc.nextDouble();
			list.add(new Employee(id, nome, salario));
		}

		System.out.print("\nEnter the employee id that will have salary increase: ");
		int id = sc.nextInt();
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);

		if (emp == null) {
			System.out.println("This id is not exist");
		} else {
			System.out.print("Enter the percentage: ");
			Double percentage = sc.nextDouble();
			emp.salaryIncrease(percentage);
		}

		System.out.println("\nList of employees:");
		for (Employee x : list) {
			System.out.println(x);
		}

		sc.close();
	}

}
