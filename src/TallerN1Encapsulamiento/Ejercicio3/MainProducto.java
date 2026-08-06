package TallerN1Encapsulamiento.Ejercicio3;

public class MainProducto {
    public static void main(String[] args) {
        Producto p = new Producto("P-001", "Teclado Mecánico", 180000, 10);

        System.out.println("Producto: " + p.getNombre());
        System.out.println("Precio inicial: $" + p.getPrecio());
        System.out.println("Stock disponible: " + p.getStock());

        p.vender(3);
        p.vender(20); // Debe fallar por falta de stock

        System.out.println("\n--- PRUEBA DEL RETO (DESCUENTO Y STOCK) ---");
        p.aplicarDescuento(15); // Aplicar 15% de descuento
        System.out.println("¿Hay producto en stock?: " + (p.hayStock() ? "Sí" : "No"));

        p.reabastecer(5);
        System.out.println("Stock final: " + p.getStock());
    }
}