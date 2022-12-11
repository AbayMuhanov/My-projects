package Bridge.v_2_0;

public class Main_2_0 {
    public static void main(String[] args) {
        Sender sender = new TelegramBotSender(new DataReader());
        sender.send();//Данные из базы данных
        //Отправлины при помощи Email

        System.out.println();
        sender.setDataReader(new FileReader());
        sender.send();//Данные из файла
        //Отправлины при помощи Email

        System.out.println();
        sender = new EmailSend(new DataReader());
        sender.send();//Данные из базы данных
        //Отправлино при помощи Telegram бота


        // Данные отправляются из последнего способа
        System.out.println();
        sender.setDataReader(new DataReader());
        sender.send();
    }
}
