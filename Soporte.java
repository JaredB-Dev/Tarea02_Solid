public class Soporte extends UsuarioBase {
    public Soporte(String nombre, String email) {
        super(nombre, email);
    }
    public void revisarIncidente(Incidente i) {}
    public void resolverIncidente(Incidente i) {}
    public void escalarIncidente(Incidente i, Gerencia g) {}
}
