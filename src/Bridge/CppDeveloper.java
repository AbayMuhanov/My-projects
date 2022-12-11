package Bridge;

public class CppDeveloper  implements Bridge.Developer {
    @Override
    public void writeCode() {
        System.out.println("C++ Developer writes C++ Code...");
    }
}
