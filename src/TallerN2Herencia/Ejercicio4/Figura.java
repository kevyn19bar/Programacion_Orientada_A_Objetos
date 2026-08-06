package TallerN2Herencia.Ejercicio4;

/**
 * Clase padre para representar figuras geométricas.
 */
public class Figura {
    protected String color;

    public Figura(String color) {
        this.color = color;
    }

    public double calcularArea() {
        return 0.0; // Se sobrescribe en las clases hijas
    }

    public String getColor() {
        return color;
    }

    /**
     * RETO EXTRA: Muestra la información resumida de la figura.
     */
    public void describir() {
        System.out.println("Figura de color " + color + " | Área calculada: " + String.format("%.2f", calcularArea()));
    }
}
