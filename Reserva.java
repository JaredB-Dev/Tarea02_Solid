public class Reserva {
    protected int idReserva;
    protected Usuario usuario;
    protected Cabina cabina;
    protected String estado;
    public Reserva crearReserva(Cabina cabina, Usuario usuario) { return new Reserva(); }
    public Reserva accederReserva(int id) { return new Reserva(); }
    public void cancelar() {}
}
