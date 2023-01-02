package lab01;

import java.util.Scanner;

public class AverageWithInputValidation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int numStudents = 3;

        int inputMark;
        boolean isValid;
        int sumMark = 0;
        double average;

        for(int studentNo = 1; studentNo <= numStudents; studentNo++) {
            System.out.println("Enter the mark (0-100) for student " + studentNo + ": ");
            isValid = false;
            do {
                inputMark = scan.nextInt();
                if(inputMark >= 0 && inputMark <= 100) {
                    isValid = true;
                    sumMark += inputMark;
                } else {
                    System.out.println("Invalid input, try again...");
                    System.out.println("Enter the mark (0-100) for student " + studentNo + ": ");
                }
            } while(!isValid);
        }
        System.out.printf("The average mark is: %.2f%n" , (double)sumMark/3);
    }
}
