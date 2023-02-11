package ExercicioTres;

public class Student {
	
	String nome;
	double notaUm;
	double notaDois;
	double notaTres;
	double notaFinal;
	
	public void somar() {
		 notaFinal = (this.notaUm + this.notaDois + this.notaTres) / 3;
		 if (notaFinal >= 60.00) {
			 System.out.println("\nFINAL GRADE = " + String.format("%.2f", notaFinal) 
			 + "\nPASS");
		 } else {
			 double pontosFaltantes = 60.0 - notaFinal;
			 System.out.printf("\nFINAL GRADE = " + String.format("%.2f", notaFinal) 
			 + "\nFAILED" 
			 + "\nMISSING " + String.format("%.2f", pontosFaltantes) + " POINTS");
		 }
	}
}
