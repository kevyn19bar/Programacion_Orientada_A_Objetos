package TallerN2Herencia.Ejercicio5;

/**
 * RETO DE ANDAMIAJE: Usuario administrador con niveles de permiso (TOTAL / PARCIAL).
 */
public class Administrador extends Usuario {
    private String nivelPermiso;

    public Administrador(String nombre, String correo, String nivelPermiso) {
        super(nombre, correo);
        this.nivelPermiso = nivelPermiso;
    }

    @Override
    public void iniciarSesion() {
        super.iniciarSesion();
        System.out.println("Panel de administración con permisos: [" + nivelPermiso + "]");
    }
}
