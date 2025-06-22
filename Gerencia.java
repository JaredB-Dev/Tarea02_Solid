public class Gerencia extends UsuarioBase {
    protected String idGerencia;
     public Gerencia(String nombre, String email, String idGerencia) {
        super(nombre, email);
        this.idGerencia = idGerencia;
    }
    public void recibirEscalamiento(Incidente i) {}
}
