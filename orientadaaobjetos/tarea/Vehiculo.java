package orientadaaobjetos.tarea;

public class Vehiculo {
    private String marca;
    private int cantidadDeRuedas;
    private boolean competencia;
    private boolean alarma;
    private String kmMaximo;
    private String kmMinimo;
    
    public Vehiculo( String marca, int cantidadDeRuedas, boolean competencia, boolean alarma, String kmMaximo, String kmMinimo){
        this.marca = marca;
        this.cantidadDeRuedas = cantidadDeRuedas;
        this.competencia = competencia;
        this.alarma = alarma;
        this.kmMaximo = kmMaximo;
        this.kmMinimo = kmMinimo;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setCantidadDeRuedas(int cantidadDeRuedas) {
        this.cantidadDeRuedas = cantidadDeRuedas;
    }
    public void setCompetencia(boolean competencia) {
        this.competencia = competencia;
    }
    public void setAlarma(boolean alarma) {
        this.alarma = alarma;
    }
    public void setKmMaximo(String kmMaximo) {
        this.kmMaximo = kmMaximo;
    }
    public void setKmMinimo(String kmMinimo) {
        this.kmMinimo = kmMinimo;
    }
    public String getMarca() {
        return marca;
    }
    public int getCantidadDeRuedas() {
        return cantidadDeRuedas;
    }
    public String getKmMaximo() {
        return kmMaximo;
    }public String getKmMinimo() {
        return kmMinimo;
    }
    public boolean getalarma() {
        return alarma;
    }
    public boolean getcompetencia() {
        return competencia;
    }
    

}
