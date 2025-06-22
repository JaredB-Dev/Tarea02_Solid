public class Pago implements IPersonalizable, ISistemaPagos {
    protected double monto;
    protected String estado;
    public boolean realizarPago(String datos, ISistemaPagos metodo) { return metodo.procesarPago(monto, datos); }
    public void personalizarServicio(ServicioExtra extra) {}
    @Override
    public boolean procesarPago(double monto, String datos) {
        // Implementación por la clase pago
        return true;
    }
}
