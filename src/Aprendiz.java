/**
 * Clase que gestiona la información de un Aprendiz SENA.
 */
public class Aprendiz {
    private String documento;
    private String nombre;
    private int edad;
    private double notaFinal;
    private String correoInstitucional; // Agregado en el reto de andamiaje

    public Aprendiz(String documento, String nombre) {
        this.documento = documento;
        this.nombre = nombre;
        this.edad = 0;
        this.notaFinal = 0.0;
        this.correoInstitucional = "No asignado";
    }

    // Getters
    public String getDocumento() { return documento; }
    public String getNombre() { return nombre; }
    public int getEdad() { return edad; }
    public double getNotaFinal() { return notaFinal; }
    public String getCorreoInstitucional() { return correoInstitucional; }

    // Setter con validación para Edad (0 a 100 años)
    public void setEdad(int edad) {
        if (edad >= 0 && edad <= 100) {
            this.edad = edad;
        } else {
            System.out.println("Error: Edad inválida. Debe estar entre 0 y 100.");
        }
    }

    // Setter con validación para Nota Final (0.0 a 5.0)
    public void setNotaFinal(double nota) {
        if (nota >= 0.0 && nota <= 5.0) {
            this.notaFinal = nota;
        } else {
            System.out.println("Error: Nota inválida (" + nota + "). Debe estar entre 0.0 y 5.0.");
        }
    }

    /**
     * RETO DE ANDAMIAJE: Valida que el correo contenga el carácter '@'
     */
    public void setCorreoInstitucional(String correo) {
        if (correo != null && correo.contains("@")) {
            this.correoInstitucional = correo;
            System.out.println("Correo registrado correctamente: " + correo);
        } else {
            System.out.println("Error: El correo '" + correo + "' es inválido. Debe contener '@'.");
        }
    }

    // Método que calcula el estado de aprobación
    public boolean aprobo() {
        return notaFinal >= 3.5;
    }
}