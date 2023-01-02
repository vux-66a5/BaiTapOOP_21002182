package homework01;

import java.util.Scanner;

public class CheckerPattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = scan.nextInt();
        for(int row = 1; row <= size; row++){
            //Start with space in every even-rows
            if( row % 2 == 0 ) {
                System.out.print(" "); //Start with space in even-rows
            }
            for(int col = 1; col <= size; col ++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
