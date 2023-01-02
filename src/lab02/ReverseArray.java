package lab02;

import java.util.Scanner;

public class ReverseArray {
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

    public static void reverse(int[] array) {
        for (int fIdx = 0, bIdx = array.length - 1; fIdx < bIdx; fIdx++, bIdx--) {   //fIdx = forward index; bIdx = backward index
            int temp = array[fIdx];
            array[fIdx] = array[bIdx];
            array[bIdx] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = inputArr(scan);
        reverse(arr);
        //System.out.println(Arrays.toString(arr));

    }
}
