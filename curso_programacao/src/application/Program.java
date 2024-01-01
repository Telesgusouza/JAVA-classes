package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {

		/*
		 * 
		 * FileRead (Stream de leitura de caracteres a partir de arquivos)
		 * 
		 * BufferedReader (mais rápido)
		 * 
		 * 
		 */

		// D:\\PROGRAMACAO\\ProgramcaoNoWindows\\aula_java\\in.txt

		String path = "D:\\PROGRAMACAO\\ProgramcaoNoWindows\\aula_java\\in.txt";
		FileReader fr = null;
		BufferedReader br = null;

		try {
			fr = new FileReader(path);
			br = new BufferedReader(fr);

			// lera uma linha do meu arquivo, se n ouver linhar retorna null
			String line = br.readLine();

			while (line != null) {
				System.out.println(line);
				// passar para a próxima linha
				line = br.readLine();
			}

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			// fechar a leitura de arquivos
			try {
				if (br != null) {
					br.close();
				}
				if (fr != null) {
					fr.close();
				}
			} catch (IOException e) {
				// ver o erro
				e.printStackTrace();
			}
		}
	}

}
