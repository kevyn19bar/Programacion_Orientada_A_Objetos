package TallerN3Abstraccion.Ejercicio3;

public class Televisor extends Electrodomestico {

    public Televisor(String marca) {
        super(marca);
    }

    @Override
    public void funcionPrincipal() {
        if (encendido) {
            System.out.println("Mostrando el canal en pantalla...");
        } else {
            System.out.println("Enciéndalo primero.");
        }
    }
}
