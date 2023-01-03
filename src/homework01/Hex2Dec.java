package homework01;

import java.util.Scanner;

public class Hex2Dec {
    static boolean isHex(String inHexStr) {
        for (int i = 0; i < inHexStr.length(); i++) {
            if ((inHexStr.charAt(i) >= 'A' && inHexStr.charAt(i) <= 'F')
                    || (inHexStr.charAt(i) >= '0' && inHexStr.charAt(i) <= '9')) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }

    static int convertHexToDec(String inHexStr) {
        int decRes = 0;
        for (int i = 0; i < inHexStr.length(); i++) {
            int pos = inHexStr.length() - 1 - i;
            decRes += Character.digit(inHexStr.charAt(i), 16) * Math.pow(16, pos);
        }
        return decRes;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Hexadecimal string: ");
        String inHexStr = scan.next().toUpperCase();

        if (isHex(inHexStr)) {
            System.out.println("The equivalent decimal number for hexadecimal \"" + inHexStr + "\" is: " + convertHexToDec(inHexStr));
        } else {
            System.out.println("Error: Invalid Binary String \"" + inHexStr + "\"");
        }
    }
}
