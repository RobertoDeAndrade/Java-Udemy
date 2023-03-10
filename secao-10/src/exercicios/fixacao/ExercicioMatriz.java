package exercicios.fixacao;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioMatriz {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input:");
		int n = sc.nextInt();
		
		int[][] mat = new int[n][n];
		int cont = 0;
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println();
		for (int i = 0; i < mat.length; i++) {
			System.out.println();
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print(mat[i][j] + " ");
			}
		}
		
		System.out.println("\n\nOutput:");
		System.out.println("Main diagonal:");
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (i == j) {
					System.out.print(mat[i][j] + " ");
				}
				if (mat[i][j] < 0) {
					cont++;
				}
			}
		}
		
		System.out.print("\nNegative numbers = " + cont);
		
		sc.close();
	}

}
