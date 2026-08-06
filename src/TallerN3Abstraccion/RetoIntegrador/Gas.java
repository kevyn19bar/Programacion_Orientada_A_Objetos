package TallerN3Abstraccion.RetoIntegrador;

public class Gas extends ServicioPublico {

    public Gas(String numeroContrato, String titular, double consumoM3) {
        super(numeroContrato, titular, consumoM3);
    }

    @Override
    public double calcularFactura() {
        // $2.100 por m³ + Cargo fijo $5.000
        return (consumoMes * 2100.0) + 5000.0;
    }
}
