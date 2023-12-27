package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;


public class Program {
	
	/*
	 
	 
	 c - padrão zero meia
	 u - usado
	 i - importado
	  
	 
	 */

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Product> list = new ArrayList<Product>();
		
		System.out.print("Enter the number of products: ");
		int quantProducts = sc.nextInt();
		
		for(int i = 1; i <= quantProducts; i++) {
			System.out.println();
			System.out.println("Product #" + i + " data:");
			System.out.print("Common, used or imported (c/u/i): ");
			char productStatus = sc.next().charAt(0);
			
			System.out.print("Name: ");
			String name = sc.next();
			
			System.out.print("Price: ");
			Double price = sc.nextDouble();
			
			if(productStatus == 'u') {
				
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				String date = sc.next();
				list.add(new UsedProduct(name, price, date));
				
			} else if(productStatus == 'i') {
				
				System.out.print("Customs fee: ");
				Double customFee = sc.nextDouble();
				list.add(new ImportedProduct(name, price, customFee));
				
			} else if (productStatus == 'c') {
				list.add(new Product(name, price));
			}
		}
		
		System.out.println();
		System.out.println("PRICE TAGS: ");
		for (Product i : list) {
			System.out.println(i.priceTag());
		}
		
		sc.close();
	}

}
