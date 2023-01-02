package lab02;

import java.util.Scanner;

public class Exponent {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the base: ");
        int base = scan.nextInt();
        System.out.print("Enter the exponent: ");
        int exp = scan.nextInt();
        System.out.println(base + " raises to the power of " + exp + " is: " + exponent(base, exp));

    }

    public static int exponent(int base, int exp) {
        int product = 1;
        for (int i = 1; i <= exp; i++) {
            product *= base;
        }
        return product;
    }
}
