package lab02;

import java.util.Scanner;

public class Hex2Bin {
    static boolean isHex(String inHexStr) {
        inHexStr = inHexStr.toUpperCase();
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

    static String convertHexToBin(String inHexStr, String[] HEX_BITS) {
        inHexStr = inHexStr.toUpperCase();
        StringBuilder binRes = new StringBuilder();
        String currentChar;
        for (int i = 0; i < inHexStr.length(); i++) {
            currentChar = Character.toString(inHexStr.charAt(i));
            switch (currentChar) {
                case "0":
                    binRes.append(HEX_BITS[0]);
                    break;
                case "1":
                    binRes.append(HEX_BITS[1]);
                    break;
                case "2":
                    binRes.append(HEX_BITS[2]);
                    break;
                case "3":
                    binRes.append(HEX_BITS[3]);
                    break;
                case "4":
                    binRes.append(HEX_BITS[4]);
                    break;
                case "5":
                    binRes.append(HEX_BITS[5]);
                    break;
                case "6":
                    binRes.append(HEX_BITS[6]);
                    break;
                case "7":
                    binRes.append(HEX_BITS[7]);
                    break;
                case "8":
                    binRes.append(HEX_BITS[8]);
                    break;
                case "9":
                    binRes.append(HEX_BITS[9]);
                    break;
                case "A":
                    binRes.append(HEX_BITS[10]);
                    break;
                case "B":
                    binRes.append(HEX_BITS[11]);
                    break;
                case "C":
                    binRes.append(HEX_BITS[12]);
                    break;
                case "D":
                    binRes.append(HEX_BITS[13]);
                    break;
                case "E":
                    binRes.append(HEX_BITS[14]);
                    break;
                case "F":
                    binRes.append(HEX_BITS[15]);
                    break;
                default:
                    break;
            }
            binRes.append(" ");
        }
        return binRes.toString();
    }

    public static void main(String[] args) {
        final String[] HEX_BITS = {"0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111", "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"};
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Hexadecimal string: ");
        String inHexStr = scan.next();
        if (isHex(inHexStr)) {
            System.out.printf("%s \"%s\" %s %s ", "The equivalent binary for hexadecimal", inHexStr, "is:", convertHexToBin(inHexStr, HEX_BITS));
        } else {
            System.out.println("Not a hex string! Please check again.");
        }
    }
}
