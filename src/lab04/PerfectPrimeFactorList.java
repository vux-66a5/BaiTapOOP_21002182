package lab04;

import java.util.Scanner;

public class PerfectPrimeFactorList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the upper bound: ");
        int upperBound = scan.nextInt();
        perfectPrimeFactorStatistic(upperBound);

    }

    public static boolean isPrime(int aPosInt) {
        if (aPosInt == 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(aPosInt); i++) {
            if (aPosInt % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isProductOfPrimeFactor(int aPosInt) {
        if (aPosInt == 1) {
            return false;
        }
        int product = 1;
        for (int i = 2; i < aPosInt; i++) {
            if (isPrime(i) && (aPosInt % i == 0)) {
                product *= i;
            }
        }
        return (product == aPosInt);
    }

    public static void perfectPrimeFactorStatistic(int upperBound) {
        System.out.println("These numbers are equal to the product of prime factors: ");
        double count = 0;
        for (int i = 1; i <= upperBound; i++) {
            if (isProductOfPrimeFactor(i)) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println();
        System.out.printf("[%d %s (%.2f%%)]", (int) count, "numbers found", (count / upperBound) * 100);
        System.out.println();
    }
}
