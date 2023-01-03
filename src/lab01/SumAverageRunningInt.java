package lab01;

public class SumAverageRunningInt {
    public static void main(String[] args) {
        int sum = 0;
        double average;
        final int lowerbound = 1;
        final int upperbound = 100;
//////////////////////////////////////////////////////
        //for loop
        for (int i = lowerbound; i <= upperbound; i++) {
            sum += i;
        }
/////////////////////////////////////////////////////
/*        //while-do loop
        int index = lowerbound;
        while(index <= upperbound) {
            sum += index;
            ++index;
        }*/
/////////////////////////////////////////////////////
/*        //do-while loop
        int index = lowerbound;
        do {
            sum += index;
            ++index;
        } while(index <= upperbound);*/
/////////////////////////////////////////////////////
        average = sum / 100;
        System.out.println("The sum of 1 to 100 is " + sum);
        System.out.println("The average is " + average);
        //count the numbers in the specified range
        int count = 0;
        for (int i = lowerbound; i <= upperbound; i++) {
            count++;
        }
        System.out.println("There are " + count + " number in range.");

        //sum of the squares
        int sumSquares = 0;
        for (int i = lowerbound; i <= upperbound; i++) {
            sumSquares += i * i;
        }
        System.out.println("Sum of the squares is: " + sumSquares);
        //sumOdd, sumEven and absolute difference
        int sumOdd = 0;
        int sumEven = 0;
        for (int i = lowerbound; i <= upperbound; i++) {
            if (i % 2 == 0) {
                sumEven += i;
            } else {
                sumOdd += i;
            }
        }
        System.out.println("Sum of odd numbers is: " + sumOdd);
        System.out.println("Sum of even numbers is: " + sumEven);
        System.out.println("Absolute difference is " + Math.abs(sumEven - sumOdd));
    }
}
