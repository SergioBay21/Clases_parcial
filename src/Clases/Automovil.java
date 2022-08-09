package Clases;

public class Automovil extends Vehiculo_terrestre {
    private int n_puertas, n_airbags;
    private String tipo, transmision, combustible;

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public int getN_puertas() {
        return n_puertas;
    }

    public void setN_puertas(int n_puertas) {
        this.n_puertas = n_puertas;
    }

    public int getN_airbags() {
        return n_airbags;
    }

    public void setN_airbags(int n_airbags) {
        this.n_airbags = n_airbags;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTransmision() {
        return transmision;
    }

    public void setTransmision(String transmision) {
        this.transmision = transmision;
    }
    
    
}
