import java.util.Scanner;

public class nashe {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int r = 0;
	        System.out.println("Elegi una opcion: ");
	        System.out.println("Suma");
	        System.out.println("Resta");
	        System.out.println("Multiplicacion");
	        System.out.println("Division");
	        
	        String opcion = scanner.nextLine();
	        
	        
	        if (opcion.equalsIgnoreCase("suma")) {
	        	System.out.println("Ingresa los dos numeros que queres sumar: ");
	        	int numero1 = scanner.nextInt();
	        	int numero2 = scanner.nextInt();
	        	scanner.close();
	        	r = numero1 + numero2;
	        	System.out.println("El resultado de la suma es: " + r);
	        }
	        else if (opcion.equalsIgnoreCase("resta")) {
	        	System.out.println("Ingresa los dos numeros que queres restar: ");
	        	int numero1 = scanner.nextInt();
	        	int numero2 = scanner.nextInt();
	        	scanner.close();
	        	r = numero1 - numero2;
	        	System.out.println("El resultado de la resta es: " + r);
	        }
	        else if (opcion.equalsIgnoreCase("multiplicacion")) {
	        	System.out.println("Ingresa los dos numeros que queres multiplicar: ");
	        	int numero1 = scanner.nextInt();
	        	int numero2 = scanner.nextInt();
	        	scanner.close();
	        	r = numero1 * numero2;
	        	System.out.println("El resultado de la multiplicacion es: " + r);
	        }
	        else {
	        	System.out.println("Ingresa los dos numeros que queres dividir: ");
	        	int numero1 = scanner.nextInt();
	        	int numero2 = scanner.nextInt();
	        	scanner.close();
	        	r = numero1 / numero2;
	        	System.out.println("El resultado de la division es: " + r);
	        }
	        
	        System.out.print("Termino el programa");
	    }
	}
