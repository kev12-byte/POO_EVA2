/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_3_herencia;

/**
 *
 * @author Admin
 */
public class EVA2_3_HERENCIA {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        System.out.println(" ---ANIMAL---");
        Animal animal = new Animal();
        animal.comer();

        System.out.println(" ---MAMIFERO---");
        Mamifero mamifero = new Mamifero();
        mamifero.comer();
        mamifero.tenerPelo();

        System.out.println(" ---PERSONA---");
        Persona persona = new Persona("Hola mundo!!");
        persona.comer();
        persona.tenerPelo();
        persona.pensar();
    }
}

class Animal { // clase base
    public Animal() {
        System.out.println("Animal!!");
    }

    public void comer() {
        System.out.println("Comer!!");
    }
}

class Mamifero extends Animal { // subclase
    public Mamifero() {
        System.out.println("Mamifero!!");
    }

    public void tenerPelo() {
        System.out.println("Tiene pelo!!");
    }
}

class Persona extends Mamifero {
    public Persona(String mensaje) {
        super(); // SIEMPRE debe ir primero
        System.out.println(mensaje);
        System.out.println("Persona");
    }

    public Persona() {
    }

    public void pensar() {
        System.out.println("Pensar!!");
    }
}