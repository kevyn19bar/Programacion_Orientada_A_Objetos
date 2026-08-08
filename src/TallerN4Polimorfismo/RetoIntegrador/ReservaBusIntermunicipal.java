package TallerN4Polimorfismo.RetoIntegrador;

public class ReservaBusIntermunicipal extends Reserva {
    private String origen;
    private String destino;
    private double precioFijo;

    public ReservaBusIntermunicipal(String titular, String origen, String destino, double precioFijo) {
        super(titular);
        this.origen = origen;
        this.destino = destino;
        this.precioFijo = precioFijo;
    }

    @Override
    public double calcularPrecio() {
        return precioFijo;
    }

    public String getRuta() {
        return origen + " -> " + destino;
    }
}
