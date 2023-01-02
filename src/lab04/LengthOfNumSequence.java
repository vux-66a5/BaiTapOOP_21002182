package lab04;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LengthOfNumSequence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        do {
            try {
                System.out.print("Input number: ");
                int inNum = scan.nextInt();
                System.out.println(sequenceLength(inNum));
                break;
            } catch (InputMismatchException e) {
                System.out.println("Number only ! ");
                scan.next();
            }
        } while (true);

    }

    public static int numOfDigits(int number) {
        String numInStr = Integer.toString(number);
        return numInStr.length();
    }

    public static int sequenceLength(int num) {
        if (num == 1) {
            return 1;
        }
        if (num == 0) {
            return 1;
        }
        return sequenceLength(num - 1) + numOfDigits(num);
    }
}
