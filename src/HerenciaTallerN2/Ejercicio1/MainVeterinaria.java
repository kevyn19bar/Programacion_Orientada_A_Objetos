package HerenciaTallerN2.Ejercicio1;

public class MainVeterinaria {
    public static void main(String[] args) {
        Perro firulais = new Perro("Firulais", 4, "Chihuahua");
        Gato michi = new Gato("Michi", 2, "Siames");
        Pajaro useche = new Pajaro("Useche",3, "Carpintero");
        firulais.comer(); // Heredado del padre
        firulais.hacerSonido(); // Sobrescrito
        firulais.perseguirCola(); // Propio de Perro
        System.out.println("---");
        michi.dormir(); // Heredado del padre
        michi.hacerSonido(); // Sobrescrito
        michi.ronronear(); // Propio de Gato
        michi.presentarse();
        System.out.println("---");
        useche.hacerSonido();
        useche.vuela();
        useche.presentarse();
    }
}