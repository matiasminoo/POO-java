package nashe;

import java.util.Scanner;

public class ashe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("A que ejercicio quiere acceder?");
        System.out.println("Ej 16");
        System.out.println("Ej 17");
        System.out.println("Ej 18");
        System.out.println("Ej 19");
        System.out.println("Ej 20");
        
        int opcion = scanner.nextInt();
        
        switch(opcion) {
            case 16:
                ej16();
                break;
            case 17:
                ej17();
                break;
            case 18:
                ej18();
                break;
            case 19:
                ej19();
                break;
            case 20: 
                ej20();
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }
        
        scanner.close();
    }

    public static void ej16() {
        Scanner scanner = new Scanner(System.in);
        String pw = "anashe";
        String comp = "";
        int trys = 0;
        boolean comparacion;
        
        do {
            System.out.println("Ingrese la contraseña:");
            comp = scanner.nextLine();
            comparacion = pw.equalsIgnoreCase(comp);
            if (!comparacion) {
                trys++;
                System.out.println("Contraseña incorrecta. Intentos restantes: " + (3 - trys));
            }
        } while (trys < 3 && !comparacion);
        
        if (comparacion) {
            System.out.println("ENHORABUENA");
        } else {
            System.out.println("Número máximo de intentos alcanzado.");
        }
        
        scanner.close(); 
    }

    public static void ej17() {
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("Introduce un dia de la semana");
        String dia = scanner.next();
        
        switch(dia){
            case "lunes":
            case "martes":
            case "miercoles":
            case "jueves":
            case "viernes":
                System.out.println("Es un dia laboral");
                break;
            case "sabado":
            case "domingo":
                System.out.println("Es finde maquina");
            default:
                System.out.println("Introduce un dia de la semana");
        }
    }
    
    public static void ej18() {
    	 Scanner scanner = new Scanner(System.in);
         System.out.println("Introduce el primer numero");
         int num1=scanner.nextInt();
  
         System.out.println("Introduce el segundo numero");
         int num2=scanner.nextInt();
  
         for (int i=0;i<10;i++){
             int numAleatorio=(int)Math.floor(Math.random()*(num1-num2)+num2);
             System.out.println(numAleatorio);
         }
    }

    public static void ej19() {
    	 Scanner scanner = new Scanner(System.in);
         int numero=0;
         do{
             System.out.println("Introduce un numero");
             numero=scanner.nextInt();
         }while(numero < 0); 
         
         int contador = 0; for (int i = numero; i > 0; i /= 10){
            
             contador++;
         }
  
      
         if (contador==1){
             System.out.println("El numero "+numero+ " tiene "+contador+" cifra");
         }else{
             System.out.println("El numero "+numero+ " tiene "+contador+" cifras");
         }
    }

    public static void ej20() {
    	 Scanner scanner = new Scanner(System.in);
         
         System.out.print("Introduce un número: ");
         int numero = scanner.nextInt();
         
         if (numero <= 1) {
             System.out.println(numero + " no es un número primo.");
         } else {
             boolean esPrimo = true;
             
             for (int i = 2; i <= Math.sqrt(numero); i++) {
                 if (numero % i == 0) {
                     esPrimo = false; 
                     break;
                 }
             }
             
             if (esPrimo) {
                 System.out.println(numero + " es un número primo.");
             } else {
                 System.out.println(numero + " no es un número primo.");
             }
         }
         
         scanner.close();
     }
    
}
