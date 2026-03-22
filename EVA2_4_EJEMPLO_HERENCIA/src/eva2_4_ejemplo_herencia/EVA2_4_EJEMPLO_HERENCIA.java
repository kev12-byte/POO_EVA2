package eva2_4_ejemplo_herencia;

public class EVA2_4_EJEMPLO_HERENCIA {

    public static void main(String[] args) {

        Persona persona = new Persona("Juan", "Perez", "Jolote", "ASDFR34520", 20, 'H');
        persona.imprimirDatos();

        Empleado empleado = new Empleado("1", "Gerente", 100000,
                "Pedro", "Lopez", "Martinez",
                "PEDR12345", 35, 'H');

        //empleado.imprimirDatos();
        System.out.println(empleado);
        
    }
}
