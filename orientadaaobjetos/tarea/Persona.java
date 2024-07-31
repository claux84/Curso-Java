package orientadaaobjetos.tarea;

import java.time.LocalDate;

public class Persona {
    private long dni;
    private String nombre;
    private LocalDate fechaDeNacimiento;
    private Vehiculo vehiculo; 
    private boolean licencia;

    public Persona(){};

    public Persona( long dni, String nombre, LocalDate  fechaDeNacimiento,  Vehiculo vehiculo){
        this.dni = dni;
        this.nombre = nombre ;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.vehiculo = vehiculo;
    }
    public void setDni(long dni) {
        this.dni = dni;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }
    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
    public void setLicencia(boolean licencia) {
        this.licencia = licencia;
    }
    public long getDni() {
        return dni;
    }
    public String getNombre() {
        return nombre;
    }
    public LocalDate getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }
    public Vehiculo getVehiculo() {
        return vehiculo;
    }
    public boolean getlicencia() {
        return licencia;
    }

}
