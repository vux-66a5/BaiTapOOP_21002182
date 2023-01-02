package lab02;

import java.util.Arrays;
import java.util.Scanner;

public class GradesStatisticsExpansion {
    public static int[] grades;

    public static void main(String[] args) {
        readGrades();
        System.out.print("The grades are: ");
        print(grades);
        System.out.println("The average is: " + average(grades));
        System.out.println("The median is: " + median(grades));
        System.out.println("The minimum is: " + min(grades));
        System.out.println("The maximum is: " + max(grades));
        System.out.printf("%s %.2f", "The standard deviation is: ", stvDev(grades));
    }

    public static void readGrades() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int size = scan.nextInt();
        grades = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the grade for the student " + (i + 1) + ": ");
            grades[i] = scan.nextInt();
        }
    }

    public static void print(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print((i == 0) ? array[i] : ", " + array[i]);
        }
        System.out.print("]");
        System.out.println();
    }

    public static double average(int[] array) {
        int sum = 0;
        for (int j : array) {
            sum += j;
        }
        return (double) sum / array.length;
    }

    public static double median(int[] array) {
        //sort
//        for (int i = 0; i < array.length - 1; i++) {
//            for (int j = i + 1; j < array.length; j++) {
//                if (array[i] > array[j]) {
//                    int temp = array[i];
//                    array[i] = array[j];
//                    array[j] = temp;
//                }
//            }
//        }
        Arrays.sort(array);
        if (array.length % 2 == 1) {
            return (double) array[(array.length - 1) / 2];
        } else {
            return (double) (array[array.length / 2 - 1] + array[array.length / 2]) / 2;
        }
    }

    public static int max(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static int min(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static double stvDev(int[] array) {
        double sigma = 0;
        double mean = average(array);
        for (int j : array) {
            sigma += j * j - mean * mean;
        }
        double variance = (double) 1 / array.length * sigma;
        double deviation = Math.sqrt(variance);
        return deviation;
    }
}

