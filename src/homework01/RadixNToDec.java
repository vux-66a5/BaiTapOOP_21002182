package homework01;

import java.util.Scanner;

public class RadixNToDec {
    static boolean isValidN(String inStr, int radixSys) {
        for (int i = 0; i < inStr.length(); i++) {
            if (radixSys < 10 && inStr.charAt(i) >= '0' && inStr.charAt(i) <= Character.forDigit(radixSys,10)-1 ) {
                continue;
            } else if (radixSys >= 10 && inStr.charAt(i) >= '0' && inStr.charAt(i) <= '9' ) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }
    static boolean isValidHex(String inHexStr) {
        for( int i = 0 ; i < inHexStr.length(); i++ ) {
            if( (inHexStr.charAt(i) >= 'A' && inHexStr.charAt(i) <= 'F')
                    || (inHexStr.charAt(i) >= '0' && inHexStr.charAt(i) <= '9') ) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }
    public static int convertN2Dec(String inStr, int radixSys) {
        if(!isValidN(inStr,radixSys)) {
            return -1;
        }
        int decValue = 0;
        for(int i = 0 ; i < inStr.length(); i++) {
            decValue = decValue * radixSys + Character.digit(inStr.charAt(i),radixSys);
        }
        return decValue;
    }
    static int convertHexToDec(String inHexStr) {
        int decRes = 0;
        for(int i = 0; i < inHexStr.length(); i++) {
            int pos = inHexStr.length() - 1 - i;
            decRes += Character.digit(inHexStr.charAt(i),16)*Math.pow(16, pos);
        }
        return decRes;
    }
    static void chooseRadixSystem(int radixSys, String inStr) {
        if(radixSys == 16) {
            System.out.print(convertHexToDec(inStr));
        } else {
            System.out.print(convertN2Dec(inStr,radixSys));
        }

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the radix: ");
        int radixSys = Integer.parseInt(scan.nextLine());
        System.out.print("Enter the string: ");
        String inStr = scan.nextLine();
        chooseRadixSystem(radixSys,inStr);
    }
}
