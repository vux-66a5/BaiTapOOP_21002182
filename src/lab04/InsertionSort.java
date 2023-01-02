package lab04;

import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Array size: ");
        int size = scan.nextInt();

        int[] array = new int[size];
        System.out.println("Input array: ");
        input(array, scan);
        insertionSort(array);
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

    public static void insertionSort(int[] array) {
        int count = 0;
        for (int i = 1; i < array.length; i++) {
            int firstUnsorted = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > firstUnsorted) {
                array[j + 1] = array[j];
                j -= 1;
                count++;
            }
            array[j + 1] = firstUnsorted;
        }
        System.out.println(count);
    }
}
