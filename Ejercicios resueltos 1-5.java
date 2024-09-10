package nashe;

import java.util.Scanner;
import java.util.Random;



public class main {
	    public static void main(String[] args) {
	    	Scanner scanner = new Scanner(System.in);
	    	
	    	System.out.println("A que ejercicio quiere acceder?");
	    	System.out.println("Ejercicio 1");
	    	System.out.println("Ejercicio 2");
	    	System.out.println("Ejercicio 3");
	    	System.out.println("Ejercicio 4");
	    	System.out.println("Ejercicio 5");
	    	int opcion = scanner.nextInt();
	    	
	    	switch(opcion) {
	    	case 1:
	    		ej1();
	    		break;
	    		
	    	case 2:
	    		ej2();
	    		break;
	    		
	    	case 3:
	    		ej3();
	    		break;
	    		
	    	case 4:
	    		ej4();
	    		break;
	    		
	    	case 5: 
	    		ej5();
	    		break;
	    	}
	       
	    }
	    
	    public static void ej1() {
	    	  int a = 8;
		      int b = 6;
		      System.out.println("A: " + a);
		      System.out.println("B: " + b);
		      
		      int suma = a + b;
		      int resta = a - b;
		      int multiplicacion= a * b;
		      int division = a / b;
		      int modulo = a % b;
		      
		      System.out.println("Suma: " + suma);
		      System.out.println("Resta: " + resta);
		      System.out.println("Multiplicacion: " + multiplicacion);
		      System.out.println("Division: " + division);
		      System.out.println("Modulo: " + modulo);
		      
		      System.out.println("Termino el programa...");
	    }
	    public static void ej2() {
	    	int a = 7;
	    	int b = 7;
	    	
	    	System.out.println("a: " + a);
	    	System.out.println("b: " + b);
	    	
	    	if (a > b) {
	    		System.out.println("a es mayor que b");
	    		
	    	}else if (a == b) {
	    		System.out.println("Los numeros son iguales");
	    	}
	    	else {
	    		System.out.println("b es mayor que a");
	    	}
	    }
	    public static void ej3() {
	    	String nombre = "Mati";
	    	System.out.println("Bienvenido " + nombre);
	    }
	    public static void ej4() {
	    	Scanner scanner = new Scanner(System.in);
	    	System.out.println("Ingresa tu nombre:");
	    	String nombre = scanner.nextLine();
	    	scanner.close();
	    	
	    	System.out.println("Bienvenido " + nombre);
	    }
	    public static void ej5() {
	    	Scanner scanner = new Scanner(System.in);
	    	System.out.println("Ingrese el radio de su circulo: ");
	    	double r = scanner.nextDouble();
	    	scanner.close();
	    	double pi = 3.14;
	    	double radioCuadrado = Math.pow(r, 2);
	    	double area = pi * radioCuadrado;
	    	System.out.println("El area de su circulo es de: " + area);
	    }
	    
	}
