package imperativa.trabajospracticos.iniciado;

public class Acumulador {
    public static void main(String[] args) {
        double num1 = 3.4;
        double num2 = 4.7;

        double acumulador = (num1*num2)*(1/1+1/2+1/3+1/4+1/5+1/6+1/7+1/8+1/9+1/10+1/11+1/12+1/13+1/14+1/15);

        System.out.println("El resultado es " + acumulador);
    }
}
