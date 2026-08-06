package TallerN1Encapsulamiento.RetoIntegrador;

public class MainIPS {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE HISTORIA CLÍNICA IPS ===");

        // 1. Crear EncapsulamientoTallerN1.RetoIntegrador.Paciente
        Paciente paciente = new Paciente("1090876543", "Ana Martinez", 28, "O+");

        // 2. Intentar consultar diagnóstico con clave incorrecta
        System.out.println("\n-- Consulta con Clave Incorrecta --");
        System.out.println("Resultado: " + paciente.consultarDiagnostico("CLAVE-1234"));

        // 3. Asignar y consultar diagnóstico con la clave autorizada
        System.out.println("\n-- Actualización y Consulta Médica Autorizada --");
        paciente.actualizarDiagnostico("Cuadro leve de migraña por estrés", "MED-2026");
        System.out.println("Diagnóstico obtenido: " + paciente.consultarDiagnostico("MED-2026"));

        // 4. Agregar alergias
        System.out.println("\n-- Registro de Alergias --");
        paciente.agregarAlergia("Penicilina");
        paciente.agregarAlergia("Polen");

        // 5. Mostrar información pública general del paciente
        System.out.println("\n=== FICHA DEL PACIENTE ===");
        System.out.println("Documento: " + paciente.getDocumento());
        System.out.println("Nombre: " + paciente.getNombre());
        System.out.println("Edad: " + paciente.getEdad() + " años");
        System.out.println("Tipo de Sangre: " + paciente.getTipoSangre());
        System.out.println("¿Registra Alergias?: " + (paciente.tieneAlergias() ? "Sí" : "No"));
        System.out.println("Lista de Alergias: " + paciente.getAlergias());
    }
}