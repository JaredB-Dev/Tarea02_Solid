public class AplicacionExtraDecorator extends MensajeriaDecorator {
    public AplicacionExtraDecorator(SistemaNotificaciones sn) {
        super(sn);
    }

    @Override
    public void enviar(String mensaje) {}
}
