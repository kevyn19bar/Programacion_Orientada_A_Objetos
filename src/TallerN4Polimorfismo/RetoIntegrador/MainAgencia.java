package TallerN4Polimorfismo.RetoIntegrador;

public class MainAgencia {
    public static void main(String[] args) {
        System.out.println("=== AGENCIA DE VIAJES CÚCUTA - CARRITO DE RESERVAS ===");

        // Arreglo mezclado con al menos 5 reservas
        Reserva[] carrito = {
                new ReservaVuelo("Harwin Lazcano", 1200, false),               // Vuelo Nacional
                new ReservaVuelo("Laura Gómez", 4500, true),                   // Vuelo Internacional
                new ReservaHotel("Carlos Perez", 3, 180000),                   // Hotel (3 noches)
                new ReservaBusIntermunicipal("Ana Lopez", "Cúcuta", "Bucaramanga", 60000), // Bus
                new ReservaHotel("Mariana Ruiz", 5, 250000)                    // Hotel (5 noches)
        };

        double totalCarrito = 0.0;

        for (int i = 0; i < carrito.length; i++) {
            Reserva r = carrito[i];
            double precio = r.calcularPrecio();
            totalCarrito += precio;

            System.out.println("\n[Reserva #" + (i + 1) + "] Titular: " + r.getTitular());
            System.out.println("Tipo: " + r.getClass().getSimpleName());
            System.out.println("Precio: $" + String.format("%.2f", precio));

            // Uso de instanceof para identificar ReservaVuelo y llamar a esInternacional()
            if (r instanceof ReservaVuelo) {
                ReservaVuelo vuelo = (ReservaVuelo) r;
                if (vuelo.esInternacional()) {
                    System.out.println("-> Tipo de Vuelo: INTERNACIONAL (Requiere pasaporte)");
                } else {
                    System.out.println("-> Tipo de Vuelo: NACIONAL");
                }
            }
        }

        System.out.println("\n==================================================");
        System.out.println("TOTAL FINAL DEL CARRITO: $" + String.format("%.2f", totalCarrito));
        System.out.println("==================================================");
    }
}
