package TallerN2Herencia.Ejercicio5;

public class MainPlataforma {
    public static void main(String[] args) {
        Estudiante e = new Estudiante("Carlos Vega", "carlos@sena.edu.co", 5);
        Instructor i = new Instructor("Marta Soto", "marta@sena.edu.co", "Java");
        Administrador admin = new Administrador("Harwin Lazcano", "admin@sena.edu.co", "TOTAL"); // Reto

        System.out.println("--- ESTUDIANTE ---");
        e.iniciarSesion();

        System.out.println("\n--- INSTRUCTOR ---");
        i.iniciarSesion();

        System.out.println("\n--- ADMINISTRADOR (RETO) ---");
        admin.iniciarSesion();
    }
}
