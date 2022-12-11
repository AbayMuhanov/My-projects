package Bridge;

public class StockExchange extends Bridge.Program {
    protected StockExchange(Bridge.Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram(){
        System.out.println("StockExchange development in progress...");
    developer.writeCode();
    }
}
