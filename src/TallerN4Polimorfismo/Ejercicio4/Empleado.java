package TallerN4Polimorfismo.Ejercicio4;

/**
 * Clase base para la nómina de empleados.
 */
public class Empleado {
    protected String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public double calcularSalario() {
        return 0.0;
    }

    public String getNombre() {
        return nombre;
    }
}
