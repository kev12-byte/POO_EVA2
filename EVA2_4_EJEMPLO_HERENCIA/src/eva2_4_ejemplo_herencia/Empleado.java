package eva2_4_ejemplo_herencia;

public class Empleado extends Persona {

    private String numeroEmpleado;
    private String puesto;
    private double salario;

    public Empleado(){
        super();
        this.numeroEmpleado = "";
        this.puesto = "";
        this.salario = 0;
    }

    public Empleado(String numeroEmpleado, String puesto, double salario,
            String nombre, String ap_paterno, String ap_materno,
            String rfc, int edad, char genero) {

        super(nombre, ap_paterno, ap_materno, rfc, edad, genero);

        this.numeroEmpleado = numeroEmpleado;
        this.puesto = puesto;
        this.salario = salario;
    }

    public String getNumeroEmpleado() {
        return numeroEmpleado;
    }

    public void setNumeroEmpleado(String numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    /*public void imprimirDatosEmpleado(){
        imprimirDatos();
        System.out.println("Numero de empleado: " + numeroEmpleado);
        System.out.println("Puesto: " + puesto);
        System.out.println("Salario: " + salario);
    }*/

    @Override
    public String toString(){
        return super.toString() +
               "\nNumero de empleado: " + numeroEmpleado +
               "\nPuesto: " + puesto +
               "\nSalario: " + salario;
    }
}