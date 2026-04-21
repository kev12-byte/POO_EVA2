/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_17_composicion_vheiculo;

/**
 *
 * @author Admin
 */
public class Motor {
    private double potencia;

    public Motor(double potencia) {
        this.potencia = potencia;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return "\tMotor:\n" +
               "\tPotencia = " + potencia + "\n";
    }
}