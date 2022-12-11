package Factory;

public class CppDeveloperFactory implements DeveloperFactory {

    @Override
    public Developer creatDeveloper() {
        return new CppDeveloper();
    }
}
