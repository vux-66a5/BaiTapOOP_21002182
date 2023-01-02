package lab02;

import java.util.Scanner;

public class ContainNumberInArray {
    public static boolean contains(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int arrSize = scan.nextInt();
        int[] arr = new int[arrSize];
        //input
        System.out.print("Enter the values of array: ");
        for (int i = 0; i < arrSize; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.print("Enter the check number: ");
        int checkNum = scan.nextInt();
        if (contains(arr, checkNum)) {
            System.out.println("Array contains given int");
        } else {
            System.out.println("Array doesn't contain given int");
        }
    }

}

