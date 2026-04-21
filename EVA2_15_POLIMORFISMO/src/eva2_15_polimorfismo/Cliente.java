/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_15_polimorfismo;

/**
 *
 * @author Admin
 */
             //cliente es una persona
public class Cliente extends Persona {
    private String rfc;
    private int credito;

    public Cliente() {
        super();
    }

    public Cliente(String rfc, int credito, String nombre, String aperllidos, int edad) {
        super(nombre, aperllidos, edad);
        this.rfc = rfc;
        this.credito = credito;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public int getCredito() {
        return credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }

    @Override
    public String generarDatos() {
        return super.generarDatos() + "\n" +
               "RFC: " + rfc + "\n" +
               "Credito: " + credito;
    }
}