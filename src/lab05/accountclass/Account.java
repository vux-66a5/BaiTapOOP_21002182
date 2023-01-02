package lab05.accountclass;

public class Account {
    private final String id;
    private final String name;
    private int balance;

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
        this.balance = 0;
    }

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public int credit(int amount) {
        balance = balance + amount;
        return balance;
    }

    public int debit(int amount) {
        if (amount <= this.balance) {
            balance = balance - amount;
            return balance;
        } else {
            System.out.println("Amount exceeded balance");
            return this.balance;
        }
    }

    public int transferTo(Account another, int amount) {
        if (amount <= this.balance) {
            another.balance = amount;
            this.balance = this.balance - amount;
            return another.balance;
        } else {
            System.out.println("Amount exceeded balance");
            return balance;
        }
    }

    public String toString() {
        String description = "Account" +
                "[" +
                "id = " +
                getID() +
                ", name = " +
                getName() +
                ", balance = " +
                getBalance() +
                "]";

        return description;

    }
}
