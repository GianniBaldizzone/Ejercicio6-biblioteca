public class LibroEconomia extends Libro{
    public LibroEconomia(String nombre, int cantidadDeCapitulos) {
        super(nombre, cantidadDeCapitulos);
    }

    public void fijarTiempoDePrestamoEnSemanas() {
        setTiempoDePrestamoEnSemanas(5);
    }
}
