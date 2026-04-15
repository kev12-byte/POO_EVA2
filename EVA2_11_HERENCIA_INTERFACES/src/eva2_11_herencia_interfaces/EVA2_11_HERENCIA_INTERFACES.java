/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_11_herencia_interfaces;

/**
 *
 * @author Admin
 */
public class EVA2_11_HERENCIA_INTERFACES {

    /**
     * @param args the command line arguments
     */
    

    public static void main(String[] args) {
        // TODO code application logic here

        Demostracion demo = new Demostracion();

        demo.mostrarMensaje();
        demo.saludar("Hola Kevin");
    }
}

// Clase que implementa la interfaz
class Demostracion implements OtraPrueba {

    @Override
    public void saludar(String mensaje) {
        System.out.println(mensaje);
    }

    @Override
    public void mostrarMensaje() {
        System.out.println("HOLA MUNDO CRUEL!!!");
    }
}

// Interfaces
interface Prueba {
    public void mostrarMensaje();
}

interface OtraPrueba extends Prueba {
    public void saludar(String mensaje);
}