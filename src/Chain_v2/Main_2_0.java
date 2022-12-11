package Chain_v2;

public class Main_2_0 {
    public static void main(String[] args) {

        Designer designer = new Designer();
        Carpenters carpenters = new Carpenters();
        FinishingWorker finishingWorker = new FinishingWorker();

        designer.setNextWorker(carpenters).setNextWorker(finishingWorker);

        GiveCommand(designer, "спроектировать дом");
        GiveCommand(designer, "класть кирпич");
        GiveCommand(designer, "клеить обои");

        GiveCommand(designer, "провести электропроводку");
    }

    private static void GiveCommand(IWorker worker, String command) {
        String srt = worker.execute(command);
        if (srt.equals("")) {
            System.out.println(command + "никто не умеет делать!!!");
        } else
            System.out.println(srt);

    }
}
