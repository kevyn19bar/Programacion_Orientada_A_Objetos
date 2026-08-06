package TallerN3Abstraccion.Ejercicio4;

public class MainTienda {
    public static void main(String[] args) {
        TarjetaCredito t = new TarjetaCredito(250000, "4111-2222-3333-4444");
        PagoEfectivo e = new PagoEfectivo(80000);
        PagoPSE pse = new PagoPSE(150000, "Bancolombia"); // Reto

        System.out.println("--- TARJETA CRÉDITO ---");
        t.mostrarMonto();
        t.procesarPago();

        System.out.println("\n--- PAGO EFECTIVO ---");
        e.mostrarMonto();
        e.procesarPago();

        System.out.println("\n--- PAGO PSE (RETO) ---");
        pse.mostrarMonto();
        pse.procesarPago();
    }
}
