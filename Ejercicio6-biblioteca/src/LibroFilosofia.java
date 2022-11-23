public class LibroFilosofia extends Libro{
    private String tipoDeLibro;
    public LibroFilosofia(String nombre, int tiempoDePrestamoEnSemanas, int cantidadDeCapitulos, String tipoDeLibro) {
        super(nombre, tiempoDePrestamoEnSemanas, cantidadDeCapitulos);
        this.tipoDeLibro = "filosofia";
    }

    public String getTipoDeLibro() {
        return tipoDeLibro;
    }

    public void setTipoDeLibro(String tipoDeLibro) {
        this.tipoDeLibro = tipoDeLibro;
    }

}
