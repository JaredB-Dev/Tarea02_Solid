public class Incidente {
    protected int idIncidente;
    protected String descripcion;
    protected String estado;
    protected UsuarioBase responsable;
    public static Incidente reportar(Usuario usuario, String descripcion) { return new Incidente(); }
    public void resolver() {}
    public void escalar() {}
}
