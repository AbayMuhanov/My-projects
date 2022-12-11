package AbstractFactory.Website;

import AbstractFactory.ProjectManadger;

public class WebsitePM  implements ProjectManadger {
    @Override
    public void manageProjet() {
        System.out.println("Website PM  manages website project...");
    }
}
