package TallerN3Abstraccion.Ejercicio1;

/**
 * RETO DE ANDAMIAJE: Clase concreta que implementa el método abstracto calcularArea().
 */
public class Rectangulo extends Figura {
    private double ancho;
    private double alto;

    public Rectangulo(double ancho, double alto) {
        super("Rectángulo");
        this.ancho = ancho;
        this.alto = alto;
    }

    @Override
    public double calcularArea() {
        return ancho * alto;
    }
}
