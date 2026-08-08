package TallerN4Polimorfismo.RetoIntegrador;

public class ReservaHotel extends Reserva {
    private int noches;
    private double precioPorNoche;

    public ReservaHotel(String titular, int noches, double precioPorNoche) {
        super(titular);
        this.noches = noches;
        this.precioPorNoche = precioPorNoche;
    }

    @Override
    public double calcularPrecio() {
        return noches * precioPorNoche;
    }
}
