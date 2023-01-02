package lab04;

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Array size: ");
        int size = scan.nextInt();

        int[] array = new int[size];
        System.out.println("Input array: ");
        input(array, scan);
        selectionSort(array);
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

    public static void selectionSort(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIdx]) {
                    minIdx = j;
                }
            }
            int swap = array[minIdx];
            array[minIdx] = array[i];
            array[i] = swap;
            count++;
        }
        System.out.println(count);
    }
}
