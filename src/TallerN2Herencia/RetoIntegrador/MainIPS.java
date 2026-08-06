package TallerN2Herencia.RetoIntegrador;

public class MainIPS {
    public static void main(String[] args) {
        // 1. Crear un médico con 20 consultas del mes
        Medico medico = new Medico("1090111222", "Dr. Andrés Cepeda", 4000000, "Pediatría", 20);

        // 2. Crear un enfermero del turno noche
        Enfermero enfermero = new Enfermero("1090333444", "Enf. María Rodríguez", 2200000, "noche");

        // 3. Crear un administrativo de facturación
        Administrativo admin = new Administrativo("1090555666", "Laura Camacho", 1800000, "Facturación");

        System.out.println("=== REGISTRO DE ASISTENCIAS ===");
        medico.registrarAsistencia();
        enfermero.registrarAsistencia();
        admin.registrarAsistencia();

        System.out.println("\n=== NÓMINA DEL PERSONAL DE LA IPS ===");

        System.out.println("\n-------------------------------------------");
        medico.mostrarInfo();

        System.out.println("\n-------------------------------------------");
        enfermero.mostrarInfo();

        System.out.println("\n-------------------------------------------");
        admin.mostrarInfo();
        System.out.println("-------------------------------------------");
    }
}
