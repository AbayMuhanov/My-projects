package Bridge.v_2_0;

public class EmailSend extends Sender {
    public EmailSend(IDataReader reader) {
        super(reader);
    }

    @Override
    public void send() {
        reader.read();
        System.out.println("Отправлины при помощи Email");
    }
}
