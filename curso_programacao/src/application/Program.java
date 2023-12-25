package application;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		 LocalDateTime dataMoment = LocalDateTime.now();
	        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

		
		System.out.println("Enter client data: ");
		
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		String date = sc.nextLine();
		
		System.out.println("Enter order data: ");
		System.out.print("Status: ");
		String status = sc.nextLine();
		
		System.out.print("How many items to this order? ");
		int quantOfItems = sc.nextInt();
		
		
		for(int i = 1; i <= quantOfItems; i++ ) {
			System.out.println("Enter #" + i + " item data: ");
			System.out.print("Product name: ");
			String nameProduct = sc.next();
			
			System.out.println("Product price: ");
			Double priceItem = sc.nextDouble();
			
			System.out.println("Quantity");
			int quantity = sc.nextInt();
			
		}
		
		System.out.println();
		System.out.print("ORDER SUMMARY: ");
		System.out.println("Order moment: " + dataMoment.format(dateFormat));
		System.out.println("Order statud: " + status);
		System.out.println("Client: " + name + "(" + date + ") - " + email);
		
		sc.close();
		
	}

}
