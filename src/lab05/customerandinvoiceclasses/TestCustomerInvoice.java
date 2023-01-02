package lab05.customerandinvoiceclasses;

public class TestCustomerInvoice {
    public static void main(String[] args) {
        // Test Customer class
        Customer customer = new Customer(88, "Tan Ah Teck", 10);
        System.out.println(customer);  // Customer's toString()

        customer.setDiscount(8);
        System.out.println(customer);
        System.out.println("id is: " + customer.getID());
        System.out.println("name is: " + customer.getName());
        System.out.println("discount is: " + customer.getDiscount());

        // Test Invoice class
        Invoice invoice1 = new Invoice(101, customer, 888.8);
        System.out.println(invoice1);

        invoice1.setAmount(999.9);
        System.out.println(invoice1);
        System.out.println("id is: " + invoice1.getID());
        System.out.println("customer is: " + invoice1.getCustomer());  // Customer's toString()
        System.out.println("amount is: " + invoice1.getAmount());
        System.out.println("customer's id is: " + invoice1.getCustomerID());
        System.out.println("customer's name is: " + invoice1.getCustomerName());
        System.out.println("customer's discount is: " + invoice1.getCustomerDiscount());
        System.out.printf("amount after discount is: %.2f%n", invoice1.getAmountAfterDiscount());
    }
}
