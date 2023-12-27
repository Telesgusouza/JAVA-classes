package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entitites.Employee;
import entitites.OutsourceEmployee;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Employee> employees = new ArrayList<Employee>();
		
		System.out.print("Insira o número de funcionários: ");
		Integer countEmployee = sc.nextInt();
		
		for (int i = 1; i <= countEmployee; i++) {
			
			System.out.println("");
			System.out.println("Dados do funcionário #"+ i +": ");
			System.out.print("Terceirizado (s/n): ");
			char outsourced = sc.next().charAt(0);
			
			System.out.print("Nome: ");
			String name = sc.next();
			
			System.out.print("Horas: ");
			Integer workedHours = sc.nextInt();
			
			System.out.print("Valor hora: ");
			Double valuePerHour = sc.nextDouble();
			
			if (outsourced == 's') {
				System.out.print("Adicional de custo: ");
				Double additionalCharge = sc.nextDouble();
				
				OutsourceEmployee employee = new OutsourceEmployee(name, workedHours, valuePerHour, additionalCharge);
				employees.add(i - 1, employee);
			} else if(outsourced == 'n') {
				Employee employee = new Employee(name, workedHours, valuePerHour);
				employees.add(i - 1, employee);
			}
			
			// Employee employee = new Employee(name, workedHours, valuePerHour);
			// employees.add(i - 1, employee);
		}
		
		System.out.println();
		System.out.println("PAYMENTS: ");
		
		for(Employee i: employees) {
			System.out.println(i.getName() + " - $ " + i.payment());
		}
		
		sc.close();
	}

}
