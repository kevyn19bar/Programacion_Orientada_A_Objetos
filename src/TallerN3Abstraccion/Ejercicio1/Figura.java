package TallerN3Abstraccion.Ejercicio1;

/**
 * Clase abstracta que define el contrato base para cualquier figura geométrica.
 */
public abstract class Figura {
    protected String nombre;

    public Figura(String nombre) {
        this.nombre = nombre;
    }

    // Método abstracto: No tiene cuerpo. Cada figura calcula su área de forma única.
    public abstract double calcularArea();

    // Método concreto: Heredado por todas las clases hijas.
    public void mostrar() {
        System.out.println("Figura: " + nombre);
        System.out.println("Área: " + String.format("%.2f", calcularArea()));
    }
}
