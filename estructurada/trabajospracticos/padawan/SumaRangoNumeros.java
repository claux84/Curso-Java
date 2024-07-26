package estructurada.trabajospracticos.padawan;

import java.util.Scanner;

public class SumaRangoNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] rango = new int[2];
        System.out.print("Ingrese el valor inferior del rango de numeros: ");
        rango[0] = scanner.nextInt();
        System.out.print("Ingrese el valor superior del rango de numeros: ");
        rango[1] = scanner.nextInt();
        int suma = 0;
         
        for (int i = rango[0]; i <= rango[1]; i++) {
            if (i % 2 == 0) {
                suma += i;
            } 
        }
        System.out.println(" La suma de los numeros impares del rango entre " + rango[0] + " y " + rango[1] + " es igual a " + suma);

        scanner.close();

    }
}
