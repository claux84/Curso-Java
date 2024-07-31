package orientadaaobjetos.escenariogestionvehiculos.dominio;

import java.util.ArrayList;
import java.util.List;

public class Flota {
    private List<Vehiculo> vehiculos = new ArrayList<>();

    public Flota(List<Vehiculo> vehiculos){
        this.vehiculos = vehiculos;
    }

    public void moverVehiculo(){

        for (Vehiculo vehiculo : vehiculos) {
            vehiculo.mover();
        }

    }
    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }
    public void setVehiculos(List<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }
    


}
