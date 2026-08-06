package TallerN2Herencia.RetoIntegrador;

/**
 * Clase padre que representa cualquier trabajador de la IPS.
 */
public class PersonalIPS {
    protected String documento;
    protected String nombre;
    protected double salarioBase;

    public PersonalIPS(String documento, String nombre, double salarioBase) {
        this.documento = documento;
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    public void registrarAsistencia() {
        System.out.println("Asistencia registrada para " + nombre + " (Doc: " + documento + ").");
    }

    public double calcularSalarioMensual() {
        return salarioBase;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Documento: " + documento);
        System.out.println("Salario Base: $" + salarioBase);
        System.out.println("Salario Total a Pagar: $" + calcularSalarioMensual());
    }
}
