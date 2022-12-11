package Chain_v2;

public class AbsWorker implements IWorker {
    private IWorker nextWorker;

    public AbsWorker() {
        nextWorker = null;
    }

    @Override
    public IWorker setNextWorker(IWorker worker) {
        nextWorker = worker;
        return worker;
    }

    @Override
    public String execute(String command) {
        if (nextWorker != null)
            return nextWorker.execute(command);
        return "";
    }
}
