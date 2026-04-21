/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_15_polimorfismo;

/**
 *
 * @author Admin
 */
             //Empleado es una persona
public class Empleado extends Persona {
    private String puesto;
    private double salario;

    public Empleado() {
        super();
    }

    public Empleado(String puesto, double salario, String nombre, String aperllidos, int edad) {
        super(nombre, aperllidos, edad);
        this.puesto = puesto;
        this.salario = salario;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String generarDatos() {
        return super.generarDatos() + "\n" +
               "Puesto: " + puesto + "\n" +
               "Salario: " + salario;
    }
}