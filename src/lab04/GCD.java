package lab04;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("a = ");
        int a = scan.nextInt();
        System.out.print("b = ");
        int b = scan.nextInt();
        System.out.println("GCD is " + gcd(a, b));
    }

    public static int gcd(int a, int b) {
        if ((a < 0 || b < 0) || (a == 0 && b == 0)) {
            return -1;
        }
        if (a == 0 && b != 0) {
            return b;
        }
        if (a != 0 && b == 0) {
            return a;
        }
        while (b != 0) {
            //GCD(a,b) = GCD(b, a mod b)
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
