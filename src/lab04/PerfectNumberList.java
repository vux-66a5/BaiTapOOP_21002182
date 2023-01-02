package lab04;

import java.util.Scanner;

public class PerfectNumberList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the upperbound: ");
        int upBound = scan.nextInt();
        if (upBound > 0) {
            perfectStatistic(upBound);
            otherNumStatistic(upBound);
        } else {
            System.out.println("Positive integer only !");
        }
    }

    public static boolean isPerfect(int aPosInt) {
        int sumDivisors = 0;
        for (int i = 1; i <= aPosInt / 2; i++) {
            sumDivisors += (aPosInt % i == 0) ? i : 0;
        }
        return (sumDivisors == aPosInt);
    }

    public static boolean isDeficient(int aPosInt) {
        int sumDivisors = 0;
        for (int i = 1; i <= aPosInt / 2; i++) {
            sumDivisors += (aPosInt % i == 0) ? i : 0;
        }
        return (sumDivisors < aPosInt);
    }

    public static void perfectStatistic(int upperBound) {
        double count = 0;
        for (int i = 1; i <= upperBound; i++) {
            if (isPerfect(i)) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println();
        System.out.printf("[%d %s (%.2f%%)]", (int) count, "perfect numbers found", (count / upperBound) * 100);
        System.out.println();
    }

    public static void otherNumStatistic(int upperBound) {
        System.out.println();
        System.out.println("These numbers are neither deficient nor perfect: ");
        double count = 0;
        for (int i = 1; i <= upperBound; i++) {
            if (!isPerfect(i) && !isDeficient(i)) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println();
        System.out.printf("[%d %s (%.2f%%)]", (int) count, "numbers found", (count / upperBound) * 100);
        System.out.println();
    }
}
