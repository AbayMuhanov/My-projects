package Chain_v2;

public class Designer extends AbsWorker {
    @Override
    public String execute(String command) {
        if (command.equals("спроектировать дом")) {
            return "Проэктировщик выполнил команду: " + command;
        }
        return super.execute(command);
    }
}
