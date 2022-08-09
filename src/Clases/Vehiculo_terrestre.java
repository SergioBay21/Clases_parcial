package Clases;

public class Vehiculo_terrestre extends Vehiculo {
    private String motor, modelo;
    private int anio, hp, n_pasajeros;

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
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

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getN_pasajeros() {
        return n_pasajeros;
    }

    public void setN_pasajeros(int n_pasajeros) {
        this.n_pasajeros = n_pasajeros;
    }
    
    
}
