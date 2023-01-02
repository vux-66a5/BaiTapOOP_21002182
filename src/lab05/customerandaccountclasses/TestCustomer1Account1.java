package lab05.customerandaccountclasses;

public class TestCustomer1Account1 {
    public static void main(String[] args) {
        // Test Customer class
        Customer1 customer = new Customer1(88, "Tan Ah Teck", 'm');
        System.out.println(customer);  // Customer's toString()


        // Test Account1 class
        Account1 acc1 = new Account1(101, customer, 888.8);
        System.out.println("Basic info: " + acc1);

        System.out.println("customer is: " + acc1.getCustomer());  // Customer's toString()
        System.out.println("customer's id is: " + acc1.getCustomer().getID());
        System.out.println("customer's name is: " + acc1.getCustomerName());
        System.out.println("customer's gender is: " + acc1.getCustomer().getGender());
        System.out.println("Info if withdraw 20$: " + acc1.withdraw(20));
        System.out.println("Info if deposit 1000$: " + acc1.deposit(1000));
    }
}
