package imperativa.trabajospracticos.iniciado;

public class CalculoDivisivilidad {
    public static void main(String[] args) {
        int num1 = 35;
        int num2 = 17;

        int res = num1 + num2;

        String div = (num1 % num2 == 0) ? "divisible" : "no divisible";

        System.out.println("El resultado es " + res + " y el primer número es " + div + " respecto al segundo número");
    }
}
