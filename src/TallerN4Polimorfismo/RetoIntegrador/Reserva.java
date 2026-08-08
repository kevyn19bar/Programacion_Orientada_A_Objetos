package TallerN4Polimorfismo.RetoIntegrador;

/**
 * Clase abstracta / base para cualquier tipo de reserva en la agencia.
 */
public class Reserva {
    protected String titular;

    public Reserva(String titular) {
        this.titular = titular;
    }

    public double calcularPrecio() {
        return 0.0;
    }

    public String getTitular() {
        return titular;
    }
}
