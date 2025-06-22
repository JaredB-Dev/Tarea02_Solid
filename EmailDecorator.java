public class EmailDecorator extends MensajeriaDecorator {
    public EmailDecorator(SistemaNotificaciones sn) {
        super(sn);
    }

    @Override
    public void enviar(String mensaje) {}
}
