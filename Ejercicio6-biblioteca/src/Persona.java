import java.util.ArrayList;

public class Persona {
    private String nombre;
    private String apelllido;
    private String dni;
    private int edad;
    private Libro libro;

    public Persona(String nombre, String apelllido, String dni, int edad) {
        this.nombre = nombre;
        this.apelllido = apelllido;
        this.dni = dni;
        this.edad = edad;
        this.libro = libro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApelllido() {
        return apelllido;
    }

    public void setApelllido(String apelllido) {
        this.apelllido = apelllido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public void preguntarTiempoDeAlquilerDelLibro(libro){
        System.out.println(libro.getTiempoDePrestamoEnSemanas());
    }
}
