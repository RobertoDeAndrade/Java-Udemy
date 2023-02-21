package exemplo.aula;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExemploTryCatch {

	public static void main(String[] args) {
		
		metodo1();

		System.out.println("Fim do programa");

	}
	
	public static void metodo1() {
		
		System.out.println("-----Início do metodo1-----");
		metodo2();
		System.out.println("-----Fim do metodo1-----");
		
	}

	public static void metodo2() {
		
		System.out.println("-----Início do metodo2-----");
		Scanner sc = new Scanner(System.in);

		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		} 
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Posição inválida!");
			e.printStackTrace();
			sc.next();
		} 
		catch (InputMismatchException e) {
			System.out.println("Entrada inválida!");
		}
		
		System.out.println("-----Fim do metodo2-----");
		sc.close();
		
	}

}
