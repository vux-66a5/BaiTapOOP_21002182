package lab11.designpatterns.strategy;


public class MyBufferedReader {
    private static MyBufferedReader readerSingleton;
    public MyBufferedReader reader;

    private MyBufferedReader(MyBufferedReader reader) {
        this.reader = reader;
    }

    public static MyBufferedReader getReader(MyBufferedReader reader) {
        if (readerSingleton == null) {
            readerSingleton = new MyBufferedReader(reader);
        }
        return readerSingleton;
    }

}
