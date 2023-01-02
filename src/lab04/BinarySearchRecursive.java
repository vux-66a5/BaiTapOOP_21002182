package lab04;

import java.util.Scanner;

public class BinarySearchRecursive {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Array size: ");
        int size = scan.nextInt();

        int[] array = new int[size];
        System.out.println("Input array: ");
        input(array, scan);

        System.out.print("Key: ");
        int key = scan.nextInt();

        System.out.print("fromIdx = ");
        int fromIdx = scan.nextInt();
        System.out.print("toIdx = ");
        int toIdx = scan.nextInt();
        System.out.println(binarySearch(array, key, fromIdx, toIdx));

        System.out.println(binarySearch(array, key));
    }

    public static void input(int[] array, Scanner scan) {
        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }
    }

    public static boolean binarySearch(int[] array, int key, int fromIdx, int toIdx) {
        if (fromIdx == toIdx - 1) {
            if (key == array[fromIdx]) {
                return true;
            } else {
                return false;
            }
        } else {
            int middleIdx = (fromIdx + toIdx) / 2;
            if (key == array[middleIdx]) {
                return true;
            } else if (key < array[middleIdx]) {
                toIdx = middleIdx;
            } else {
                fromIdx = middleIdx + 1;
            }

        }
        return binarySearch(array, key, fromIdx, toIdx);
    }

    public static boolean binarySearch(int[] array, int key) {
        int leftIdx = 0;
        int rightIdx = array.length - 1;
        while (leftIdx <= rightIdx) {
            int middleIdx = (leftIdx + rightIdx) / 2;
            if (key == array[middleIdx]) {
                return true;
            } else if (key < array[middleIdx]) {
                rightIdx = middleIdx - 1;
            } else {
                leftIdx = middleIdx + 1;
            }

        }
        return false;
    }
}
