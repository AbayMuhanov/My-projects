package Bridge.v_2_0;

public abstract class Sender {
    protected IDataReader reader;

    public Sender(IDataReader reader) {
        this.reader = reader;
    }

    public void setDataReader(IDataReader iDataReader) {
        reader = iDataReader;
    }

    public abstract void send();
}
