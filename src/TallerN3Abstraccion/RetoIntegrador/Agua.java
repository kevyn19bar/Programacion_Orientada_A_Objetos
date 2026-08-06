package TallerN3Abstraccion.RetoIntegrador;

public class Agua extends ServicioPublico {

    public Agua(String numeroContrato, String titular, double consumoM3) {
        super(numeroContrato, titular, consumoM3);
    }

    @Override
    public double calcularFactura() {
        // $3.500 por m³ + Cargo fijo $8.000
        return (consumoMes * 3500.0) + 8000.0;
    }
}
