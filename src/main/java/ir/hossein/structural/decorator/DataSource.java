package ir.hossein.structural.decorator;

public interface DataSource {
    void writeData(String data);

    String readData();
}