package orientadaaobjetos.escenariogestionvehiculos.dominio;

public class Moto extends Vehiculo {
    public Moto(String marca, String modelo, int anio, String color) {
        super(marca, modelo, anio, color);
    }

    @Override
    public void mover() {
        System.out.println("La moto está acelerand");
    }

}
