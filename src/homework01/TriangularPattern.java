package homework01;

import java.util.Scanner;

public class TriangularPattern {
    static void printTriangularPatternA(int size) {
        System.out.println("Pattern A");
        for(int row = 1; row <= size; row++){
            for(int col = 1; col <= size; col++){
                if(col <= row) {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
    static void printTriangularPatternB(int size) {
        System.out.println("Pattern B");
        for(int row = 1; row <= size; row++){
            for(int col = row; col <= size; col++){
                 System.out.print("# ");
            }
            System.out.println();
        }
        System.out.println();
    }
    static void printTriangularPatternC(int size) {
        System.out.println("Pattern C");
        for(int row = 1; row <= size; row++){
            for(int col = 1; col <= size; col++){
                if(col < row) {
                    System.out.print("  ");
                } else {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
    static void printTriangularPatternD(int size) {
        System.out.println("Pattern D");
        for(int row = 1; row <= size; row++){
            for(int col = row; col < size; col++){
                System.out.print("  ");
            }
            for(int col = 1; col <= row; col++) {
                System.out.print("# ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size:");
        int size = input.nextInt();
        printTriangularPatternA(size);
        printTriangularPatternB(size);
        printTriangularPatternC(size);
        printTriangularPatternD(size);
    }
}
