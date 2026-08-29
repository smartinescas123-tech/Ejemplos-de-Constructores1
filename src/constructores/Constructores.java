package constructores;

public class Persona {
    private String nombre;
    private int edad;
    private String documento;
}    public Persona() {
        this.nombre = "Sin nombre";
        this.edad = 0;
        this.documento = "Sin documento";
    }    public Persona(String nombre) {
        this();
        this.nombre = nombre;
    }    public Persona(String nombre, int edad) {
        this(nombre);
        this.edad = edad;
    }    public Persona(String nombre, int edad, String documento) {
        this(nombre, edad);
        this.documento = documento;
    }