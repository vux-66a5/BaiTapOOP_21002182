package homework01;

import java.util.Scanner;

public class SquarePattern {
    static void printPatternByForLoop(int size) {
        System.out.println("for loop:");
        for(int row = 0; row < size; row++){
            for(int col = 0; col < size; col++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
    static void printPatternByWhileDoLoop(int size) {
        System.out.println("while-do loop:");
        int row = 0;
        while (row < size) {
            int col = 0;
            while ( col < size) {
                System.out.print("#");
                col++;
            }
            System.out.println();
            row++;
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size : ");
        int size = scan.nextInt();
        printPatternByForLoop(size);
        printPatternByWhileDoLoop(size);
    }
}
