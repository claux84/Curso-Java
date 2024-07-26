package estructurada.trabajospracticos.iniciado;
import java.util.Scanner;
public class EsperoAprobar {
    public static void main(String[] args) {
        System.out.println("Listado de Calificaciones");
        System.out.println("-------------------------");
        Scanner scanner = new Scanner(System.in);
        System.out.print(("Ingrese la cantidad de calificaciones del alumno: "));
        int cantidadNotas = scanner.nextInt();
        double promedio = 0;
        double nota = 0;
        for (int i = 1; i<= cantidadNotas; i++) {
            System.out.print("Ingrese la " + i + "° nota: ");
            nota = scanner.nextDouble();
            promedio += nota;

        }

        promedio = promedio/cantidadNotas;
        if (promedio >= 6) {
            System.out.println("Usted aprobo con un promedio de :" + promedio);
        } else {
            System.out.println("Usted no aprobo con un promedio de :" + promedio );
        }
        scanner.close();

        


    }
}
