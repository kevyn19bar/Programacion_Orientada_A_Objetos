package TallerN2Herencia.RetoIntegrador;

public class Administrativo extends PersonalIPS {
    private String area; // p. ej. "Recepción", "Facturación"

    public Administrativo(String documento, String nombre, double salarioBase, String area) {
        super(documento, nombre, salarioBase);
        this.area = area;
    }

    @Override
    public double calcularSalarioMensual() {
        return salarioBase; // Solo gana el salario base
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Rol: Administrativo | Área: " + area);
    }
}
