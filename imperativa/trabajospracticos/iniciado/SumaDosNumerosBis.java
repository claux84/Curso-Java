package imperativa.trabajospracticos.iniciado;

public class SumaDosNumerosBis {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 8;

        int res = num1 + num2;

        String parImpar = (res % 2 == 0) ? "par" : "impar";

        System.out.println("El resultado es " + res + " y es " + parImpar);


    }

    
}
