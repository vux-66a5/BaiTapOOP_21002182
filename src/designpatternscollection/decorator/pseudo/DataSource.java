package designpatternscollection.decorator.pseudo;

public interface DataSource {
    void writeData(String data);

    String readData();
}