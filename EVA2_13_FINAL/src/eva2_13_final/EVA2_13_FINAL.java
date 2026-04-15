/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_13_final;

/**
 *
 * @author Admin
 */
public class EVA2_13_FINAL {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Empleado emp = new Empleado("Programador", "Kevin");

        System.out.println("Nombre: " + emp.getNombre());
        System.out.println("Puesto: " + emp.getPuesto());
    }
    
}

class Persona {
    private String nombre;

    public Persona() {
        this.nombre = "";
    }
    
    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

class Empleado extends Persona {
    private String puesto;
    
    public Empleado() {
        super();
        this.puesto = "";
    }

    public Empleado(String puesto) {
        super();
        this.puesto = puesto;
    }

    public Empleado(String puesto, String nombre) {
        super(nombre);
        this.puesto = puesto;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
}