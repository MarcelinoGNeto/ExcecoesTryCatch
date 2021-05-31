package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		// BLOCO FINALLY: É um bloco que contém código a ser executado independetemente de ter ocorrigo ou não a exceção
		
		File file = new File("C:\\temp\\ws-eclipse\\ExcecoesTryCatch\\in.txt");
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}
		catch (FileNotFoundException e) {
			System.out.println("Error opening file: " + e.getMessage());
		}
		finally {
			if (sc != null) {
				sc.close();
			}
		}

	}

}
