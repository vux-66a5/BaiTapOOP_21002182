package lab04;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Array size: ");
        int size = scan.nextInt();

        int[] array = new int[size];
        System.out.println("Input array: ");
        input(array, scan);
        bubbleSort(array);
        output(array);

    }

    public static void input(int[] array, Scanner scan) {
        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }
    }

    public static void output(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void bubbleSort(int[] array) {
        int n = array.length;
        int count = 0;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < n; ++i) {
                if (array[i] < array[i - 1]) {
                    int tempSwap = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = tempSwap;
                    swapped = true;
                    count++;

                }

            }
            n = n - 1;
        } while (swapped);
        System.out.println(count);
    }
}
