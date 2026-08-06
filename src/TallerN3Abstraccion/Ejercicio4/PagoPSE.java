package TallerN3Abstraccion.Ejercicio4;

/**
 * RETO DE ANDAMIAJE: Pago por transferencia PSE con selección de entidad bancaria.
 */
public class PagoPSE extends MedioPago {
    private String banco;

    public PagoPSE(double monto, String banco) {
        super(monto);
        this.banco = banco;
    }

    @Override
    public void procesarPago() {
        System.out.println("1. Redirigiendo a la plataforma del banco: " + banco + "...");
        System.out.println("2. Esperando confirmación de transferencia por $" + monto + "...");
        System.out.println("3. ¡Pago PSE aprobado exitosamente por " + banco + "!");
    }
}
