public class LibroMatematica extends Libro {
    private String tipoDeLibro;

    public String getTipoDeLibro() {
        return tipoDeLibro;
    }

    public LibroMatematica(String nombre, int tiempoDePrestamoEnSemanas, int cantidadDeCapitulos, String tipoDeLibro) {
        super(nombre, tiempoDePrestamoEnSemanas=0, cantidadDeCapitulos);
        this.tipoDeLibro = "matematica";
    }

    public void setTipoDeLibro(String tipoDeLibro) {
        this.tipoDeLibro = tipoDeLibro;
    }

    @Override
    public void fijarTiempoDePrestamoEnSemanas(Libro libro) {
      if (getCantidadDeCapitulos()==1){
          setTiempoDePrestamoEnSemanas(1);
      }else{
          setTiempoDePrestamoEnSemanas(2);
      }

    }
}
