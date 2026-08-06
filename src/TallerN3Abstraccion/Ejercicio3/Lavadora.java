package TallerN3Abstraccion.Ejercicio3;

/**
 * RETO DE ANDAMIAJE: Subclase Lavadora con comportamiento específico y método único.
 */
public class Lavadora extends Electrodomestico {

    public Lavadora(String marca) {
        super(marca);
    }

    @Override
    public void funcionPrincipal() {
        if (encendido) {
            System.out.println("Lavando ropa a 40 °C durante 45 minutos...");
        } else {
            System.out.println("Enciéndala primero.");
        }
    }

    // Método específico de la Lavadora
    public void centrifugar() {
        if (encendido) {
            System.out.println("Iniciando ciclo de centrifugado a alta velocidad.");
        } else {
            System.out.println("No se puede centrifugar. La lavadora está apagada.");
        }
    }
}