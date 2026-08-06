package TallerN3Abstraccion.Ejercicio5;

/**
 * RETO DE ANDAMIAJE: Canal de notificación por WhatsApp.
 */
public class NotificacionWhatsApp extends Notificacion {

    public NotificacionWhatsApp(String numeroWhatsApp, String mensaje) {
        super(numeroWhatsApp, mensaje);
    }

    @Override
    public void enviar() {
        System.out.println("Enviando WhatsApp a " + destinatario + ": " + mensaje);
        registrarEnvio();
    }
}
