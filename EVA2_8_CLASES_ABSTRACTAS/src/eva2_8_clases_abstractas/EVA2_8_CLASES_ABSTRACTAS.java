/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_8_clases_abstractas;

/**
 *
 * @author Admin
 */
public class EVA2_8_CLASES_ABSTRACTAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    Alumno alumno1 = new Alumno("Kevin", "Conde", 18, "A123");

    System.out.println("Nombre: " + alumno1.getNombre());
    System.out.println("Apellidos: " + alumno1.getApellidos());
    System.out.println("Edad: " + alumno1.getEdad());
    System.out.println("Matrícula: " + alumno1.getMatricula());
    }
}