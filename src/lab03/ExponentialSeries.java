package lab03;

import java.util.Scanner;

public class ExponentialSeries {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("x = ");
        double x = scan.nextDouble();
        System.out.print("numTerm = ");
        int numTerms = scan.nextInt();
        System.out.println(specialSeries(x,numTerms));
    }

    public static double specialSeries(double x, int numTerms) {
        double res = 0;
        for(int i = 1; i <= numTerms; i+=2) {
            res += calPair(x,i);
        }
        return res;
    }
    public static double calPair(double x, int numTerms) {
        double product = 1;
            for(int i = 1 ; i <= numTerms; i++) {
                if(i < numTerms && 2*i < numTerms) {
                    product *= (double) (2 * i - 1) / (2 * i);
                } else {
                    product *= Math.pow(x,numTerms)/numTerms;
                    break;
                }
            }
            return product;
        }
}

