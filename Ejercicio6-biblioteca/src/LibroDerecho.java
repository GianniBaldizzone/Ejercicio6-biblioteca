public class LibroDerecho extends Libro{
    public LibroDerecho(String nombre, int cantidadDeCapitulos) {
        super(nombre, cantidadDeCapitulos);
    }

    public void fijarTiempoDePrestamoEnSemanas() {
        setTiempoDePrestamoEnSemanas(5);
    }
}
