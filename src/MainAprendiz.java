public class MainAprendiz {
    public static void main(String[] args) {
        Aprendiz a = new Aprendiz("1090123456", "Laura Gomez");

        a.setEdad(19);
        a.setNotaFinal(4.2);
        a.setNotaFinal(7.0); // Rechazado por validación

        System.out.println("\n--- PRUEBA DEL RETO (CORREO INSTITUCIONAL) ---");
        a.setCorreoInstitucional("laura.gomez.sena.edu.co"); // Inválido (falta @)
        a.setCorreoInstitucional("laura.gomez@sena.edu.co");  // Válido

        System.out.println("\n--- DATOS DEL APRENDIZ ---");
        System.out.println("Nombre: " + a.getNombre());
        System.out.println("Edad: " + a.getEdad());
        System.out.println("Nota Final: " + a.getNotaFinal());
        System.out.println("Correo: " + a.getCorreoInstitucional());
        System.out.println("¿Aprobó?: " + (a.aprobo() ? "Sí" : "No"));
    }
}