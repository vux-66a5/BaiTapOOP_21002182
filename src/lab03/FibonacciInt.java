package lab03;

public class FibonacciInt {
    public static void main(String[] args) {
        printFibonacci();
    }

    public static void printFibonacci() {
        int fiboNminus2 = 1;
        int fiboNminus1 = 1;
        int fiboN = 0;
        System.out.println("F" + "(" + 0 + ")" + " = " + fiboNminus2);
        System.out.println("F" + "(" + 1 + ")" + " = " + fiboNminus1);
        int i = 2;
        while (true) {
            fiboN = fiboNminus1 + fiboNminus2;
            if (Integer.MAX_VALUE - fiboNminus1 < fiboNminus2) {
                System.out.println("F" + "(" + i + ")" + " is out of the range of int ");
                break;
            } else {
                System.out.println("F" + "(" + i + ")" + " = " + fiboN);

            }
            fiboNminus2 = fiboNminus1;
            fiboNminus1 = fiboN;
            i++;
        }
    }
}
