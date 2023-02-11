package exercicioUm;

public class Rectangle {

	private double width;
	private double height;

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	//Metodos
	public double area() {
		double area = this.width * this.height;
		return area;
	}
	
	public double perimeter() {
		double perimeter = 2 * (this.width + this.height);
		return perimeter;
	}
	
	public double diagonal() {
		double diagonal = Math.sqrt((Math.pow(this.width, 2) + Math.pow(this.height, 2)));
		return diagonal;
	}
	
	public String toString() {
		return "Area = "
				+ String.format("%.2f", area())
				+ "\n"
				+ "Perimeter = "
				+ String.format("%.2f", perimeter())
				+ "\n"
				+ "Diagonal = "
				+ String.format("%.2f", diagonal());
	}
}
