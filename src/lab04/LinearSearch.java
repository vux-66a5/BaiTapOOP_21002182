package lab04;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Array size: ");
        int size = scan.nextInt();
        int[] array = new int[size];
        input(array, scan);
        System.out.print("Key: ");
        int key = scan.nextInt();
        System.out.print("Index: " + linearSearchIndex(array, key));
    }

    public static void input(int[] array, Scanner scan) {
        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }
    }

    public static boolean linearSearch(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return true;
            }
        }
        return false;
    }

    public static int linearSearchIndex(int[] array, int key) {
        if (!linearSearch(array, key)) {
            return -1;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1;
    }
}
