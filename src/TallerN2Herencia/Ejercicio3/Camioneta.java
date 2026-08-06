package TallerN2Herencia.Ejercicio3;

public class Camioneta extends Vehiculo{

    private int capacidadCarga;

    public Camioneta(String marca, String modelo, double precio, int capacidadCarga) {
        super(marca, modelo, precio);
        this.capacidadCarga= capacidadCarga;
    }

    @Override
    public void describir() {
        super.describir(); // Reutiliza el metodo del padre
        System.out.println("Tipo: Camioneta - " + capacidadCarga + " kg de carga");
    }
}
