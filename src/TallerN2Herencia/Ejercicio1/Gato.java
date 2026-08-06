package TallerN2Herencia.Ejercicio1;

public class Gato extends Animal {
    public Gato(String nombre, int edad, String especie) {
        super(nombre, edad, especie);
    }
    @Override
    public void hacerSonido() {
        System.out.println(nombre + " Dice: Miau!");
    }
    public void ronronear() {
        System.out.println(nombre + " ronronea felizmente.");
    }
}