package lab04;

import java.util.Scanner;

public class GCDRecursion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("First number: ");
        int a = scan.nextInt();
        System.out.print("Second number: ");
        int b = scan.nextInt();
        System.out.println("GCD is " + gcd(a, b));
    }

    public static int gcd(int a, int b) {
        if (b != 0) {
            return gcd(b, a % b);
        } else {
            return a;
        }
    }
}
