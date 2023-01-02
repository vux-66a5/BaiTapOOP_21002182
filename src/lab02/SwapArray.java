package lab02;

import java.util.Scanner;

public class SwapArray {
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

    public static boolean swap(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            int temp = array1[i];
            array1[i] = array2[i];
            array2[i] = temp;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Array 1");
        int[] arr1 = inputArr(scan);
        System.out.println("Array 2");
        int[] arr2 = inputArr(scan);
        //System.out.println(swap(arr1,arr2));

    }
}
