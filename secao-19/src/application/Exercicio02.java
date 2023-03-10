package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.Student;

public class Exercicio02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Set<Student> set = new HashSet<>();
		
		System.out.print("How many students for course A? ");
		int a = sc.nextInt();
		for (int i = 0; i < a; i++) {
			set.add(new Student(sc.nextInt()));
		}
		
		System.out.print("How many students for course B? ");
		int b = sc.nextInt();
		for (int i = 0; i < b; i++) {
			set.add(new Student(sc.nextInt()));
		}
		
		System.out.print("How many students for course C? ");
		int c = sc.nextInt();
		for (int i = 0; i < c; i++) {
			set.add(new Student(sc.nextInt()));
		}
		
		System.out.println("Total of students: " + set.size());
		
		sc.close();

	}

}
