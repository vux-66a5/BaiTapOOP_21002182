package lab02;

import java.util.Scanner;

public class PrintArrayInStars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of items: ");
        int itemsSize = scan.nextInt();

        int[] items = new int[itemsSize];
        System.out.print("Enter the value of all items (separated by space): ");

        //input
        for (int idx = 0; idx < items.length; idx++) {
            int item = scan.nextInt();
            if (item > 0) {
                items[idx] = item;
            } else {
                System.out.println("Chi nhan so duong: ");
            }
        }
        //output
        for (int idx = 0; idx < items.length; idx++) {
            System.out.print(idx + ": ");
            for (int row = 0; row <= items[idx]; row++) {
                if (row < items[idx]) {
                    System.out.print("*");
                } else {
                    System.out.print("(" + row + ")");
                }
            }
            System.out.println();
        }

    }
}
