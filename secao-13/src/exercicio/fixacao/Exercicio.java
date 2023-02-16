package exercicio.fixacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.enums.OrderStatus;
import entities.exercicio.Client;
import entities.exercicio.Order;
import entities.exercicio.OrderItem;
import entities.exercicio.Product;

public class Exercicio {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Enter client data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(sc.next());
		
		Client client = new Client(name, email, birthDate);
		
		System.out.println("Enter order data:");
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(sc.next());
		
		Order order = new Order(new Date(), status, client); 
		
		System.out.print("How many items to this order? ");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Enter #" + (i + 1) + " item data: ");
			System.out.print("Product name: ");
			sc.nextLine();
			String productName = sc.nextLine();
			
			System.out.print("Product price: ");
			double productPrice = sc.nextDouble();
			
			System.out.print("Quantity: ");
			int quantity = sc.nextInt();

			Product product = new Product(productName, productPrice);
			
			OrderItem oi = new OrderItem(quantity, productPrice, product); 

			order.addItem(oi);
		}
		
		System.out.println();
		System.out.println(order);

		sc.close();

	}

}
