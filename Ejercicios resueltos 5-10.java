package nashe;

import java.util.Scanner;
import java.util.Random;

public class anashe {
	public static void main(String[] args) {
		Scanner scanner =  new Scanner(System.in);
		
		System.out.println("A que ejercicio quiere acceder?");
    	System.out.println("Ejercicio 6");
    	System.out.println("Ejercicio 7");
    	System.out.println("Ejercicio 8");
    	System.out.println("Ejercicio 9");
    	System.out.println("Ejercicio 10");
    	int opcion = scanner.nextInt();
    	
    	switch(opcion) {
    	case 6:
    		ej6();
    		break;
    	case 7:
    		ej7();
    		break;
    	case 8:
    		ej8();
    		break;
    	case 9:
    		ej9();
    		break;
    	case 10:
    		ej10();
    		break;
    	}
	}
	
	public static void ej6() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingresa un numero:");
		int num = scanner.nextInt();
		scanner.close();
		
		if (num % 2 == 0) {
			System.out.println("El numero que ingresaste es divisible por 2");
		}else {
			System.out.println("El numero que ingresaste no es divisible por 2");
		}
	}
	
	public static void ej7() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingresa un numero:");
		int num = scanner.nextInt();
		char ASCII = (char) num;
		scanner.close();
		
		System.out.println("El valor ingresado correspode a " + ASCII + " en la tabla ASCII");
	}
	
	public static void ej8() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese un caracter:");
		char caracter = scanner.next().charAt(0);
		int nashe = (int) caracter;
		scanner.close();
		
		System.out.println("El codigo ASCII es " + nashe);
	}
	
	public static void ej9() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingresa el precio del producto:");
		Double precio = scanner.nextDouble();
		scanner.close();
		Double IVA = 1.21;
		
		Double precioT = precio * IVA;
		System.out.println("El precio final con el IVA aplicado es de " + precioT);
	}
	
	public static void ej10() {
		int a = 1;
		
		while(a <= 100) {
			System.out.println(a);
			a++;
			
		}
	}
}
