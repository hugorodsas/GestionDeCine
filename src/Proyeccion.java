public abstract class Proyeccion {
    protected String titulo;
    protected double precio;
    protected String tipo;

    public Proyeccion(String titulo, double precio, String tipo) {
        this.titulo = titulo;
        this.precio = precio;
        this.tipo = tipo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public abstract double calcularPrecio();
}
