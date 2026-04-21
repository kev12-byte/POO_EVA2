/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_16_composicion;

/**
 *
 * @author Admin
 */
public class Persona{
    private String nombre;
    private String apellido;
    private int edad;
    private Direccion direccion;//La pesrona TIENE una direccion
    
    //CONSTRUCTORES
    public Persona() {
        this.nombre = "";
        this.apellido = "";
        this.edad = 0;
        this.direccion = null;
    }

    public Persona(String nombre, String apellido, int edad, Direccion direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.direccion = direccion;
    }
    
    //CONSTRUCTOR EXTRA (para persona2)
    public Persona(String nombre, String apellido, int edad, String calle, int numero, String colonia) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.direccion = new Direccion(calle, numero, colonia, "00000");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Persona\n" +
                "nombre=" + nombre + ", " +
                "apellido=" + apellido + ", " +
                "edad=" + edad + ", " +
                "direccion=" + direccion;
    }
    
}