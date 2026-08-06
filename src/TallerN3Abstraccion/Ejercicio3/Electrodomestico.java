package TallerN3Abstraccion.Ejercicio3;

/**
 * Clase abstracta que combina comportamiento concreto (encender/apagar) y abstracto (función principal).
 */
public abstract class Electrodomestico {
    protected String marca;
    protected boolean encendido;

    public Electrodomestico(String marca) {
        this.marca = marca;
        this.encendido = false;
    }

    // Métodos concretos compartidos
    public void encender() {
        encendido = true;
        System.out.println(marca + " está encendido.");
    }

    public void apagar() {
        encendido = false;
        System.out.println(marca + " está apagado.");
    }

    // Método abstracto que varía según el dispositivo
    public abstract void funcionPrincipal();
}
