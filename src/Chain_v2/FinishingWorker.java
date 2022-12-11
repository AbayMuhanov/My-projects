package Chain_v2;

public class FinishingWorker extends AbsWorker {
    @Override
    public String execute(String command) {
        if (command.equals("клеить обои")) {
            return "Рабочий внутрейнней отделки выполни Команду: " + command;
        }
        return super.execute(command);
    }
}
