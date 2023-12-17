package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter product data: ");
		
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		int quantity = sc.nextInt();
		Product product = new Product(name, price, quantity);
		
		product.setName("só no Compiuter filhão");
		System.out.println("produto: " + product.getName());
		
		System.out.println("Product data: "+ product.toString());
		
		System.out.println("");
		System.out.print("adicione produto: ");
		quantity = sc.nextInt();
		product.addProducts(quantity);
		System.out.println("Product data: "+ product.toString());
		
		System.out.println("");
		System.out.println("remove uma quantidade de produtos do estoque");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		System.out.println("Product data: "+ product.toString());
		
		sc.close();
	}

}
