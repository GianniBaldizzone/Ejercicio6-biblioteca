public class LibroFilosofia extends Libro{
    public LibroFilosofia(String nombre, int cantidadDeCapitulos) {
        super(nombre, cantidadDeCapitulos);
    }

    @Override
    public void fijarTiempoDePrestamoEnSemanas() {
        setTiempoDePrestamoEnSemanas(2);
    }
}
