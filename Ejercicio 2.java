public class nashe {
    public static void main(String[] args) {
        for (int num = 50; num <= 100; num++) {
            if (isPrime(num)) {
                System.out.println(num + " es primo");
            } else {
                System.out.print(num + " no es primo. Sus divisores son: ");
                printDivisors(num);
            }
        }
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

    // Método para imprimir los divisores de un número
    public static void printDivisors(int num) {
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println(num); // El número en sí es siempre un divisor
    }
}
