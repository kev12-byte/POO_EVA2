/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_5_ejemplo_herencia;

/**
 *
 * @author Admin
 */
public class EVA2_5_EJEMPLO_HERENCIA {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {

    // Empleado normal
    Empleado empleado = new Empleado("1", "Juan", "Perez", 20000);
    System.out.println(empleado);

    // Empleado base
    EmpleadoBase empleadoBase = new EmpleadoBase(2010, "2", "Pedro", "Lopez", 15000);
    System.out.println(empleadoBase);

    // Empleado por honorarios
    EmpleadoHonorario empleadoHono = new EmpleadoHonorario(40, 100, "3", "Luis", "Garcia");
    System.out.println(empleadoHono);
  }
}
