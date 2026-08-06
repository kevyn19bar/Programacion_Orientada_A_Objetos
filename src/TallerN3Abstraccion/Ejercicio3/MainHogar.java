package TallerN3Abstraccion.Ejercicio3;

public class MainHogar {
    public static void main(String[] args) {
        Televisor tv = new Televisor("LG");
        Nevera nv = new Nevera("Samsung");
        Lavadora lav = new Lavadora("Whirlpool"); // Reto

        System.out.println("=== TELEVISOR ===");
        tv.encender();
        tv.funcionPrincipal();

        System.out.println("\n=== NEVERA ===");
        nv.funcionPrincipal(); // Fallará por no estar encendida
        nv.encender();
        nv.funcionPrincipal();

        System.out.println("\n=== LAVADORA (RETO) ===");
        lav.encender();
        lav.funcionPrincipal();
        lav.centrifugar();
    }
}
