package TallerN4Polimorfismo.Ejercicio4;

public class MainNomina {
    public static void main(String[] args) {
        Empleado[] nomina = {
                new EmpleadoTiempoCompleto("Ana", 2500000),
                new EmpleadoTiempoCompleto("Luis", 3100000),
                new EmpleadoFreelance("Sofía", 4, 800000),
                new EmpleadoFreelance("Carlos", 2, 1200000),
                new EmpleadoPorHoras("Harwin", 120, 25000), // Reto: Empleado por Horas 1
                new EmpleadoPorHoras("María", 80, 20000)    // Reto: Empleado por Horas 2
        };

        double totalNomina = 0;
        System.out.println("=== REPORTE DE NÓMINA POLIMÓRFICA ===");
        for (Empleado e : nomina) {
            double pago = e.calcularSalario();
            System.out.println(e.getNombre() + " (" + e.getClass().getSimpleName() + "): $" + String.format("%.2f", pago));
            totalNomina += pago;
        }

        System.out.println("----------------------------------------");
        System.out.println("TOTAL NÓMINA A PAGAR: $" + String.format("%.2f", totalNomina));
    }
}
