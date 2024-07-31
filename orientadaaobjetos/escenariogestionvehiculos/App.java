package orientadaaobjetos.escenariogestionvehiculos;

import java.util.ArrayList;
import java.util.List;

import orientadaaobjetos.escenariogestionvehiculos.dominio.*;;

public class App {
    public static void main(String[] args) {

        Coche coche1 = new Coche("Peugeot","208", 2020, "Rojo", 4);
        Coche coche2 = new Coche("Fiat", "Cronos", 2023, "Azul", 4);
        Coche coche3 = new Coche("Toyota", "Hilux", 2019, "Blanco", 4);
        Moto moto1 = new Moto("Yamaha", "Crypton", 2017, "Negro");
        Moto moto2 = new Moto("Honda", "Wave", 2021, "Negro");


        List<Vehiculo> vehiculos = new ArrayList<>();
        vehiculos.add(coche1);
        vehiculos.add(coche2);
        vehiculos.add(coche3);
        vehiculos.add(moto1);
        vehiculos.add(moto2);


        Flota flota = new Flota(vehiculos);

        flota.moverVehiculo();

        for (Vehiculo vehiculo : vehiculos) {
            System.out.println(vehiculo.getMarca() + vehiculo.getModelo() + vehiculo.getAnio());
        }

        //listaFlota.add(flota);
    }


}
