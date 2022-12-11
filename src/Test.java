import java.util.*;

public class Test {
  public static void main(String[] args) {
    IDeveloper dev1 = new JavaDeveloper();
    IDeveloper dev2 = new KotlinDeveloper();
    IDeveloper dev3 = new JSDeveloper();

    IManager manager = new BestManager();

    manager.speak(dev1);
    System.out.println();

    manager.speak(dev2);
    System.out.println();

    manager.speak(dev3);
  }
}











