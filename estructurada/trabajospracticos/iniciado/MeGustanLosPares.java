package estructurada.trabajospracticos.iniciado;

import java.util.Scanner;

public class MeGustanLosPares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entero N: ");
        int numero = scanner.nextInt();
        System.out.println("Los primeros " + numero + " números pares son:");   
        for (int i = 1; i <= numero; i++) {
            System.out.println(i * 2);
        }
        scanner.close();   
    }
    
    
}
