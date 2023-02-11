package exercicioDois;

public class Employee {

	private String name;
	private double grossSalary;
	private double tax;
	
	//get e set
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getGrossSalary() {
		return grossSalary;
	}
	public void setGrossSalary(double grossSalary) {
		this.grossSalary = grossSalary;
	}
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	
	//Metodos
	public double netSalary() {
		return this.grossSalary - this.tax;
	}
	
	public void increaseSalary(double percentage) {
		double p = (percentage / 100) * this.grossSalary ;
		this.grossSalary += p - this.tax;
	}
}
