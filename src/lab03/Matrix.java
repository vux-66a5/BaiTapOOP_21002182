package lab03;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Matrix A's rows and columns: ");
        String inputA = scan.nextLine();
        String[] rowAndColA = inputA.split(" ");
        int rowA = Integer.parseInt(rowAndColA[0]);
        int colA = Integer.parseInt(rowAndColA[1]);
        int[][] tempMatrixA = new int[rowA][colA];

        System.out.print("Enter Matrix B's rows and columns: ");
        String inputB = scan.nextLine();
        String[] rowAndColB = inputB.split("\\s+");
        int rowB = Integer.parseInt(rowAndColB[0]);
        int colB = Integer.parseInt(rowAndColB[1]);
        int[][] tempMatrixB = new int[rowB][colB];

        //void createRandomMatrix
        createRandomMatrix(tempMatrixA);
        createRandomMatrix(tempMatrixB);

        //int[][] createRandomMatrix
        tempMatrixA = createRandomMatrix(rowA, colA);
        tempMatrixB = createRandomMatrix(rowB, colB);

        //print
        System.out.println("Matrix A: ");
        print(tempMatrixA);

        System.out.println("Matrix B: ");
        print(tempMatrixB);

        System.out.println("Addition of A and B: ");
        print(add(tempMatrixA, tempMatrixB));

        System.out.println("Subtraction of A and B: ");
        print(subtract(tempMatrixA, tempMatrixB));

        System.out.println("Multiplication of A and B: ");
        print(mutiply(tempMatrixA, tempMatrixB));

        System.out.println("Have same dimension ? : " + haveSameDimension(tempMatrixA, tempMatrixB));
    }

    public static void createRandomMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = (int) (Math.random() * 100);
            }
        }
    }

    public static int[][] createRandomMatrix(int rows, int cols) {
        int[][] tempMatrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                tempMatrix[i][j] = (int) (Math.random() * 100);
            }
        }
        return tempMatrix;
    }

    public static void print(int[][] matrix) {

        if (matrix == null) {
            System.out.println("The output matrix is empty !");
        } else {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

    public static void print(double[][] matrix) {

        if (matrix == null) {
            System.out.println("The output matrix is empty !");
        } else {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

    public static boolean haveSameDimension(int[][] matrix1, int[][] matrix2) {
        if (matrix1.length != matrix2.length) {
            return false;
        } else {
            if (matrix1[0].length != matrix2[0].length) {
                return false;
            }
        }
        return true;
    }

    public static boolean haveSameDimension(double[][] matrix1, double[][] matrix2) {
        if (matrix1.length != matrix2.length) {
            return false;
        } else {
            if (matrix1[0].length != matrix2[0].length) {
                return false;
            }
        }
        return true;
    }

    public static int[][] add(int[][] matrix1, int[][] matrix2) {

        if (matrix1 == null || matrix1.length == 0) {
            return null;
        }
        if (!haveSameDimension(matrix1, matrix2)) {
            return null;
        }
        int[][] sumMatrix = new int[matrix1.length][matrix1[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return sumMatrix;
    }

    public static double[][] add(double[][] matrix1, double[][] matrix2) {

        if (matrix1 == null || matrix1.length == 0) {
            return null;
        }
        if (!haveSameDimension(matrix1, matrix2)) {
            return null;
        }
        double[][] sumMatrix = new double[matrix1.length][matrix1[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return sumMatrix;
    }

    public static int[][] subtract(int[][] matrix1, int[][] matrix2) {

        if (matrix1 == null || matrix1.length == 0) {
            return null;
        }
        if (!haveSameDimension(matrix1, matrix2)) {
            return null;
        }
        int[][] subtractMatrix = new int[matrix1.length][matrix1[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                subtractMatrix[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        return subtractMatrix;
    }

    public static double[][] subtract(double[][] matrix1, double[][] matrix2) {

        if (matrix1 == null || matrix1.length == 0) {
            return null;
        }
        if (!haveSameDimension(matrix1, matrix2)) {
            return null;
        }
        double[][] subtractMatrix = new double[matrix1.length][matrix1[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                subtractMatrix[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        return subtractMatrix;
    }

    public static int[][] mutiply(int[][] matrix1, int[][] matrix2) {
        int[][] mutiMatrix = new int[matrix1.length][matrix2[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix2[0].length; j++) {
                mutiMatrix[i][j] = 0;
                for (int k = 0; k < matrix1[0].length; k++) {
                    mutiMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return mutiMatrix;
    }

    public static double[][] mutiply(double[][] matrix1, double[][] matrix2) {
        double[][] mutiMatrix = new double[matrix1.length][matrix2[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix2[0].length; j++) {
                mutiMatrix[i][j] = 0;
                for (int k = 0; k < matrix1[0].length; k++) {
                    mutiMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return mutiMatrix;
    }
}
