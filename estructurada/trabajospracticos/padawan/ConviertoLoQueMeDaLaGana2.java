package estructurada.trabajospracticos.padawan;

public class ConviertoLoQueMeDaLaGana2 {
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
                
        for (i = 1 ; i <= N; i++ ) {
            suma += i;
        }

        System.out.println("La suma de los primeros " + N + " numeros es igual a "+ suma);

    }
}
