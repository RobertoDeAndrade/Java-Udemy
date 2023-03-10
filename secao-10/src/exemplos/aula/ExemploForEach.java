package exemplos.aula;

import java.util.Locale;
import java.util.Scanner;

public class ExemploForEach {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String[] vect = new String[] {"Maria", "Bob", "Alex"};
		
		for (int i = 0; i < vect.length; i++) {
			System.out.println(vect[i]);
		}
		
		System.out.println("----------------");
		for (String apelido : vect) {
			System.out.println(apelido);
		}

		sc.close();
	}

}
