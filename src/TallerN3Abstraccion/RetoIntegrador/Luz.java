package TallerN3Abstraccion.RetoIntegrador;

public class Luz extends ServicioPublico {

    public Luz(String numeroContrato, String titular, double consumoKWh) {
        super(numeroContrato, titular, consumoKWh);
    }

    @Override
    public double calcularFactura() {
        // $650 por kWh + Cargo fijo $12.000
        return (consumoMes * 650.0) + 12000.0;
    }
}
