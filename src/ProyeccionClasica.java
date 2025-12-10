public class ProyeccionClasica extends  Proyeccion {
    public ProyeccionClasica(String titulo, double precio, String tipo) {
        super(titulo, precio, tipo);
    }

    @Override
    public double calcularPrecio() {
        return precio;
    }
}
