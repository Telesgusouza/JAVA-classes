package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.User;

public class Program {

	public static void main(String[] args) {
		
		// D:\PROGRAMACAO\doc.txt
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre com o caminho do arquivo: ");
		String path = sc.nextLine();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();
			List<User> list = new ArrayList<User>();
			
			while (line != null) {
				String[] field = line.split(",");
				User user = new User(field[0], field[1], Double.parseDouble(field[2]));
				list.add(user);
				line = br.readLine();
			}
			
			Double sumOfSalaries = list.stream()
	                .filter(p -> p.getName().toUpperCase().charAt(0) == 'M')
	                .mapToDouble(User::getSalary)
	                .sum();
			
			/*List<Double> listSalaries = list.stream()
					.filter(p -> p.getName().toUpperCase().charAt(0) == 'M')
					.map(p -> p.getSalary())
					.collect(Collectors.toList());*/
			
			Double sumOfSalaries2 = list.stream()
					.filter(p -> p.getName().toUpperCase().charAt(0) == 'M')
					.map(p -> p.getSalary())
					.reduce(0.0, (x, y) -> x+y);
					//.collect(Collectors.toList());

	        System.out.println("Soma dos salários das pessoas com nome começando em M: " + sumOfSalaries2);
	        System.out.println("Soma dos salários das pessoas com nome começando em M: " + sumOfSalaries);
			
			
	        
		} catch (IOException e) {
			System.out.println("Error " + e.getMessage());
		}
		
		sc.close();
	}

}
