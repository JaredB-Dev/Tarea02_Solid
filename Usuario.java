public class Usuario extends UsuarioBase {
    public Usuario(String nombre, String email) {
        super(nombre, email);
    }
    public void buscarCruceros(String destino, java.util.Date fecha, String tipoCabina) {}
    public void seleccionarCabina(Crucero crucero, String tipo, String criterio) {}
    public void realizarPago(Reserva reserva, String datos, ISistemaPagos metodo) {}
    public void reportarIncidente(String descripcion) {}
}
