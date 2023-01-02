package lab02;

import java.util.Scanner;

public class CheckEqualArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Array 1");
        int[] arr1 = inputArr(scan);
        System.out.println("Array 2");
        int[] arr2 = inputArr(scan);
        if (equals(arr1, arr2)) {
            System.out.println("Same");
        } else {
            System.out.println("Aren't same");
        }
    }

    static int[] inputArr(Scanner scan) {
        System.out.print("Enter the array size: ");
        int arrSize = scan.nextInt();
        int[] arr = new int[arrSize];
        System.out.print("Enter array elements: ");
        for (int i = 0; i < arrSize; i++) {
            arr[i] = scan.nextInt();
        }
        return arr;
    }

    public static boolean equals(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }
}
