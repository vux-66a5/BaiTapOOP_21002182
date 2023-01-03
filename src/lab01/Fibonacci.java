package lab01;

public class Fibonacci {
    public static void main(String[] args) {
        int f1 = 0;
        int f2 = 1;
        System.out.println(f1 + " ");
        for (int i = 1; i <= 20; i++) {
            System.out.println(f2 + " ");
            int f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
        }
    }
}
