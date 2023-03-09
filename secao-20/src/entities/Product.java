package entities;

public class Product {

	private String name;
	private Double price;

	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	// Example 2
	public static boolean staticProductPredicate(Product p) {
		return p.getPrice() >= 100.0;
	}

	// Example 2
	public boolean nonStaticProductPredicate() {
		return price >= 100.0;
	}

	// Example 3
	public static void staticPriceUpdate(Product p) {
		p.setPrice(p.getPrice() * 1.1);
	}

	// Example 3
	public void nonStaticPriceUpdate() {
		price += price * 0.1;
	}
	
	// Example 4
	public static String staticUpperCaseName(Product p) {
		return p.getName().toUpperCase();
	}

	// Example 4
	public String nonStaticUpperCaseName() {
		return name.toUpperCase();
	}

	@Override
	public String toString() {
		return name + ", " + String.format("%.2f", price);
	}

}
