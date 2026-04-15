/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_10_interfaces_herencia;

/**
 *
 * @author Admin
 */
public class EVA2_10_INTERFACES_HERENCIA {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {

        Persona persona = new Persona("Kevin", "Conde", 18);

        persona.mostrarMensaje();

        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Apellidos: " + persona.getApellidos());
        System.out.println("Edad: " + persona.getEdad());
    }
}
