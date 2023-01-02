package lab01;

import java.util.Scanner;

public class ReverseInt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input number: ");

        int inputNumber = scan.nextInt();
        int digit;
        System.out.println("Reversed number is: ");
        while(inputNumber > 0) {
            digit = inputNumber % 10;
            System.out.print(digit);
            inputNumber /= 10;
        }
    }
}
