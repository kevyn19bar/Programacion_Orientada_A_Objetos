package TallerN2Herencia.Ejercicio5;

/**
 * Clase padre para usuarios de la plataforma tipo Sofia Plus.
 */
public class Usuario {
    protected String nombre;
    protected String correo;

    public Usuario(String nombre, String correo) {
        this.nombre = nombre;
        this.correo = correo;
    }

    public void iniciarSesion() {
        System.out.println("Bienvenido, " + nombre + " (" + correo + ")");
    }
}
