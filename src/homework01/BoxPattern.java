package homework01;

import java.util.Scanner;

public class BoxPattern {
    static void printBoxPatternA(int size) {
        System.out.println("Pattern A : ");
        for(int row = 1; row < size; row++){
            for(int col = 1; col < size ; col++) {
                if(row == 1 || row == size-1 || col == 1 || col == size-1){
                    System.out.print("#  ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
    static void printBoxPatternB(int size) {
        System.out.println("Pattern B : ");
        for(int row = 1; row < size; row++) {
            for(int col = 1; col < size; col++) {
                if(row == 1 || row == col || row == size-1 ){
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    static void printBoxPatternC (int size) {
        System.out.println("Pattern C : ");
        for(int row = 1; row < size; row++) {
            for(int col = 1; col<size; col++){
                if(row == 1 || row == size-1 || col == size - row) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    static void printBoxPatternD(int size) {
        System.out.println("Pattern D : ");
        for(int row = 1; row < size; row++) {
            for(int col = 1; col<size; col++){
                if(row == 1 || row == size-1 || col == size - row || row == col) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = scan.nextInt();
        printBoxPatternA(size);
        printBoxPatternB(size);
        printBoxPatternC(size);
        printBoxPatternD(size);

    }
}
