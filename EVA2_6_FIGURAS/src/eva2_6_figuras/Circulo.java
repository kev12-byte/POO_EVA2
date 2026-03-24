/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_6_figuras;

/**
 *
 * @author Admin
 */
public class Circulo extends Figuras {

    private double radio;

    // Constructor
    public Circulo(double radio) {
        this.radio = radio;
    }

    // Método para calcular área
    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    // Método para calcular perímetro
    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

    // toString
    @Override
    public String toString() {
        return "Circulo:\n" +
               "Radio: " + radio +
               "\nÁrea: " + calcularArea() +
               "\nPerímetro: " + calcularPerimetro();
    }
}