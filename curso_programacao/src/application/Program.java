package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		// acesso ao arquivo e ao caminho dele
		// File file = new File("D:\\PROGRAMACAO\\ino.txt");
		File file = new File("D:\\PROGRAMACAO\\ProgramcaoNoWindows\\aula_java\\in.txt");
		Scanner sc = null;
		
		try {
			sc = new Scanner(file);

			// sc.hasNextLine() verifica se ainda tem linha no arquivo
			while (sc.hasNextLine()) {

				// aqui ele ira ler a linha do arquivo
				System.out.println(sc.nextLine());
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			if (sc != null) {
				sc.close();
			}
		}

	}

}
