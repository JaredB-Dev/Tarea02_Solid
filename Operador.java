public class Operador extends UsuarioBase {
    protected int idOperador;
    public Operador(String nombre, String email, int idOperador) {
        super(nombre, email);
        this.idOperador = idOperador;
    }
    public void gestionarCambio(Reserva reserva, Cabina nuevaCabina) {}
    public void actualizarEstadoCabina(Cabina cabina, String nuevoEstado) {}
    public void enviarNotificacion(String mensaje, Usuario usuario) {}
    public void gestionarReembolsos(Reserva reserva) {}
}
