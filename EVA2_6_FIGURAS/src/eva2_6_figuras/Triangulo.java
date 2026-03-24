/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_6_figuras;

/**
 *
 * @author Admin
 */
public class Triangulo extends Figuras {

    private double base;
    private double altura;
    private double lado1;
    private double lado2;
    private double lado3;

    // Constructor
    public Triangulo(double base, double altura, double lado1, double lado2, double lado3) {
        this.base = base;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    // Método para calcular área
    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }

    // Método para calcular perímetro
    @Override
    public double calcularPerimetro() {
        return lado1 + lado2 + lado3;
    }

    // toString
    @Override
    public String toString() {
        return "Triangulo:\n" +
               "Base: " + base +
               "\nAltura: " + altura +
               "\nLados: " + lado1 + ", " + lado2 + ", " + lado3 +
               "\nArea: " + calcularArea() +
               "\nPerimetro: " + calcularPerimetro();
    }
}