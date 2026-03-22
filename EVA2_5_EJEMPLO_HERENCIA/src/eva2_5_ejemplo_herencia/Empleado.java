/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_5_ejemplo_herencia;

/**
 *
 * @author Admin
 */
public class Empleado {
    private String numeroEmpleado;
    private String nombre;
    private String apellido;
    private double salario;

    // Constructor
    public Empleado(String numeroEmpleado, String nombre, String apellido, double salario) {
        this.numeroEmpleado = numeroEmpleado;
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
    }

    // Getters y Setters
    public String getNumeroEmpleado() {
        return numeroEmpleado;
    }

    public void setNumeroEmpleado(String numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // Método toString corregido
    @Override
    public String toString() {
        String resu = "---EMPLEADO---\n" +
                      "Numero de empleado: " + numeroEmpleado + "\n" +
                      "Nombre: " + nombre + "\n" +
                      "Apellido: " + apellido + "\n" +
                      "Salario: $" + salario + "\n";
        return resu;
    }

    
    public double calcularSalario() {
        return salario; // aquí solo regresa el salario base
    }
}