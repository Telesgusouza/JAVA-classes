package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import entities.ItemCar;

public class Program {

	public static void main(String[] args) {

		// D:\\PROGRAMACAO\\ProgramcaoNoWindows\\aula_java\\listitems.txt
		// \\summary.txt

		File path = new File("D:\\PROGRAMACAO\\ProgramcaoNoWindows\\aula_java\\listitems.txt");

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			boolean pathSummary = new File(path.getParent() + "\\out").mkdir();
			File fileSummary = new File(path.getParent() + "\\out\\summary.txt");

			try (BufferedWriter bw = new BufferedWriter(
					new FileWriter(new File(path.getParent() + "\\out\\summary.txt"), true))) {
				String line = br.readLine();

				while (line != null) {
					ItemCar itemcar = new ItemCar(line.split(",")[0], Double.parseDouble(line.split(",")[1]),
							Integer.parseInt(line.split(",")[2]));
					bw.write(itemcar.toString());
					bw.newLine();
					line = br.readLine();
				}

			} catch (IOException e) {
				System.out.println("Error: " + e.getMessage());
			}

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

}
