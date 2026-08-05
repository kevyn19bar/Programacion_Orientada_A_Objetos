package EncapsulamientoTallerN1.Ejercicio3;

/**
 * Clase para el control de inventario de un producto comercial.
 */
public class Producto {
    private String codigo;
    private String nombre;
    private double precio;
    private int stock;

    public Producto(String codigo, String nombre, double precio, int stock) {
        this.codigo = codigo;
        this.nombre = nombre;
        setPrecio(precio); // Usa setters para reutilizar validaciones
        setStock(stock);
    }

    // Getters
    public String getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
    public double getPrecio() { return precio; }
    public int getStock() { return stock; }

    // Setters con validación
    public void setPrecio(double precio) {
        if (precio >= 0) {
            this.precio = precio;
        } else {
            System.out.println("Error: El precio no puede ser negativo.");
        }
    }

    public void setStock(int stock) {
        if (stock >= 0) {
            this.stock = stock;
        } else {
            System.out.println("Error: El stock no puede ser negativo.");
        }
    }

    // Lógica de ventas
    public void vender(int unidades) {
        if (unidades <= 0) {
            System.out.println("Error: Cantidad de venta inválida.");
        } else if (unidades > stock) {
            System.out.println("Error: Sin stock suficiente. Disponible: " + stock);
        } else {
            stock -= unidades;
            System.out.println("Venta realizada: " + unidades + " unidad(es).");
        }
    }

    public void reabastecer(int unidades) {
        if (unidades > 0) {
            stock += unidades;
            System.out.println("Stock actualizado. Nuevo stock: " + stock);
        } else {
            System.out.println("Error: Cantidad a reabastecer debe ser mayor a 0.");
        }
    }

    /**
     * RETO DE ANDAMIAJE: Aplica un descuento porcentual al producto.
     */
    public void aplicarDescuento(double porcentaje) {
        if (porcentaje >= 0 && porcentaje <= 100) {
            double descuento = this.precio * (porcentaje / 100.0);
            this.precio -= descuento;
            System.out.println("Descuento del " + porcentaje + "% aplicado. Nuevo precio: $" + this.precio);
        } else {
            System.out.println("Error: Porcentaje de descuento inválido (debe estar entre 0 y 100).");
        }
    }

    /**
     * RETO DE ANDAMIAJE: Retorna verdadero si hay stock disponible.
     */
    public boolean hayStock() {
        return this.stock > 0;
    }
}