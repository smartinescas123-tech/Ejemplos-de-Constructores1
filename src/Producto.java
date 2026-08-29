package constructores;

public class Producto {
    private String nombre;
    private double precio;

    public Producto() {
        this("Producto genérico", 0.0);
    }

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public void mostrarDatos() {
        System.out.println("Producto: " + nombre + " | Precio: $" + precio);
    }
}