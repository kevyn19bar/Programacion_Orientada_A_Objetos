package TallerN3Abstraccion.Ejercicio2;

public class MainNomina {
    public static void main(String[] args) {
        EmpleadoFijo ef = new EmpleadoFijo("Ana Ríos", "1111", 2200000);
        EmpleadoPorHoras eh = new EmpleadoPorHoras("Luis Mora", "2222", 80, 15000);
        EmpleadoFreelance efl = new EmpleadoFreelance("Harwin Lazcano", "3333", 3, 500000); // Reto

        System.out.println("--- EMPLEADO FIJO ---");
        ef.mostrarRecibo();

        System.out.println("\n--- EMPLEADO POR HORAS ---");
        eh.mostrarRecibo();

        System.out.println("\n--- EMPLEADO FREELANCE (RETO) ---");
        efl.mostrarRecibo();
    }
}
