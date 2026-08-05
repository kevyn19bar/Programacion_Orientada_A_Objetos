package HerenciaTallerN2.Ejercicio3;

public class MainConcesionaria {
    public static void main(String[] args) {
        Carro c = new Carro("Chevrolet", "Spark", 45000000, 4);
        Moto m = new Moto("Yamaha", "FZ", 12000000, 250);
        Camioneta prado = new Camioneta("Yamaha","4x4", 250000000, 500);
        c.describir();
        System.out.println("---");
        m.describir();
        System.out.println("---");
        prado.describir();
    }
}
