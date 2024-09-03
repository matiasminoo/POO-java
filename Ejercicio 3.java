import java.util.Scanner;

public class nashe {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int num;

	        // Pedir números al usuario hasta que se introduzca uno que sea mayor a 100 y primo
	        do {
	            System.out.print("Introduce un número: ");
	            num = scanner.nextInt();
	        } while (!isPrime(num) || num <= 100);

	        System.out.println(num + " es mayor a 100 y primo.");

	        // Cerrar el escáner
	        scanner.close();
	    }

	    // Método para comprobar si un número es primo
	    public static boolean isPrime(int num) {
	        if (num <= 1) {
	            return false;
	        }
	        if (num <= 3) {
	            return true;
	        }
	        if (num % 2 == 0 || num % 3 == 0) {
	            return false;
	        }
	        for (int i = 5; i * i <= num; i += 6) {
	            if (num % i == 0 || num % (i + 2) == 0) {
	                return false;
	            }
	        }
	        return true;
	    }
	}

}
