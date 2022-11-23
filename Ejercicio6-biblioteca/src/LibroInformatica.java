public class LibroInformatica extends Libro{
    public LibroInformatica(String nombre, int cantidadDeCapitulos) {
        super(nombre, cantidadDeCapitulos);
    }

    @Override
    public void fijarTiempoDePrestamoEnSemanas() {
        setTiempoDePrestamoEnSemanas(2);
    }
}
