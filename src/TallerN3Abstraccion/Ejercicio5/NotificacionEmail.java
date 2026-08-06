package TallerN3Abstraccion.Ejercicio5;

public class NotificacionEmail extends Notificacion {

    public NotificacionEmail(String correo, String mensaje) {
        super(correo, mensaje);
    }

    @Override
    public void enviar() {
        System.out.println("Enviando EMAIL a " + destinatario);
        System.out.println("Asunto: Notificación del sistema");
        System.out.println("Mensaje: " + mensaje);
        registrarEnvio(); // Invocación del método heredado
    }
}
