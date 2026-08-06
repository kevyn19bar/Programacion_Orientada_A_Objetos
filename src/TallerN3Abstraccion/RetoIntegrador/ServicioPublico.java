package TallerN3Abstraccion.RetoIntegrador;

/**
 * Clase abstracta que define la estructura y fórmula base para la facturación de servicios.
 */
public abstract class ServicioPublico {
    protected String numeroContrato;
    protected String titular;
    protected double consumoMes;

    public ServicioPublico(String numeroContrato, String titular, double consumoMes) {
        this.numeroContrato = numeroContrato;
        this.titular = titular;
        this.consumoMes = consumoMes;
    }

    // Método abstracto obligatorio
    public abstract double calcularFactura();

    // Método concreto que utiliza el resultado de calcularFactura()
    public void emitirRecibo() {
        System.out.println("=========================================");
        System.out.println("   FACTURA DE SERVICIOS PÚBLICOS DE CÚCUTA");
        System.out.println("=========================================");
        System.out.println("Contrato N°: " + numeroContrato);
        System.out.println("Titular:     " + titular);
        System.out.println("Consumo Mes: " + consumoMes);
        System.out.println("TOTAL A PAGAR: $" + String.format("%.2f", calcularFactura()));
        System.out.println("=========================================\n");
    }
}
