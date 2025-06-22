public class Cabina {
    protected int numero;
    protected String tipo;
    protected String estado;
    protected double precio;

    public boolean validarDisponibilidad() { return true; }
    public void reservarTemporalmente() {}
    public void confirmarReserva() {}
    public void liberar() {}
}
