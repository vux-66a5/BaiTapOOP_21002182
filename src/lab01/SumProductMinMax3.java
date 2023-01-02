package lab01;

import java.util.Scanner;

public class SumProductMinMax3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        //input 3 integers
        System.out.println("Input first integer:");
        int firstInt = scan.nextInt();
        System.out.println("Input second integer:");
        int secondInt = scan.nextInt();
        System.out.println("Input third integer:");
        int thirdInt = scan.nextInt();
        //output sum
        System.out.println("The sum is: " + (firstInt+secondInt+thirdInt));
        //output product
        System.out.println("The product is: " + (firstInt*secondInt*thirdInt));
        //findMin
        int minNumber = firstInt;
        if(secondInt < minNumber) {
            minNumber = secondInt;
        }
        if(thirdInt < minNumber) {
            minNumber = thirdInt;
        }
        System.out.println("The min is : " + minNumber);
        //findMax
        int maxNumber = firstInt;
        if(secondInt > minNumber) {
            maxNumber = secondInt;
        }
        if(thirdInt > minNumber) {
            maxNumber = thirdInt;
        }
        System.out.println("The max is : " + maxNumber);
    }

}
