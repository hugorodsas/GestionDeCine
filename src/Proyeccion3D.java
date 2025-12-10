public class Proyeccion3D extends Proyeccion {
    private double recargo;

    public Proyeccion3D(String titulo, double precio, String tipo, double recargo) {
        super(titulo, precio, tipo);
        this.recargo = recargo;
    }

    @Override
    public double calcularPrecio() {
        return precio;
    }
}
