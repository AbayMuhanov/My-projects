package Bridge.v_2_0;

public class FileReader implements IDataReader {
    @Override
    public void read() {
        System.out.println("Данные из файла");
    }
}
