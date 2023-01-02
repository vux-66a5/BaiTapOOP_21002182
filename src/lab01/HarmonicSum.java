package lab01;

public class HarmonicSum {
    public static void main(String[] args) {
        final int n = 50000;
        double sumL2R = 0.0;
        double sumR2L = 0.0;
        double absDiff;
        // for−loop for summing from left-to-right
        for(int i = 1; i <= n; i++) {
            sumL2R += (double)1/i;
        }
        System.out.println("The sum from left-to-right is: " + sumL2R);
        // for−loop for summing from right−to−left
        for(int i = n; i >= 1; i--) {
            sumR2L += (double)1/i;
        }
        System.out.println("The sum from right-to-left is: " + sumR2L);
        // Find the absolute difference and display
        absDiff = Math.abs(sumL2R - sumR2L);
        System.out.println("Absolute difference is: " + absDiff);

    }
}
