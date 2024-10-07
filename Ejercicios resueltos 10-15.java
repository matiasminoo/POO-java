package nashe;

import java.util.Scanner;
import java.util.Random;

public class anashe {
	public static void main(String[] args) {
		Scanner scanner =  new Scanner(System.in);
		
		System.out.println("A que ejercicio quiere acceder?");
    	System.out.println("Ejercicio 11");
    	System.out.println("Ejercicio 12");
    	System.out.println("Ejercicio 13");
    	System.out.println("Ejercicio 14");
    	System.out.println("Ejercicio 15");
    	int opcion = scanner.nextInt();
    	
    	switch(opcion) {
    	case 11:
    		ej11();
    		break;
    	case 12:
    		ej12();
    		break;
    	case 13:
    		ej13();
    		break;
    	case 14:
    		ej14();
    		break;
    	case 15:
    		ej15();
    		break;
    	}
	}
	
	public static void ej11() {
		for(int i = 0; i < 100; i++) {
			System.out.println(i + 1);
		}
	}
	
	public static void ej12() {
		for(int i = 1; i < 100; i++) {
			if(i % 2 == 0 && i % 3 == 0) {
				System.out.println(i);
			}
		}
	}
	
	public static void ej13() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese la cantidad de ventas:");
		int nVentas = scanner.nextInt();
		int sumaVentas = 0;
		
		for(int i = 0; i < nVentas; i++) {
			System.out.println("Introduzca el precio de la venta: " + (i+1));
			int venta = scanner.nextInt();
			
			sumaVentas += venta;
		}
		System.out.println(sumaVentas);
		scanner.close();
	}
	
	public static void ej14() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese a, b y c (en ese orden):");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		scanner.close();
		
		double discriminante=Math.pow(b, 2)-(4*a*c);
		System.out.println(">> "+discriminante);
	}
	
	public static void ej15() {
		Scanner scanner = new Scanner(System.in);
		int a;
		do {
			System.out.println("Ingrese un numero mayor o igual a cero:");
			a = scanner.nextInt();
		}while (a <= 0);
		scanner.close();
		System.out.println(a);
			
		
	}
}
