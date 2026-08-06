package TallerN1Encapsulamiento.Ejercicio1;

/**
 * Clase que representa una Cuenta Bancaria aplicando encapsulamiento.
 */
public class CuentaBancaria {
    // Atributos privados: protegidos contra modificaciones externas no autorizadas
    private String numeroCuenta;
    private String titular;
    private double saldo;

    // Constructor
    public CuentaBancaria(String numeroCuenta, String titular) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = 0.0; // Saldo inicial por defecto
    }

    // Getters de solo lectura
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    // Método encapsulado para depositar con validación
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Depósito exitoso de $" + cantidad + " en la cuenta " + numeroCuenta);
        } else {
            System.out.println("Error: La cantidad a depositar debe ser positiva.");
        }
    }

    // Método encapsulado para retirar con validación
    public void retirar(double cantidad) {
        if (cantidad <= 0) {
            System.out.println("Error: La cantidad a retirar debe ser positiva.");
        } else if (cantidad > saldo) {
            System.out.println("Error: Saldo insuficiente en la cuenta " + numeroCuenta);
        } else {
            saldo -= cantidad;
            System.out.println("Retiro exitoso de $" + cantidad + " de la cuenta " + numeroCuenta);
        }
    }

    /**
     * RETO DE ANDAMIAJE: Transfiere dinero desde esta cuenta hacia una cuenta destino.
     */
    public void transferir(CuentaBancaria destino, double cantidad) {
        if (destino == null) {
            System.out.println("Error: La cuenta destino no existe.");
            return;
        }
        if (cantidad <= 0) {
            System.out.println("Error: La cantidad a transferir debe ser positiva.");
        } else if (cantidad > this.saldo) {
            System.out.println("Error: Saldo insuficiente para realizar la transferencia.");
        } else {
            this.retirar(cantidad);
            destino.depositar(cantidad);
            System.out.println("Transferencia completada con éxito hacia la cuenta de " + destino.getTitular());
        }
    }
}