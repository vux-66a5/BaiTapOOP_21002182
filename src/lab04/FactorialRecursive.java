package lab04;

import java.util.Scanner;

public class FactorialRecursive {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input number: ");
        int n = scan.nextInt();

        if (factorialIterative(n) == -1) {
            System.out.println("Factorial is out of Integer's range !");
        } else {
            System.out.println("Factorial of " + n + " is: " + factorialRecursive(n));
            System.out.println("Is recursive version equal iterative version? " + (factorialRecursive(n) == factorialIterative(n)));
        }

    }

    public static int factorialRecursive(int n) {

        return (n == 0) ? 1 : n * factorialRecursive(n - 1);
    }

    public static int factorialIterative(int n) {
        int factor = 1;
        int idx = 1;
        while (idx <= n) {
            if ((Integer.MAX_VALUE / factor) < (idx + 1)) {
                return -1;
            }
            factor *= idx;
            idx++;
        }
        return factor;

    }
}
