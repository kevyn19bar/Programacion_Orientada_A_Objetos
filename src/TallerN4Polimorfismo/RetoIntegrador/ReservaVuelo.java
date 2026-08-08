package TallerN4Polimorfismo.RetoIntegrador;

public class ReservaVuelo extends Reserva {
    private double distanciaKm;
    private boolean internacional;

    public ReservaVuelo(String titular, double distanciaKm, boolean internacional) {
        super(titular);
        this.distanciaKm = distanciaKm;
        this.internacional = internacional;
    }

    @Override
    public double calcularPrecio() {
        // Fórmula: distancia x 500 + $150.000
        return (distanciaKm * 500.0) + 150000.0;
    }

    // Método único para la clase ReservaVuelo
    public boolean esInternacional() {
        return internacional;
    }
}
