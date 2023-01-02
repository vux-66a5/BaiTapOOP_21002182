package lab03;

import java.util.Scanner;

public class TrigonometricSeries {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        final double pi = Math.PI;
//
        // pi/6
        System.out.println("x = pi/6");
        System.out.println(sin(31, 500));
        System.out.println(Math.sin(31));
//        System.out.println(cos(pi / 6, 10));
//        System.out.println(Math.cos(pi / 6));
//        System.out.println();
//        //0
//        System.out.println("x = 0");
//        System.out.println(sin(0, 10));
//        System.out.println(Math.sin(0));
//        System.out.println(cos(0, 10));
//        System.out.println(Math.cos(0));
//        System.out.println();
//        // pi/4
//        System.out.println("x = pi/4");
//        System.out.println(sin(pi / 4, 7));
//        System.out.println(Math.sin(pi / 4));
//        System.out.println(cos(pi / 4, 7));
//        System.out.println(Math.cos(pi / 4));
//        System.out.println();
//        // pi/3
//        System.out.println("x = pi/3");
//        System.out.println(sin(pi / 3, 3));
//        System.out.println(Math.sin(pi / 3));
//        System.out.println(cos(pi / 3, 3));
//        System.out.println(Math.cos(pi / 3));
//        System.out.println();
//        int x = 30;
//        int numTerm = 1;
//        double sum = 0;
//        do {
//            sin(x,numTerm)
//        } while (Math.abs(sin(x,numTerm) - Math.sin(x))<=0.0001);
    }

    public static double calculateNextFraction(double numerator, int limitFactor) {
        double fracion = 1;
        for (int i = limitFactor; i > 0; i--) {
            fracion *= numerator / i;
        }
        return fracion;
    }

    public static double sin(double x, int numTerms) {
        double sinResult = 0;
        do {
            for (int i = 0; i < numTerms; i++) {
                if (i % 2 == 0) {
                    sinResult += 1 * calculateNextFraction(x, (2 * i + 1));
                } else {
                    sinResult += -1 * calculateNextFraction(x, (2 * i + 1));
                }
            }
        } while (sinResult - Math.sin(x) > 0.0001);
        return sinResult;
    }

    public static double cos(double x, int numTerms) {
        double cosResult = 0;
        for (int i = 0; i < numTerms; i++) {
            if (i % 2 == 0) {
                cosResult += 1 * calculateNextFraction(x, (2 * i));
            } else {
                cosResult += -1 * calculateNextFraction(x, (2 * i));
            }
        }
        return cosResult;
    }


}
