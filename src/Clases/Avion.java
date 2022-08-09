package Clases;

public class Avion extends Vehiculo_aereo{
    private int n_ventanas;
    private String tamanio, tipo_de_uso;

    public int getN_ventanas() {
        return n_ventanas;
    }

    public void setN_ventanas(int n_ventanas) {
        this.n_ventanas = n_ventanas;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public String getTipo_de_uso() {
        return tipo_de_uso;
    }

    public void setTipo_de_uso(String tipo_de_uso) {
        this.tipo_de_uso = tipo_de_uso;
    }
    
    
}
