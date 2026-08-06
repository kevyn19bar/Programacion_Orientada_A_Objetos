package TallerN2Herencia.Ejercicio1;

public class Pajaro extends Animal {
    public Pajaro(String nombre, int edad, String especie) {
        super(nombre, edad, especie);
    }
    @Override
    public void hacerSonido() {
        System.out.println(nombre + " Dice : Pio Pio.");
    }
    public void vuela() {
        System.out.println(nombre + " Vuela.");
    }
}
