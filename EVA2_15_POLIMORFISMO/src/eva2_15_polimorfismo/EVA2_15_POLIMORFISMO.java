/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_15_polimorfismo;

/**
 *
 * @author Admin
 */
public class EVA2_15_POLIMORFISMO {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {

        Empleado empleado = new Empleado("Gerente", 1000, "Juan", "Perez", 45);
        System.out.println("DATOS DE EMPLEADO");
        imprimir(empleado);

        Cliente cliente = new Cliente("CASDF368545", 500, "Luis", "Lopez", 30);
        System.out.println("DATOS DE CLIENTE");
        imprimir(cliente);

        Persona perso = empleado; // POLIMORFISMO
        System.out.println("EMPLEADO DISFRAZADO DE PERSONA");
        imprimir(perso);

        Persona perso2 = cliente;
        System.out.println("CLIENTE DISFRAZADO DE PERSONA");
        imprimir(perso2);
         
        
        //Arreglo de "diferentes" objetos
        //CASTING
        Cliente cl = (Cliente)perso2;//AQUI, EN PERSO2 SE ALMACENA UN OBJETO DE TIPO CLIENTE, SE PUEDES HACER CASTING
        Cliente cl2 = (Cliente)perso;//AQUI, EN PERSO2 SE ALMACENA UN OBJETO DE TIPO CLIENTE, NO SE PUEDES HACER CASTING
    }

    public static void imprimir (Persona perso){
        System.out.println(perso.generarDatos());

        if (perso instanceof Empleado)
            System.out.println("EMPLEADO");
        else if (perso instanceof Cliente)
            System.out.println("CLIENTE");
    }
}