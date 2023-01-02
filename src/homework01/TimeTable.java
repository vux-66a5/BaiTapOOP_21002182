package homework01;

import java.util.Scanner;

public class TimeTable {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = input.nextInt();

        System.out.printf("%4s |", "*");
        for(int i = 1; i <= size; i++ ) {
            System.out.printf("%4d", i);
        }
        System.out.println();
        System.out.println("-".repeat(6+3*size+size));
        for(int row = 1; row <= size; row++) {
            System.out.printf("%4d |", row);
            for(int col = 1; col <= size; col++) {
                System.out.printf("%4d", row*col);
            }
            System.out.println();
        }
    }
}
