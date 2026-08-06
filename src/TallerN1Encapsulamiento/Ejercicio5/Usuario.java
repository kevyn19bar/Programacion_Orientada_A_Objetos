package TallerN1Encapsulamiento.Ejercicio5;

/**
 * Clase que gestiona el acceso de usuarios manteniendo la contraseña privada.
 */
public class Usuario {
    private String nombreUsuario;
    private String password; // NUNCA se expone con un getter
    private int intentosFallidos; // Agregado en el reto
    private boolean bloqueado;        // Agregado en el reto

    public Usuario(String nombreUsuario, String passwordInicial) {
        this.nombreUsuario = nombreUsuario;
        this.intentosFallidos = 0;
        this.bloqueado = false;
        cambiarPassword(passwordInicial);
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public boolean isBloqueado() {
        return bloqueado;
    }

    public void cambiarPassword(String nueva) {
        if (esPasswordValida(nueva)) {
            this.password = nueva;
            System.out.println("Contraseña actualizada correctamente.");
        } else {
            System.out.println("Contraseña inválida: Requiere mínimo 8 caracteres y al menos un número.");
        }
    }

    /**
     * RETO DE ANDAMIAJE: Control de bloqueo tras 3 intentos fallidos consecutivas.
     */
    public boolean verificarPassword(String intento) {
        if (bloqueado) {
            System.out.println("ACCESO DENEGADO: La cuenta se encuentra BLOQUEADA.");
            return false;
        }

        if (this.password != null && this.password.equals(intento)) {
            intentosFallidos = 0; // Reinicia el contador de intentos al acertar
            return true;
        } else {
            intentosFallidos++;
            System.out.println("Intento fallido (" + intentosFallidos + "/3)");
            if (intentosFallidos >= 3) {
                bloqueado = true;
                System.out.println("¡ALERTA! Ha superado los 3 intentos fallidos. Cuenta bloqueada.");
            }
            return false;
        }
    }

    // Método de validación interno (privado)
    private boolean esPasswordValida(String pass) {
        if (pass == null || pass.length() < 8) return false;
        for (char c : pass.toCharArray()) {
            if (Character.isDigit(c)) return true;
        }
        return false;
    }
}