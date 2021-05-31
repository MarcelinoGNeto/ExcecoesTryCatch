package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		// BLOCO FINALLY: � um bloco que cont�m c�digo a ser executado independetemente de ter ocorrigo ou n�o a exce��o
		
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
