public class Main {
    public static void main(String[] args) {
        // Crear dos cuentas
        CuentaBancaria origen = new CuentaBancaria("001-2345", "Carlos Perez");
        CuentaBancaria destino = new CuentaBancaria("002-6789", "Ana Gomez");

        // Fondos iniciales
        origen.depositar(500000);
        System.out.println("-----------------------------------");

        // Prueba 1: Transferencia exitosa
        System.out.println("--- Prueba 1: Transferencia exitosa ---");
        origen.transferir(destino, 200000);
        System.out.println("Saldo de " + origen.getTitular() + ": $" + origen.getSaldo());
        System.out.println("Saldo de " + destino.getTitular() + ": $" + destino.getSaldo());
        System.out.println("-----------------------------------");

        // Prueba 2: Transferencia fallida por saldo insuficiente
        System.out.println("--- Prueba 2: Saldo insuficiente ---");
        origen.transferir(destino, 400000); // Intenta transferir más de lo que tiene (le quedan $300,000)
        System.out.println("-----------------------------------");

        // Prueba 3: Transferencia fallida por cantidad negativa
        System.out.println("--- Prueba 3: Cantidad negativa ---");
        origen.transferir(destino, -50000);
        System.out.println("-----------------------------------");

        // Saldo final
        System.out.println("Saldo final " + origen.getTitular() + ": $" + origen.getSaldo());
        System.out.println("Saldo final " + destino.getTitular() + ": $" + destino.getSaldo());
    }
}