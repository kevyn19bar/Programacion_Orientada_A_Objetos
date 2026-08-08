package TallerN4Polimorfismo.Ejercicio5;

public class MainTransporte {
    public static void main(String[] args) {
        Vehiculo[] flota = {
                new Bus("BUS-001"),
                new Taxi("TAX-555"),
                new Bicicleta("BIC-777"),
                new Bus("BUS-002"),
                new MotoTaxi("MOT-123"), // Reto: MotoTaxi 1
                new MotoTaxi("MOT-999")  // Reto: MotoTaxi 2
        };

        System.out.println("=== RECORRIENDO LA FLOTA DE TRANSPORTE ===");
        for (Vehiculo v : flota) {
            v.mover(); // Comportamiento polimórfico común

            // Verificación y Downcasting usando instanceof
            if (v instanceof Bus) {
                Bus b = (Bus) v;
                b.abrirPuertas();
            } else if (v instanceof MotoTaxi) {
                MotoTaxi mt = (MotoTaxi) v;
                mt.recogerPasajero();
            }
            System.out.println("---");
        }
    }
}