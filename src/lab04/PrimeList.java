package lab04;

import java.util.Scanner;

public class PrimeList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the upper bound: ");
        int upperBound = scan.nextInt();
        primeStatistic(upperBound);
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

    public static void primeStatistic(int upperBound) {
        double count = 0;
        for (int i = 1; i <= upperBound; i++) {
            if (isPrime(i)) {
                System.out.println(i);
                count++;
            }
        }
        System.out.printf("[%d %s (%.2f%%)]", (int) count, "primes found", (count / upperBound) * 100);
    }
}
