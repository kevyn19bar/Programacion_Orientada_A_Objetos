package EncapsulamientoTallerN1.Ejercicio4;

/**
 * Clase que simula el funcionamiento de un vehículo de carga.
 */
public class Vehiculo {
    private String placa;
    private String marca;
    private String modelo;
    private int velocidad;
    private double kilometrajeTotal; // Agregado en el reto de andamiaje

    // Constantes de clase para límites de velocidad
    private static final int VEL_MAX = 200;
    private static final int VEL_MIN = 0;

    public Vehiculo(String placa, String marca, String modelo) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = 0;
        this.kilometrajeTotal = 0.0;
    }

    // Getters
    public String getPlaca() { return placa; }
    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }
    public int getVelocidad() { return velocidad; }
    public double getKilometrajeTotal() { return kilometrajeTotal; }

    public void acelerar() {
        if (velocidad + 10 <= VEL_MAX) {
            velocidad += 10;
            // RETO DE ANDAMIAJE: Se incrementa el kilometraje en (velocidad / 100)
            kilometrajeTotal += ((double) velocidad / 100.0);
            System.out.println("Acelerando... Velocidad actual: " + velocidad + " km/h");
        } else {
            System.out.println("Atención: No puede superar el límite de " + VEL_MAX + " km/h.");
        }
    }

    public void frenar() {
        if (velocidad - 10 >= VEL_MIN) {
            velocidad -= 10;
            System.out.println("Frenando... Velocidad actual: " + velocidad + " km/h");
        } else {
            velocidad = 0;
            System.out.println("Vehículo completamente detenido.");
        }
    }

    /**
     * RETO DE ANDAMIAJE: Reinicia la velocidad a 0.
     */
    public void reset() {
        this.velocidad = 0;
        System.out.println("Reinicio de emergencia ejecutado. Velocidad establecida en 0 km/h.");
    }
}