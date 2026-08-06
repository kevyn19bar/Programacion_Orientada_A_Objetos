package TallerN1Encapsulamiento.RetoIntegrador;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Clase EncapsulamientoTallerN1.RetoIntegrador.Paciente que protege información sensible cumpliendo con Ley de Protección de Datos.
 */
public class Paciente {
    private String documento;
    private String nombre;
    private int edad;
    private String tipoSangre;
    private String diagnostico; // Sensible: Sin getter público directamente
    private List<String> alergias;

    // Lista de tipos de sangre permitidos
    private static final List<String> TIPOS_SANGRE_VALIDOS = Arrays.asList(
            "A+", "A-", "B+", "B-", "O+", "O-", "AB+", "AB-"
    );
    private static final String CLAVE_MEDICA_AUTORIZADA = "MED-2026";

    public Paciente(String documento, String nombre, int edad, String tipoSangre) {
        this.documento = documento;
        this.nombre = nombre;
        setEdad(edad);
        setTipoSangre(tipoSangre);
        this.diagnostico = "Sin diagnóstico asignado";
        this.alergias = new ArrayList<>();
    }

    // Getters públicos (Información básica)
    public String getDocumento() { return documento; }
    public String getNombre() { return nombre; }
    public int getEdad() { return edad; }
    public String getTipoSangre() { return tipoSangre; }

    // Setters con reglas de negocio
    public void setEdad(int edad) {
        if (edad >= 0 && edad <= 120) {
            this.edad = edad;
        } else {
            System.out.println("Error: La edad debe estar entre 0 y 120 años.");
        }
    }

    public void setTipoSangre(String tipoSangre) {
        if (tipoSangre != null && TIPOS_SANGRE_VALIDOS.contains(tipoSangre.toUpperCase())) {
            this.tipoSangre = tipoSangre.toUpperCase();
        } else {
            System.out.println("Error: Tipo de sangre inválido. Debe ser uno de: " + TIPOS_SANGRE_VALIDOS);
        }
    }

    // Métodos restringidos mediante clave médica
    public String consultarDiagnostico(String claveMedico) {
        if (CLAVE_MEDICA_AUTORIZADA.equals(claveMedico)) {
            return this.diagnostico;
        } else {
            return "ACCESO DENEGADO: Clave médica incorrecta o no autorizada.";
        }
    }

    public void actualizarDiagnostico(String nuevoDiagnostico, String claveMedico) {
        if (CLAVE_MEDICA_AUTORIZADA.equals(claveMedico)) {
            this.diagnostico = nuevoDiagnostico;
            System.out.println("Diagnóstico actualizado con éxito.");
        } else {
            System.out.println("Error: No tiene autorización para actualizar el diagnóstico.");
        }
    }

    // Manejo de alergias
    public void agregarAlergia(String alergia) {
        if (alergia != null && !alergia.trim().isEmpty()) {
            alergias.add(alergia);
            System.out.println("Alergia '" + alergia + "' agregada al expediente.");
        }
    }

    public boolean tieneAlergias() {
        return !alergias.isEmpty();
    }

    public List<String> getAlergias() {
        return new ArrayList<>(alergias); // Retorna copia para no exponer la lista original
    }
}