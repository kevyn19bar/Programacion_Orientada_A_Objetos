package TallerN3Abstraccion.Ejercicio1;

public class MainFiguras {
    public static void main(String[] args) {
        // Intento de instanciar la clase abstracta (Descomentar para ver el error):
        // Figura f = new Figura("Desconocida");
        // Error de compilación: 'Figura' is abstract; cannot be instantiated

        Circulo c = new Circulo(5);
        Triangulo t = new Triangulo(4, 6);
        Rectangulo r = new Rectangulo(5, 8); // Instancia del reto

        System.out.println("=== CÍRCULO ===");
        c.mostrar();

        System.out.println("\n=== TRIÁNGULO ===");
        t.mostrar();

        System.out.println("\n=== RECTÁNGULO (RETO) ===");
        r.mostrar();
    }
}
