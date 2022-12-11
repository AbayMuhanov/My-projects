package Bridge;

public class ProgramCreator {
    public static void main(String[] args) {
        Bridge.Program[] programs = {
                new BankSystem(new CppDeveloper()),
                new StockExchange(new JavaDeveloper())};

        for (Program program : programs) {
            program.developProgram();
        }
    }
}