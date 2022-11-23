public class LibroMatematica extends Libro {


    public LibroMatematica(String nombre, int cantidadDeCapitulos) {
        super(nombre, cantidadDeCapitulos);
    }

    @Override
    public void fijarTiempoDePrestamoEnSemanas() {
      if (getCantidadDeCapitulos()==1){
          setTiempoDePrestamoEnSemanas(1);
      }else{
          setTiempoDePrestamoEnSemanas(3);
      }

    }

}
