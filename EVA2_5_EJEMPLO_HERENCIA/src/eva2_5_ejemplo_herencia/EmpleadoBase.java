/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_5_ejemplo_herencia;

/**
 *
 * @author Admin
 */
public class EmpleadoBase extends Empleado {
    private int anioIngreso;

    // Constructor
    public EmpleadoBase(int anioIngreso, String numeroEmpleado, String nombre, String apellido, double salario) {
        super(numeroEmpleado, nombre, apellido, salario);
        this.anioIngreso = anioIngreso;
    }

    // Getter y Setter
    public int getAnioIngreso() {
        return anioIngreso;
    }

    public void setAnioIngreso(int anioIngreso) {
        this.anioIngreso = anioIngreso;
    }

    // Antigüedad (cada 5 años)
    public int antiguedad() {
        int anti = 2026 - anioIngreso;
        return anti / 5;
    }

    // Salario con aumento
    @Override
    public double calcularSalario() {
        return getSalario() * (1 + antiguedad() * 0.1);
    }

    // toString
    @Override
    public String toString() {
        return super.toString() +
               "Año de ingreso: " + anioIngreso + "\n" +
               "Antigüedad (cada 5 años): " + antiguedad() + "\n" +
               "Salario total: $" + calcularSalario() + "\n";
    }
}