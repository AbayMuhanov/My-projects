package Bridge.v_2_0;

public class TelegramBotSender extends Sender {
    public TelegramBotSender(IDataReader reader) {
        super(reader);
    }

    @Override
    public void send() {
        reader.read();
        System.out.println("Отправлино при помощи Telegram бота");
    }
}
