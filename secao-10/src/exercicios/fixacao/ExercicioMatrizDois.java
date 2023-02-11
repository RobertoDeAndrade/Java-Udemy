package exercicios.fixacao;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioMatrizDois {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a quantidade de linhas: ");
		int m = sc.nextInt();
		System.out.print("Digite a quantidade de colunas: ");
		int n = sc.nextInt();

		Integer[][] mat = new Integer[m][n];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		//For somente para a matriz ficar visual
		for (int i = 0; i < mat.length; i++) {
			System.out.println();
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print(mat[i][j] + " ");
			}
		}

		System.out.print("\n\nDigite um número da matriz: ");
		int posicao = sc.nextInt();

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (posicao == mat[i][j]) {
					System.out.println("Position " + i + "," + j + ";");
					if (j > 0) {
						System.out.println("Esquerda: " + mat[i][j-1]);
					}
					if (j < mat[i].length-1) {
						System.out.println("Direita: " + mat[i][j+1]);
					}
					if (i > 0) {
						System.out.println("Cima: " + mat[i-1][j]);
					}
					if (i < mat[i].length-1) {
						System.out.println("Baixo: " + mat[i+1][j]);						
					}
				}
			}
			System.out.println();
		}

		sc.close();
	}

}
