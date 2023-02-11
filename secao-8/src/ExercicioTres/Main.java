package ExercicioTres;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student aluno = new Student();
		
		System.out.print("Name: ");
		aluno.nome = sc.nextLine();
		System.out.print("Grade 1: ");
		aluno.notaUm = sc.nextDouble();
		System.out.print("Grade 2: ");
		aluno.notaDois = sc.nextDouble();
		System.out.print("Grade 3: ");
		aluno.notaTres = sc.nextDouble();
		
		aluno.somar();
		
		sc.close();
	}

}
