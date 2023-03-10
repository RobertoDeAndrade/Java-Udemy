package exercicios.fixacao;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;



public class ProblemaPensionato {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Student[] rooms = new Student[10];

		System.out.print("How many rooms will be rented? ");
		int students = sc.nextInt();

		for (int i = 1; i <= students; i++) {
			sc.nextLine();
			System.out.println("\nRent #" + i + ":");
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			//Student student = new Student(name, email, room);
			rooms[room] = new Student(name, email);
		}
		
		System.out.println("\nBusy rooms:");
		for (int i = 0; i < rooms.length; i++) {
			if (rooms[i] != null) {
				System.out.println(i + ": " + rooms[i].getName() + ", " + rooms[i].getEmail());
			}
		}

		sc.close();
	}
}
