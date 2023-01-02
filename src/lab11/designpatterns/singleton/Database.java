package lab11.designpatterns.singleton;

public class Database {
    private static Database instance;

    private Database() {

    }
    public static Database getInstance() {
        if(instance == null) {
            instance = new Database();
        }
        return instance;
    }
}
