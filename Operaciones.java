package problema5;

import java.util.Scanner;


public class Operaciones implements menu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1;
		int num2;
		
		System.out.println("Ingrese el primer numero");
		num1 = sc.nextInt();
		System.out.println("Ingrese el segundo numero");
		num2 = sc.nextInt();
		
		System.out.println("Suma " + menu.Suma(num1, num2));
		System.out.println("Resta " + menu.Resta(num1, num2));
		System.out.println("Multiplicacion " + menu.Multiplicacion(num1, num2));
		System.out.println("Division " + menu.Division(num1, num2));
	}
	

	}