package homework01;

import java.util.Scanner;

public class Bin2Dec {
    static int convertBinToDec(String inBinStr) {
        int decNum = 0;
        for(int i = 0; i < inBinStr.length(); i++) {
            if(inBinStr.charAt(i) == '0') {
                continue;
            }
            int pos = (inBinStr.length() - 1 - i);
            decNum += Math.pow( 2, pos );
        }
        return decNum;
    }
    static boolean isBin(String inStr) {
        for(int i = 0; i < inStr.length(); i++) {
            if(inStr.charAt(i) == '0' || inStr.charAt(i) == '1') {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Binary string: ");
        String inBinStr = scan.next();

        if(isBin(inBinStr)) {
            System.out.println("The equivalent decimal number for binary \"" + inBinStr + "\" is: " + convertBinToDec(inBinStr));
        } else {
            System.out.println("Error: Invalid Binary String \"" + inBinStr + "\"");
        }

    }
}
