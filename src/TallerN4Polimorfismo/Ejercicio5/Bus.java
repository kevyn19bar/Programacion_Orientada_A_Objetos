package TallerN4Polimorfismo.Ejercicio5;

public class Bus extends Vehiculo {
    public Bus(String placa) { super(placa); }

    @Override
    public void mover() {
        System.out.println("Bus " + placa + " avanza con 40 pasajeros a 60 km/h.");
    }

    // Método propio
    public void abrirPuertas() {
        System.out.println("Bus " + placa + ": Puertas abiertas para pasajeros.");
    }
}
