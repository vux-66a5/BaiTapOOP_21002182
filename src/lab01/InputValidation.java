package lab01;

import java.util.Scanner;

public class InputValidation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inputNum;
        boolean isValid = false;

        do {
            System.out.print("Enter number: ");
            inputNum = scan.nextInt();

            if (((inputNum > 0) && (inputNum < 10)) || ((inputNum > 90) && (inputNum < 100))) {
                isValid = true;
            } else {
                System.out.println("Invalid input, try again...");
            }
        } while (!isValid);
        System.out.println("You have entered: " + inputNum);

    }
}
