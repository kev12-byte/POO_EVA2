/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_17_composicion_vheiculo;

/**
 *
 * @author Admin
 */
public class Electrico extends Motor{
    private String tipoBateria;
    private int tiempoCarga; 

    public Electrico(String tipoBateria, int tiempoCarga, double potencia) {
        super(potencia);
        this.tipoBateria = tipoBateria;
        this.tiempoCarga = tiempoCarga;
    }

    public String getTipoBateria() {
        return tipoBateria;
    }

    public void setTipoBateria(String tipoBateria) {
        this.tipoBateria = tipoBateria;
    }

    public int getTiempoCarga() {
        return tiempoCarga;
    }

    public void setTiempoCarga(int tiempoCarga) {
        this.tiempoCarga = tiempoCarga;
    }

    @Override
    public String toString() {
        return super.toString() + 
                "\tBateria: " + tipoBateria + "\n" +
                "\tTiempo de carga: " + tiempoCarga + "\n";
    }
}