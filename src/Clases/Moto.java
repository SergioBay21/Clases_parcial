package Clases;

public class Moto extends Vehiculo_terrestre{
    private int n_escapes, n_ruedas;
    private String tipo_asiento;

    public int getN_escapes() {
        return n_escapes;
    }

    public void setN_escapes(int n_escapes) {
        this.n_escapes = n_escapes;
    }

    public int getN_ruedas() {
        return n_ruedas;
    }

    public void setN_ruedas(int n_ruedas) {
        this.n_ruedas = n_ruedas;
    }
    
    public String getTipo_asiento() {
        return tipo_asiento;
    }

    public void setTipo_asiento(String tipo_asiento) {
        this.tipo_asiento = tipo_asiento;
    }
    
    
}
