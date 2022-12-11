package Chain_v2;

public class Carpenters extends AbsWorker {
    @Override
    public String execute(String command) {
        if (command.equals("класть кирпич")) {
            return "Плотник выполнил команду: " + command;
        }
        return super.execute(command);
    }
}
