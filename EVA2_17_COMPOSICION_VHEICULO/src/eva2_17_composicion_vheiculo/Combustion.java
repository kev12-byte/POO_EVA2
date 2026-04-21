/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_17_composicion_vheiculo;

/**
 *
 * @author Admin
 */
public class Combustion extends Motor {
    private String tipoCombustible;
    private int cilindros;

    public Combustion(String tipoCombustible, int cilindros, double potencia) {
        super(potencia);
        this.tipoCombustible = tipoCombustible;
        this.cilindros = cilindros;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public int getCilindros() {
        return cilindros;
    }

    public void setCilindros(int cilindros) {
        this.cilindros = cilindros;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\tTipo de combustible: " + tipoCombustible + "\n" +
                "\tCilindros: " + cilindros + "\n";        
    }
}