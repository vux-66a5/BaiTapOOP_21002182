package lab13.designpatterns.decorator.pseudocode;

public interface DataSource {
    void writeData(String data);

    String readData();
}