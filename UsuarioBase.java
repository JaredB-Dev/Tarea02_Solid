abstract class UsuarioBase {
    protected String nombre;
    protected String email;
    public UsuarioBase(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }
}