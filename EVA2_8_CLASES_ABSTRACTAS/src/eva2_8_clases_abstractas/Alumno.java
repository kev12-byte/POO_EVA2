/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_8_clases_abstractas;

/**
 *
 * @author Admin
 */
public class Alumno extends Persona {

    private String matricula;

    public Alumno() {
        super();
        this.matricula = "";
    }

    public Alumno(String nombre, String apellidos, int edad, String matricula) {
        super(nombre, apellidos, edad);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
