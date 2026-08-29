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
}        Producto prod1 = new Producto();
        Producto prod2 = new Producto("Teclado mecánico", 150000);
        prod1.mostrarDatos();
        prod2.mostrarDatos();
                Producto prod1 = new Producto();
        Producto prod2 = new Producto("Teclado mecánico", 150000);
        prod1.mostrarDatos();
        prod2.mostrarDatos();
    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }