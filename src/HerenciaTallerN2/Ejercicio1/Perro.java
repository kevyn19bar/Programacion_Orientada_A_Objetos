package HerenciaTallerN2.Ejercicio1;

public class Perro extends Animal {
    public Perro(String nombre, int edad, String especie) {
        super(nombre, edad, especie); // Llama al constructor del padre
    }
    @Override
    public void hacerSonido() {
        System.out.println(nombre + " Dice: Guau guau!");
    }
    public void perseguirCola() {
        System.out.println(nombre + " persigue su cola.");
    }
}