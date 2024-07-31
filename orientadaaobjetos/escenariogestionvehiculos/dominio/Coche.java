package orientadaaobjetos.escenariogestionvehiculos.dominio;

public class Coche extends Vehiculo {
    private int cantidadPuertas;

    public Coche(String marca, String modelo, int anio, String color, int cantidadPuertas) {
        super(marca, modelo, anio, color);
        setCantidadPuertas(cantidadPuertas);
    }

    @Override
    public void mover() {
        System.out.println("El coche esta conduciendo");
    }

    public int getCantidadPuertas() {
        return cantidadPuertas;
    }
    public void setCantidadPuertas(int cantidadPuertas) {
        this.cantidadPuertas = cantidadPuertas;
    }
}
