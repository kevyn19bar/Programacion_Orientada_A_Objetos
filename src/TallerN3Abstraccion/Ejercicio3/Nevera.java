package TallerN3Abstraccion.Ejercicio3;

public class Nevera extends Electrodomestico {

    public Nevera(String marca) {
        super(marca);
    }

    @Override
    public void funcionPrincipal() {
        if (encendido) {
            System.out.println("Enfriando alimentos a 4 °C...");
        } else {
            System.out.println("Enciéndala primero.");
        }
    }
}
