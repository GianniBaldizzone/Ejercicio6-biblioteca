public class Libro {
    private String nombre;
    private int tiempoDePrestamoEnSemanas;
    private int cantidadDeCapitulos;



    public Libro(String nombre, int cantidadDeCapitulos) {
        this.nombre = nombre;
        this.tiempoDePrestamoEnSemanas = tiempoDePrestamoEnSemanas;
        this.cantidadDeCapitulos = cantidadDeCapitulos;

    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTiempoDePrestamoEnSemanas() {
        return tiempoDePrestamoEnSemanas;
    }

    public void setTiempoDePrestamoEnSemanas(int tiempoDePrestamoEnSemanas) {
        this.tiempoDePrestamoEnSemanas = tiempoDePrestamoEnSemanas;
    }

    public int getCantidadDeCapitulos() {
        return cantidadDeCapitulos;
    }

    public void setCantidadDeCapitulos(int cantidadDeCapitulos) {
        this.cantidadDeCapitulos = cantidadDeCapitulos;
    }
    public void fijarTiempoDePrestamoEnSemanas(){
    }
    public void mostrarTiempoDePrestamoEnSemanas(){
        System.out.println(this.getTiempoDePrestamoEnSemanas());
    }

}
