package TallerN2Herencia.Ejercicio1;

public class Animal {
    protected String nombre;
    protected int edad;
    protected String especie;
    public Animal(String nombre, int edad, String especie) {
        this.nombre = nombre;
        this.edad = edad;
        this.especie = especie;
    }
    public void comer() {
        System.out.println(nombre + " esta comiendo.");
    }
    public void dormir() {
        System.out.println(nombre + " esta durmiendo.");
    }
    public void hacerSonido() {
        System.out.println(nombre + " emite un sonido.");
    }

    public void presentarse(){
        System.out.println("Mi nombre es :" + nombre + "\nMi edad es : " + edad + " Años" + "\nSoy de la especie : " + especie);
    }

}