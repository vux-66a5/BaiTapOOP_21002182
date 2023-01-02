package lab03;

public class FactorialInt {
    public static void main(String[] args) {
        printIntFactorial();
        printLongFactorial();

    }

    public static long factorial(int n) {
        return (n == 0 ? 1 : n * factorial(n - 1));
    }

    public static void printIntFactorial() {
        System.out.println("All int factorial");
        int i = 1;
        while (true) {
            long result = factorial(i);
            if (result < Integer.MAX_VALUE) {
                System.out.println("The factorial of " + i + " is " + result);
            } else {
                System.out.println("The factorial of " + i + " is out of range.");
                break;
            }
            i++;
        }
    }

    public static void printLongFactorial() {
        System.out.println("All long factorial");
        int idx = 1;
        while (true) {
            System.out.println("The factorial of " + idx + " is: " + factorial(idx));
            if (Long.MAX_VALUE / factorial(idx) < (idx + 1)) {
                System.out.println("The factorial of " + (idx + 1) + " is out of range.");
                break;
            }
            idx++;
        }
    }
}
