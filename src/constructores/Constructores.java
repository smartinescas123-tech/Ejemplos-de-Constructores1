package constructores;

public class Main {
    public static void main(String[] args) {
        Persona p1 = new Persona();
        Persona p2 = new Persona("Camila");
        Persona p3 = new Persona("Andrés", 21);
        Persona p4 = new Persona("Laura", 23, "1020304050");

        p1.mostrarDatos();
        p2.mostrarDatos();
        p3.mostrarDatos();
        p4.mostrarDatos();
    }
}