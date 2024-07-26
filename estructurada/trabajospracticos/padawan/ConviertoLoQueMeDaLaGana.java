package estructurada.trabajospracticos.padawan;

public class ConviertoLoQueMeDaLaGana {
    public static void main(String[] args) {
        int N = 8;
        int i = 1;
        int suma = 0;

        while (i <= N) {
            suma += i;
            i++;
        }
        System.out.println("La suma de los primeros " + N + " numeros es igual a "+ suma);

        suma = 0;
        i = 0;

        do {
            i++;
            suma += i;
        } while (i < N);

        System.out.println("La suma de los primeros " + N + " numeros es igual a "+ suma);

    }
}
