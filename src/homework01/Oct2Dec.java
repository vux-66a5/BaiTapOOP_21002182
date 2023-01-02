package homework01;

import java.util.Scanner;

public class Oct2Dec {
    static boolean isValidOct(String inStr) {
        for (int i = 0; i < inStr.length(); i++) {
            if (inStr.charAt(i) >= '0' && inStr.charAt(i) <= '7') {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }

    static int convertOctToDec(String inOctStr) {
        int octOut = 0;
        for (int i = 0; i < inOctStr.length(); i++) {
            if (isValidOct(inOctStr)) {
                octOut += Character.getNumericValue(inOctStr.charAt(i)) * Math.pow(8, inOctStr.length() - 1 - i);
            } else {
                return -1;
            }
        }
        return octOut;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an Octal string: ");
        String inOctStr = scan.next();

        System.out.printf("%s \"%s\" %s %d", "The equivalent decimal number", inOctStr, "is", convertOctToDec(inOctStr));
    }
}
