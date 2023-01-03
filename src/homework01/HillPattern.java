package homework01;

import java.util.Scanner;

public class HillPattern {
    static void printHillPatternA(int numOfRow) {
        System.out.println("Hill Pattern A: ");
        int numOfCol = 1 + 2 * (numOfRow - 1);
        for (int row = 1; row <= numOfRow; row++) {
            for (int col = 1; col <= numOfCol; col++) {
                if ((col >= numOfCol - row - 3) && (col <= numOfRow + row - 1)) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    static void printReverseHillPatternB(int numOfRow) {
        System.out.println("Hill Pattern B: ");
        int numOfCol = 1 + 2 * (numOfRow - 1);
        for (int row = 1; row <= numOfRow; row++) {
            for (int col = 1; col <= numOfCol; col++) {
                if ((col < row) || (col > numOfCol + 1 - row)) {
                    System.out.print("  ");
                } else {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
    }

    static void printDiamondPatternC(int numOfRow) {
        System.out.println("Hill Pattern C: ");
        int numOfCol = 1 + 2 * (numOfRow - 1);
        //upper part
        for (int row = 1; row <= numOfRow; row++) {
            for (int col = 1; col <= numOfCol; col++) {
                if ((col >= numOfRow - row + 1) && (col <= numOfRow + row - 1)) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        //lower part
        for (int row = 2; row <= numOfRow; row++) {
            for (int col = 1; col <= numOfCol; col++) {
                if ((col < row) || (col > numOfCol + 1 - row)) {
                    System.out.print("  ");
                } else {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
    }

    static void printHollowDiamondPatternD(int numOfRow) {

        System.out.println("Hill Pattern D: ");
        int numOfCol = 1 + 2 * (numOfRow - 1);
        //first row
        for (int i = 1; i <= numOfCol; i++) {
            System.out.print("# ");
        }
        System.out.println();
        //upper part
        for (int row = 1; row < numOfRow; row++) {
            for (int col = 1; col <= numOfCol; col++) {
                if ((col >= numOfRow + 1 - row) && (col <= numOfRow + row - 1)) {
                    System.out.print("  ");
                } else {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
        //lower part
        for (int row = 3; row <= numOfRow; row++) {
            for (int col = 1; col <= numOfCol; col++) {
                if ((col < row) || (col > numOfCol + 1 - row)) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        //last row
        for (int i = 1; i <= numOfCol; i++) {
            System.out.print("# ");
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the rows: ");
        int numOfRow = input.nextInt();
        printHillPatternA(numOfRow);
        printReverseHillPatternB(numOfRow);
        printDiamondPatternC(numOfRow);
        printHollowDiamondPatternD(numOfRow);
    }
}
