package TallerN2Herencia.RetoIntegrador;

public class Enfermero extends PersonalIPS {
    private String turno; // "mañana", "tarde", "noche"

    public Enfermero(String documento, String nombre, double salarioBase, String turno) {
        super(documento, nombre, salarioBase);
        this.turno = turno;
    }

    @Override
    public double calcularSalarioMensual() {
        // Gana $200.000 de bonificación si el turno es "noche"
        if (turno != null && turno.equalsIgnoreCase("noche")) {
            return salarioBase + 200000.0;
        }
        return salarioBase;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Rol: Enfermero/a | Turno: " + turno);
    }
}
