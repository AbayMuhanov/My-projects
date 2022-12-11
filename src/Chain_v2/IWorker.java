package Chain_v2;

public interface IWorker {
    IWorker setNextWorker(IWorker worker);
String execute(String command);
}
