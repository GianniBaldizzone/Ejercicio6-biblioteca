public class Main {
    public static void main(String[] args) {

        LibroMatematica libroMatematica = new LibroMatematica("Analisis matematico",
                2);
        LibroFilosofia libroFilosofia = new LibroFilosofia("LibroFilosofia",
                1);
        LibroInformatica libroInformatica = new LibroInformatica("LibroInformatica",
                1);
        LibroDerecho libroDerecho = new LibroDerecho("LibroDerecho",
                1);
        LibroEconomia libroEconomia = new LibroEconomia("LibroEconomia",
                1);

        libroMatematica.fijarTiempoDePrestamoEnSemanas();
        libroMatematica.mostrarTiempoDePrestamoEnSemanas();
        libroInformatica.fijarTiempoDePrestamoEnSemanas();
        libroInformatica.mostrarTiempoDePrestamoEnSemanas();
        libroFilosofia.fijarTiempoDePrestamoEnSemanas();
        libroFilosofia.mostrarTiempoDePrestamoEnSemanas();
        libroDerecho.fijarTiempoDePrestamoEnSemanas();
        libroDerecho.mostrarTiempoDePrestamoEnSemanas();
        libroEconomia.fijarTiempoDePrestamoEnSemanas();
        libroEconomia.mostrarTiempoDePrestamoEnSemanas();

    }
}