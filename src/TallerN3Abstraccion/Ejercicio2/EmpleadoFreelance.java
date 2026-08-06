package TallerN3Abstraccion.Ejercicio2;

/**
 * RETO DE ANDAMIAJE: Empleado pagado por proyectos terminados.
 */
public class EmpleadoFreelance extends Empleado {
    private int proyectosTerminados;
    private double pagoPorProyecto;

    public EmpleadoFreelance(String nombre, String documento, int proyectosTerminados, double pagoPorProyecto) {
        super(nombre, documento);
        this.proyectosTerminados = proyectosTerminados;
        this.pagoPorProyecto = pagoPorProyecto;
    }

    @Override
    public double calcularPago() {
        // Si no terminó ningún proyecto (0), el pago resultará automáticamente $0.0
        return proyectosTerminados * pagoPorProyecto;
    }
}
