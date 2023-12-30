package application;

import java.util.Scanner;

import model.Account;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {

			System.out.println("Insira os dados da conta");
			System.out.print("Número: ");
			Integer numberAccount = sc.nextInt();
			
			System.out.print("Titular: ");
			sc.nextLine();
			String holder = sc.nextLine();
			
			System.out.print("Saldo inicial: ");
			Double initialBalance = sc.nextDouble();
			
			System.out.print("Limite de saque: ");
			Double withdrawLimit = sc.nextDouble();
			
			Account account = new Account(numberAccount, holder, initialBalance, withdrawLimit);
			
			System.out.println();
			System.out.println("Entre com o valor de saque: ");
			Double withdraw = sc.nextDouble();
			account.withdrawAccount(withdraw);
			
			System.out.println("restannte na conta: " + account.getInitialBalance());
				
		} catch( RuntimeException e) {
			System.out.println("error " + e.getMessage());
		}
		
		sc.close();
	}

}
