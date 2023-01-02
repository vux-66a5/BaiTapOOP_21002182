package lab05.customerandaccountclasses;

import java.text.DecimalFormat;

public class Account1 {
    private int id;
    private final Customer1 customer;
    private double balance;

    public Account1(int id, Customer1 customer, double balance) {
        this.balance = balance;
        this.customer = customer;
        this.balance = balance;
    }

    public Account1(int id, Customer1 customer) {
        this.balance = balance;
        this.customer = customer;
        this.balance = 0.0;
    }

    public int getId() {
        return id;
    }

    public Customer1 getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customer.getName();
    }

    public String toString() {
        DecimalFormat f = new DecimalFormat("###.00");
        String description = customer.toString() +
                ", balance = $" +
                f.format(this.balance);

        return description;
    }

    public Account1 deposit(double amount) {
        Account1 acc1 = new Account1(this.id, customer, balance);
        acc1.setBalance(acc1.getBalance() + amount);
        return acc1;
    }

    public Account1 withdraw(double amount) {
        Account1 acc1 = new Account1(this.id, customer, balance);
        if (acc1.balance >= amount) {
            acc1.balance = acc1.balance - amount;
        } else {
            System.out.println("amount withdraw exceeds the current balance!");
        }
        return acc1;
    }
}
