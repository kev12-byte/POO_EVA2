/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_7_abstract;

/**
 *
 * @author Admin
 */
public class Triangulo extends Figuras {
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    // Métodos obligatorios de la clase abstracta
    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }

    @Override
    public double calcularPerimetro() {
        // Asumimos triángulo equilátero porque solo tienes base
        return base * 3;
    }

    @Override
    public String toString() {
        return "-----TRIANGULO-----\n" +
               "Base: " + base + "\n" +
               "Altura: " + altura + "\n" +
               "Area: " + calcularArea() + "\n" +
               "Perimetro: " + calcularPerimetro();
    }
}