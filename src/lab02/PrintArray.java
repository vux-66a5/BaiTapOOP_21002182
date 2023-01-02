package lab02;

import java.util.Scanner;

public class PrintArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of items: ");
        int arrSize = scan.nextInt();
        int[] arr = new int[arrSize];
        System.out.print("Enter the value of all items (separated by space): ");
        for (int i = 0; i < arrSize; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.print("The values are: ");
        System.out.print("[");
        for (int i = 0; i < arrSize; i++) {
            System.out.print((i == 0) ? arr[i] : ", " + arr[i]);
        }
        System.out.print("]");
    }
}
