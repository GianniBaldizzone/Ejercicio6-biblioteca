public class LibroInformatica extends Libro{
    private String tipoDeLibro;

    public String getTipoDeLibro() {
        return tipoDeLibro;
    }

    public void setTipoDeLibro(String tipoDeLibro) {
        this.tipoDeLibro = tipoDeLibro;
    }

    public LibroInformatica(String nombre, int tiempoDePrestamoEnSemanas, int cantidadDeCapitulos, String tipoDeLibro) {
        super(nombre, tiempoDePrestamoEnSemanas, cantidadDeCapitulos);
        this.tipoDeLibro = "informatica";
    }
    @Override
    public void fijarTiempoDePrestamoEnSemanas(Libro libro) {
        setTiempoDePrestamoEnSemanas(2);
    }
}
