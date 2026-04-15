/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_12_clases_anonimas;

/**
 *
 * @author Admin
 */
public class EVA2_12_CLASES_ANONIMAS {

    public static void main(String[] args) {
        // TODO code application logic here
        // POLIMORFISMO --> HACER QUE ALGO SE COMPORTE COMO ALGO

        Prueba prueba = new Prueba() { // CLASE ANONIMA (SIN NOMBRE)
            @Override
            public void mostrarMensaje() {
                System.out.println("Hola mundo cruel!!");
            }
        };

        prueba.mostrarMensaje();
    }
}

/*class MiClase implements Prueba{

}*/

interface Prueba {
    void mostrarMensaje();
}