package TallerN3Abstraccion.Ejercicio5;

public class NotificacionSMS extends Notificacion {

    public NotificacionSMS(String celular, String mensaje) {
        super(celular, mensaje);
    }

    @Override
    public void enviar() {
        System.out.println("Enviando SMS al número " + destinatario);
        System.out.println("SMS: " + mensaje);
        registrarEnvio();
    }
}
