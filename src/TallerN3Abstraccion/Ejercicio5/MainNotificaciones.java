package TallerN3Abstraccion.Ejercicio5;

public class MainNotificaciones {
    public static void main(String[] args) {
        NotificacionEmail email = new NotificacionEmail("carlos@sena.edu.co", "Su matrícula fue aprobada.");
        NotificacionSMS sms = new NotificacionSMS("3001234567", "Su pedido está en camino.");
        NotificacionWhatsApp wa = new NotificacionWhatsApp("+573109876543", "Código de verificación: 8842"); // Reto

        System.out.println("--- PRUEBA EMAIL ---");
        email.enviar();

        System.out.println("\n--- PRUEBA SMS ---");
        sms.enviar();

        System.out.println("\n--- PRUEBA WHATSAPP (RETO) ---");
        wa.enviar();
    }
}
