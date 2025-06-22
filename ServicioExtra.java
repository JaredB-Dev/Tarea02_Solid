public class ServicioExtra implements IPersonalizable {
    private String descripcion;
    private double costo;
    public boolean procesarPago(double monto, String datos) { return true; }
    public void personalizarServicio(ServicioExtra extra) {}
}
