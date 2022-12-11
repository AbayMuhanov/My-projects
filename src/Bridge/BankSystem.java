package Bridge;

import Bridge.Developer;

public class BankSystem  extends Program {
    protected BankSystem(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("Bank system developer in prodress...");
        developer.writeCode();
    }
}
