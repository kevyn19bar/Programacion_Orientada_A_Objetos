package TallerN2Herencia.Ejercicio5;

public class Estudiante extends Usuario {
    private int cursosInscritos;

    public Estudiante(String nombre, String correo, int cursos) {
        super(nombre, correo);
        this.cursosInscritos = cursos;
    }

    @Override
    public void iniciarSesion() {
        super.iniciarSesion(); // Llama al saludo del padre
        System.out.println("Tienes " + cursosInscritos + " cursos disponibles para estudiar.");
    }
}
