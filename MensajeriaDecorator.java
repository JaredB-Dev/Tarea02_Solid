public abstract class MensajeriaDecorator extends SistemaNotificaciones {
    private SistemaNotificaciones wrappee;
public MensajeriaDecorator(SistemaNotificaciones sn) {
        this.wrappee = sn;
    }

public abstract void enviar(String mensaje);
}