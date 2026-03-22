/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_5_ejemplo_herencia;

/**
 *
 * @author Admin
 */
public class EmpleadoHonorario extends Empleado {
    private int horas;
    private double pagoPorHora;

    // Constructor
    public EmpleadoHonorario(int horas, double pagoPorHora, String numeroEmpleado, String nombre, String apellido) {
        super(numeroEmpleado, nombre, apellido, 0);
        this.horas = horas;
        this.pagoPorHora = pagoPorHora;
    }

    // Getters y Setters
    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public double getPagoPorHora() {
        return pagoPorHora;
    }

    public void setPagoPorHora(double pagoPorHora) {
        this.pagoPorHora = pagoPorHora;
    }

    // Salario por horas
    @Override
    public double calcularSalario() {
        return horas * pagoPorHora;
    }

    // toString
    @Override
    public String toString() {
        return super.toString() +
               "Horas trabajadas: " + horas + "\n" +
               "Pago por hora: $" + pagoPorHora + "\n" +
               "Salario total: $" + calcularSalario() + "\n";
    }
}