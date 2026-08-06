package TallerN2Herencia.Ejercicio2;

public class MainEmpresa {
    public static void main(String[] args) {
        Vendedor v = new Vendedor("Ana Lopez", "1234", 1500000, 350000);
        Gerente g = new Gerente("Pedro Ruiz", "5678", 3000000, 800000);
        AprendizSena useche = new AprendizSena("Useche Rojas", "12345",500000);
        v.mostrarInfo();
        System.out.println("---");
        g.mostrarInfo();
        System.out.println("---");
        useche.mostrarInfo();
    }
}
