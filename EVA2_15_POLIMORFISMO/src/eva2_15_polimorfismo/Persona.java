/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_15_polimorfismo;

/**
 *
 * @author Admin
 */
public class Persona {
    private String nombre;
    private String aperllidos;
    private int edad;

    public Persona() {
    }

    public Persona(String nombre, String aperllidos, int edad) {
        this.nombre = nombre;
        this.aperllidos = aperllidos;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAperllidos() {
        return aperllidos;
    }

    public void setAperllidos(String aperllidos) {
        this.aperllidos = aperllidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String generarDatos(){
        return "Nombre: " + nombre + "\n" +
               "Apellidos: " + aperllidos + "\n" +
               "Edad: " + edad;
    }
}