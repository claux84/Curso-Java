package imperativa.trabajospracticos.padawan;


public class PromedioEdad {
    public static void main(String[] args) {
        String nombre1 = "Juan" ;
        String nombre2 = "Pablo" ;
        String nombre3 = "Pedro" ;

        float edad1 = 28;
        float edad2 = 35;
        float edad3 = 25;

        float promedio = (edad1 + edad2 + edad3)/3;

        System.out.println("Nombre: " + nombre1 + " Edad: " + edad1);
        System.out.println("Nombre: " + nombre2 + " Edad: " + edad2);
        System.out.println("Nombre: " + nombre3 + " Edad: " + edad3);
        System.out.println("El promedio de edad es: " + promedio);

    }
}
