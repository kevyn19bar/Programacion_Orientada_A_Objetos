package TallerN3Abstraccion.Ejercicio4;

/**
 * Clase abstracta que define el contrato para procesar pagos en la plataforma.
 */
public abstract class MedioPago {
    protected double monto;

    public MedioPago(double monto) {
        this.monto = monto;
    }

    public abstract void procesarPago();

    public void mostrarMonto() {
        System.out.println("Monto a pagar: $" + String.format("%.2f", monto));
    }
}
