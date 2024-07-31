package orientadaaobjetos.escenariogestionvehiculos.dominio;

abstract public class Vehiculo {
    protected String marca;
    protected String modelo;
    protected int anio;
    protected String color;


    public Vehiculo (String marca, String modelo, int anio, String color){
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this. color = color;
    }

    public abstract void mover();

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getAnio() {
        return anio;
    }
    public void setAnio(int anio) {
        this.anio = anio;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
   


}
