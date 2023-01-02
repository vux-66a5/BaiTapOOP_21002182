package lab01;

public class ComputePI {
    public static void findPiByMaxDenominator() {
        int MAX_DENOMINATOR = 1000000;
        double sum = 0.0;
        for (int i = 1; i <= MAX_DENOMINATOR; i+=2) {
            if(i % 4 == 1) {
                sum += (double) 1/i;
            } else {
                sum -= (double) 1/i;
            }
        }
        System.out.println("PI by MAX_DENOMINATOR is: " + 4*sum);
    }
    public static void findPiByMaxTerm() {
        int MAX_TERM = 10000;
        double sum1 = 0.0;
        for(int term = 1; term <= MAX_TERM; term++ ) {
            if(term % 2 == 1) {
                sum1 += 1.0 / (term * 2 - 1);
            } else {
                sum1 -= 1.0 / (term * 2 - 1);
            }

        }
        System.out.println("PI by MAX_TERM is: " + 4*sum1);
    }
    public static void main(String[] args) {
        findPiByMaxDenominator();
        findPiByMaxTerm();
    }
}
