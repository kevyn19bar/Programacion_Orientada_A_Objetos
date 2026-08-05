package EncapsulamientoTallerN1.Ejercicio5;

public class MainUsuario {
    public static void main(String[] args) {
        Usuario u = new Usuario("carlos.dev", "clave1234");

        System.out.println("EncapsulamientoTallerN1.Ejercicio5.Usuario: " + u.getNombreUsuario());
        System.out.println("¿Login con 'clave1234'?: " + u.verificarPassword("clave1234"));

        System.out.println("\n--- PRUEBA DEL RETO (BLOQUEO POR INTENTOS) ---");
        System.out.println("Simulando 3 intentos erróneos:");
        u.verificarPassword("error1");
        u.verificarPassword("error2");
        u.verificarPassword("error3");

        // Intento con la clave correcta estando ya bloqueado
        System.out.println("\nIntentando con la contraseña correcta tras el bloqueo:");
        System.out.println("¿Login exitoso?: " + u.verificarPassword("clave1234"));
    }
}