package lab05.customerandaccountclasses;

public class Customer1 {
    private final int ID;
    private final String name;
    private final char gender;

    public Customer1(int ID, String name, char gender) {
        this.ID = ID;
        this.name = name;
        this.gender = gender;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public String toString() {
        String description = this.name +
                "(" +
                this.ID +
                ")";


        return description;
    }
}
