package lab11.designpatterns.strategy;

public class CreditCardValidator {
    public static boolean isValid(long credit_number) {
        return (getSize(credit_number) >= 13
                && getSize(credit_number) <= 16
                && (prefixMatched(credit_number, 4)
                || prefixMatched(credit_number, 5)
                || prefixMatched(credit_number, 37)
                || prefixMatched(credit_number, 6))
                && (sumOfDoubleEvenPlace(credit_number)
                + sumOfOddPlace(credit_number)) % 10 == 0);
    }

    public static boolean isValid(String number) {
        return isValid(Long.parseLong(number));
    }

    public static int sumOfDoubleEvenPlace(long number) {
        int sum = 0;
        String num = number + "";
        for (int i = getSize(number) - 1; i >= 0; i -= 2) {
            sum += getDigit(Integer.parseInt(num.charAt(i) + ""));
        }
        return sum;
    }

    public static int getDigit(int num) {
        if (num < 9) {
            return num;
        }
        return num / 10 + num % 10;
    }

    public static int sumOfOddPlace(long number) {
        int sum = 0;
        String num = number + "";
        for (int i = getSize(number) - 1; i >= 0; i -= 2) {
            sum += Integer.parseInt(num.charAt(i) + "");
        }
        return sum;
    }

    public static boolean prefixMatched(long number, int d) {
        return getPrefix(number, getSize(d)) == d;
    }

    public static int getSize(long number) {
        String num = number + "";
        return num.length();
    }

    public static long getPrefix(long number, int k) {
        if (getSize(number) > k) {
            String num = number + "";
            return Long.parseLong(num.substring(0, k));
        }
        return number;
    }
}