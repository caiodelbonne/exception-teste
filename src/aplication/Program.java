package aplication;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		method1();
		System.out.println("End of program");
	}

	public static void method1() {
		System.out.println("* * *  Method 1 start *** ");
		method2();
		System.out.println("* * *  Method 1 End *** ");
	}
	
	public static void method2() {
		System.out.println("* * *  Method 2 start *** ");
		
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter names");
			String[] vec = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vec[position]);
		} catch (ArrayIndexOutOfBoundsException e) { // valor fora do limite array
			System.out.println("invalid position ! ");
			e.printStackTrace();// mostra o caminho dos erros MAS NAO FINALIZA O PROGRAM
			sc.next(); // aguarda um comando p continuar 
		} catch (InputMismatchException e) { // valor invalido do inteiro
			System.out.println("input error");
		}

		System.out.println("* * *  Method 2 End*** ");

		sc.close();
	}
}
