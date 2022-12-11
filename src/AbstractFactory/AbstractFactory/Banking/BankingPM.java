package AbstractFactory.Banking;

import AbstractFactory.ProjectManadger;

public class BankingPM  implements ProjectManadger {
    @Override
    public void manageProjet() {
        System.out.println("Banking PM manages banking project...");
    }
}
