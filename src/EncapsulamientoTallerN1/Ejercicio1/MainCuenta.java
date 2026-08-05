package EncapsulamientoTallerN1.Ejercicio1;

import EncapsulamientoTallerN1.Ejercicio1.CuentaBancaria;

public class MainCuenta {
    public static void main(String[] args) {
        // Creación de dos cuentas de prueba
        CuentaBancaria cuenta1 = new CuentaBancaria("001-2345", "Carlos Perez");
        CuentaBancaria cuenta2 = new CuentaBancaria("002-9876", "Laura Gomez");

        System.out.println("--- PRUEBAS INICIALES ---");
        cuenta1.depositar(500000);
        cuenta1.retirar(150000);
        cuenta1.retirar(1000000); // Debe fallar por saldo insuficiente

        System.out.println("\n--- PRUEBA DEL RETO (TRANSFERENCIA) ---");
        System.out.println("Saldo inicial Carlos: $" + cuenta1.getSaldo());
        System.out.println("Saldo inicial Laura: $" + cuenta2.getSaldo());

        // Intento de transferencia válida
        cuenta1.transferir(cuenta2, 100000);

        System.out.println("Saldo final Carlos: $" + cuenta1.getSaldo());
        System.out.println("Saldo final Laura: $" + cuenta2.getSaldo());
    }
}