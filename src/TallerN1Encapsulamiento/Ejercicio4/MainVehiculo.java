package TallerN1Encapsulamiento.Ejercicio4;

public class MainVehiculo {
    public static void main(String[] args) {
        Vehiculo v = new Vehiculo("ABC123", "Renault", "Logan");

        System.out.println("Vehículo registrado: " + v.getMarca() + " " + v.getModelo());

        v.acelerar();
        v.acelerar();
        v.acelerar();
        v.frenar();

        System.out.println("\n--- PRUEBA DEL RETO (KILOMETRAJE Y RESET) ---");
        System.out.println("Kilometraje total recorrido: " + String.format("%.2f", v.getKilometrajeTotal()) + " km");

        v.reset();
        System.out.println("Velocidad tras reset: " + v.getVelocidad() + " km/h");
    }
}