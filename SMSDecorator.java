public class SMSDecorator extends MensajeriaDecorator {
    public SMSDecorator(SistemaNotificaciones sn) {
        super(sn);
    }

    @Override
    public void enviar(String mensaje) {}
}