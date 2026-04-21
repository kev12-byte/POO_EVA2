/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_17_composicion_vheiculo;

/**
 *
 * @author Admin
 */
public class EVA2_17_COMPOSICION_VHEICULO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic hereehiculo
        Electrico motorElectrico = new Electrico ("Litio", 100, 100);
        Vehiculo vehiculo = new Vehiculo ("Tesla", "X", 2025, motorElectrico);
        System.out.println("VEHICULO ELECTRICO");
        System.out.println(vehiculo);

        Combustion motorGasolina = new Combustion ("Gasolina", 8, 400);
        Vehiculo tradicional = new Vehiculo("Ford", "Mustang", 1975, motorGasolina);
        System.out.println("VEHICULO DE GASOLINA");
        System.out.println(tradicional);
    }
    
}