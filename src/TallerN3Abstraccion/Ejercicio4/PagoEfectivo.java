package TallerN3Abstraccion.Ejercicio4;

public class PagoEfectivo extends MedioPago {

    public PagoEfectivo(double monto) {
        super(monto);
    }

    @Override
    public void procesarPago() {
        int codigo = (int) (Math.random() * 100000);
        System.out.println("Código de recaudo generado: " + codigo);
        System.out.println("Acérquese a Efecty o Baloto a pagar $" + monto);
    }
}
