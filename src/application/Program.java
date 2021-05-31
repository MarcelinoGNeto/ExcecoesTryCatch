package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

	method1();	
	System.out.println("End of program");
	}
	
	public static void method1() {
		System.out.println("***METHOD1 START***");		
		method2();
		System.out.println("***METHOD2 START***");
	}
	
	public static void method2() {
		System.out.println("***METHOD2 START***");
		Scanner sc = new Scanner(System.in);
		try { 
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid position!");
			e.printStackTrace(); //fun��o usada para rastrear a sequ�ncia de chamadas que gerou a exce��o (erro)
			sc.next();//usado para aguardar comando enquanto se observa a exce��o
		}
		catch (InputMismatchException e) {
			System.out.println("Input error");
			e.printStackTrace();//fun��o usada para rastrear a sequ�ncia de chamadas que gerou a exce��o (erro)
			sc.next();//usado para aguardar comando enquanto se observa a exce��o
		}
		sc.close();	
		System.out.println("***METHOD2 END***");
	}

}
