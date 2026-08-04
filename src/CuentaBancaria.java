public class CuentaBancaria {
    // Atributos privados - encapsulados
    private final String numeroCuenta;
    private final String titular;
    private double saldo;

    public CuentaBancaria(String numeroCuenta, String titular) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = 0.0;
    }

    // Getters - solo lectura desde el exterior
    public String getNumeroCuenta() { return numeroCuenta; }
    public String getTitular() { return titular; }
    public double getSaldo() { return saldo; }

    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Deposito exitoso de $" + cantidad + " en la cuenta de " + titular);
        } else {
            System.out.println("Error: la cantidad debe ser positiva.");
        }
    }

    public void retirar(double cantidad) {
        if (cantidad <= 0) {
            System.out.println("Error: la cantidad debe ser positiva.");
        } else if (cantidad > saldo) {
            System.out.println("Error: saldo insuficiente en la cuenta de " + titular);
        } else {
            saldo -= cantidad;
            System.out.println("Retiro exitoso de $" + cantidad + " de la cuenta de " + titular);
        }
    }

    // NUEVO MÉTODO: Transferir a otra cuenta
    public void transferir(CuentaBancaria destino, double cantidad) {
        // Validacion 1: Verificar que la cuenta de destino exista (no sea null)
        if (destino == null) {
            System.out.println("Error: La cuenta de destino no existe.");
            return;
        }

        // Validacion 2: No se puede transferir a la misma cuenta
        if (destino == this) {
            System.out.println("Error: No puedes transferir dinero a la misma cuenta.");
            return;
        }

        // Validacion 3: La cantidad debe ser mayor a 0
        if (cantidad <= 0) {
            System.out.println("Error: La cantidad a transferir debe ser positiva.");
            return;
        }

        // Validacion 4: Verificar saldo suficiente
        if (cantidad > this.saldo) {
            System.out.println("Error: Saldo insuficiente para realizar la transferencia.");
            return;
        }

        // Si pasa todas las validaciones, ejecutamos la operacion
        this.saldo -= cantidad;
        destino.saldo += cantidad;

        System.out.println("Transferencia exitosa de $" + cantidad + " de " + this.titular + " a " + destino.getTitular());
    }
}