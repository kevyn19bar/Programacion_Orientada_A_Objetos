package TallerN3Abstraccion.RetoIntegrador;

public class MainServicios {
    public static void main(String[] args) {
        // Demostración del error de compilación al instanciar la clase abstracta directamente:
        // ServicioPublico sp = new ServicioPublico("000", "Prueba", 10);
        // ERROR: 'ServicioPublico' is abstract; cannot be instantiated

        // Instancias concretas
        Agua agua = new Agua("AGUA-101", "Carlos Perez", 15);     // 15 m³
        Luz luz = new Luz("LUZ-202", "Laura Gómez", 250);        // 250 kWh
        Gas gas = new Gas("GAS-303", "Harwin Lazcano", 12);       // 12 m³

        // Emitir los recibos
        agua.emitirRecibo();
        luz.emitirRecibo();
        gas.emitirRecibo();
    }
}
