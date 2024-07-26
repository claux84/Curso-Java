package estructurada.trabajospracticos.iniciado;

public class SumaDeLosPrimeros {
    public static void main(String[] args) {
        int numero = 10;
        long sumaPrimeros = 0;

        for (int i = 0; i <= numero; i++) {
            sumaPrimeros = sumaPrimeros + i;
        }

        System.out.println(" La suma de los primeros " + numero + " numeros es igual a " + sumaPrimeros);



    }
    
}
