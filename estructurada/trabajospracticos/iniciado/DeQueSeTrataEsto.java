package estructurada.trabajospracticos.iniciado;

public class DeQueSeTrataEsto {
    public static void main(String[] args) {
        int numero = 0;

        if (numero > 0){
            System.out.println("El numero " + numero + " es positivo");
        }
        else {
            if (numero == 0) {
                System.out.println("El numero " + numero + " no posee signo");
            }
            else {
                System.out.println("El numero " + numero + " es negativo");
            }
        }
    }
}
