package AbstractFactory.Website;

import AbstractFactory.Developer;
import AbstractFactory.ProjectManadger;
import AbstractFactory.ProjectTeamFactory;
import AbstractFactory.Tester;

public class WebsiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManadger getProjectManager() {
        return new WebsitePM();
    }
}
