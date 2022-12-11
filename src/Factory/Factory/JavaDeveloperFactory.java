package Factory;

public class JavaDeveloperFactory implements DeveloperFactory {

    @Override
    public Developer creatDeveloper() {
        return new JavaDeveloper();
    }
}
