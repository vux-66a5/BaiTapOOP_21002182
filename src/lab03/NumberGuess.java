package lab03;

import java.util.Scanner;

public class NumberGuess {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //int SECRET_NUMBER = scan.nextInt();
        final int SECRET_NUMBER = (int) (Math.random() * 100);
        System.out.println("Key in your guess:");
        int trials = 1;
        while (true) {
            int inNum = scan.nextInt();
            if (inNum < SECRET_NUMBER) {
                System.out.println("Try higher");
            } else if (inNum > SECRET_NUMBER) {
                System.out.println("Try lower");
            } else {
                System.out.println("You got it in " + trials + " trials!");
            }
            trials++;
        }
    }

}
