package TallerN3Abstraccion.Ejercicio2;

/**
 * Clase abstracta que representa a un empleado general.
 */
public abstract class Empleado {
    protected String nombre;
    protected String documento;

    public Empleado(String nombre, String documento) {
        this.nombre = nombre;
        this.documento = documento;
    }

    // Obliga a cada subclase a definir cómo calcula el pago mensual.
    public abstract double calcularPago();

    // Método concreto común a todos los empleados.
    public void mostrarRecibo() {
        System.out.println("Empleado: " + nombre);
        System.out.println("Documento: " + documento);
        System.out.println("Pago del mes: $" + String.format("%.2f", calcularPago()));
    }
}
