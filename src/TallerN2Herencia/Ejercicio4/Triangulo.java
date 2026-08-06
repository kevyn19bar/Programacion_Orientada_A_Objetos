package TallerN2Herencia.Ejercicio4;

/**
 * RETO DE ANDAMIAJE: Figura con base y altura.
 */
public class Triangulo extends Figura {
    private double base;
    private double altura;

    public Triangulo(String color, double base, double altura) {
        super(color);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2.0;
    }
}
