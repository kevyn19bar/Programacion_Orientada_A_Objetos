package TallerN2Herencia.Ejercicio4;

public class MainFiguras {
    public static void main(String[] args) {
        Circulo c = new Circulo("Rojo", 5);
        Rectangulo r = new Rectangulo("Azul", 4, 6);
        Triangulo t = new Triangulo("Verde", 3, 8); // Instancia del reto

        System.out.println("=== CÁLCULOS DIRECTOS ===");
        System.out.println("Círculo " + c.getColor() + " - Área: " + String.format("%.2f", c.calcularArea()));
        System.out.println("Rectángulo " + r.getColor() + " - Área: " + String.format("%.2f", r.calcularArea()));
        System.out.println("Triángulo " + t.getColor() + " - Área: " + String.format("%.2f", t.calcularArea()));

        System.out.println("\n=== USO DEL MÉTODO DESCRIBIR() (RETO EXTRA) ===");
        c.describir();
        r.describir();
        t.describir();
    }
}
