import java.util.Scanner;

public class nashe {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Elegi una opcion: ");
	        System.out.println("Suma");
	        System.out.println("Resta");
	        System.out.println("Multiplicacion");
	        System.out.println("Division");
	        
	        String opcion = scanner.nextLine();
	        scanner.close();
	        
	        if (opcion == "suma") {
	        	System.out.println("Ingresa los dos numeros que queres sumar: ");
	        	int numero1 = scanner.nextInt();
	        	int numero2 = scanner.nextInt();
	        }
	    }
	}


