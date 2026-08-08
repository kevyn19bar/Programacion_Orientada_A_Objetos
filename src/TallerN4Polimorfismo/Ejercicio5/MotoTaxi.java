package TallerN4Polimorfismo.Ejercicio5;

/**
 * RETO DE ANDAMIAJE: Clase MotoTaxi con metodo específico.
 */
public class MotoTaxi extends Vehiculo {
    public MotoTaxi(String placa) { super(placa); }

    @Override
    public void mover() {
        System.out.println("MotoTaxi " + placa + " se desplaza agilmente entre el tráfico.");
    }

    // Metodo propio
    public void recogerPasajero() {
        System.out.println("MotoTaxi " + placa + ": Casco entregado y pasajero a bordo.");
    }
}
