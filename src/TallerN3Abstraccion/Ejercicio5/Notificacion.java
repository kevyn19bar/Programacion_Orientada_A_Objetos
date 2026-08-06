package TallerN3Abstraccion.Ejercicio5;

/**
 * Clase abstracta para canales de notificación con auditoría centralizada.
 */
public abstract class Notificacion {
    protected String destinatario;
    protected String mensaje;

    public Notificacion(String destinatario, String mensaje) {
        this.destinatario = destinatario;
        this.mensaje = mensaje;
    }

    public abstract void enviar();

    // Método concreto común para auditar el envío en el sistema
    public void registrarEnvio() {
        System.out.println("[LOG] Notificación enviada a " + destinatario);
    }
}
