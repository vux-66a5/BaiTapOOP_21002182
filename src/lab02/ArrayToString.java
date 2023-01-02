package lab02;

import java.util.Scanner;

public class ArrayToString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int arrSize = scan.nextInt();
        int[] arr = new int[arrSize];
        System.out.print("Enter the values of array: ");
        for (int i = 0; i < arrSize; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.print("The values are: ");
        System.out.println(arrayToString(arr));
    }

    public static String arrayToString(int[] array) {
        //return Arrays.toString(array);
        StringBuilder arrStr = new StringBuilder("[");
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                arrStr.append(String.valueOf(array[i]));
            } else {
                arrStr.append(", ");
                arrStr.append(String.valueOf(array[i]));
            }
        }
        arrStr.append("]");
        return arrStr.toString();
    }
}
