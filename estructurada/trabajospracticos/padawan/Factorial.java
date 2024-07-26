package estructurada.trabajospracticos.padawan;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el numero del cual se desea obtener el factorial: ");
        int N = scanner.nextInt();
        long factorial = 1;
        for (int i = 1; i <= N; i++) {
            factorial *= i;
        }
        System.out.println("El factorial de " + N + " es igual a " + factorial);
        scanner.close();


    
    }
}
