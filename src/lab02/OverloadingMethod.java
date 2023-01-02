package lab02;

import java.util.Scanner;

public class OverloadingMethod {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of items: ");
        int arrSize = scan.nextInt();
        int[] arr = new int[arrSize];
        System.out.print("Enter the value of all items (separated by space): ");
        for (int i = 0; i < arrSize; i++) {
            arr[i] = scan.nextInt();
        }
        print(arr);
    }

    public static void print(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print((i == 0) ? array[i] : ", " + array[i]);
        }
        System.out.print("]");
    }

    public static void print(double[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print((i == 0) ? array[i] : ", " + array[i]);
        }
        System.out.print("]");
    }

    public static void print(float[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print((i == 0) ? array[i] : ", " + array[i]);
        }
        System.out.print("]");
    }
}
