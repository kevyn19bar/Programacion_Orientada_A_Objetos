package TallerN4Polimorfismo.Ejercicio5;

/**
 * Clase base para la flota de vehículos.
 */
public class Vehiculo {
    protected String placa;

    public Vehiculo(String placa) {
        this.placa = placa;
    }

    public void mover() {
        System.out.println("El vehículo " + placa + " se mueve.");
    }

    public String getPlaca() {
        return placa;
    }
}
