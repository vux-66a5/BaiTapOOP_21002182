package lab04;

import java.util.Scanner;

public class FibonacciRecursive {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("num ? ");
        int n = scan.nextInt();
        System.out.println("F(" + n + ") = " + fibonacci(n));
    }

    public static int fibonacci(int n) {
        if (n == 0) {

            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
