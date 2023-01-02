package lab03;

import java.util.Scanner;

public class NumberSystemConversion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number and radix: ");
        String inStr = scan.next();
        System.out.print("Enter the input radix: ");
        int inRadixSys = scan.nextInt();
        System.out.print("Enter the output radix: ");
        int outRadixSys = scan.nextInt();
        convert(inStr, inRadixSys, outRadixSys);

    }

    public static void convert(String inStr, int inRadixSys, int outRadixSys) {
        if (isValid(inStr, inRadixSys)) {
            if (inRadixSys == 10) {                                                                                                                                                 //convert dec to anything
                System.out.printf("\"%s\" %s %d %s \"%s\" %s %d", inStr, "in radix", inRadixSys, "is", convertDecToAny(inStr, outRadixSys), "in radix", outRadixSys);
            } else {
                if (outRadixSys == 10) {                                                                                                                                            //direct convert to dec
                    System.out.printf("\"%s\" %s %d %s \"%s\" %s %d", inStr, "in radix", inRadixSys, "is", convertToDec(inStr, inRadixSys), "in radix", outRadixSys);
                } else {
                    String originalToDec = convertToDec(inStr, inRadixSys);                                                                                                         //convert to dec first
                    System.out.printf("\"%s\" %s %d %s \"%s\" %s %d", inStr, "in radix", inRadixSys, "is", convertDecToAny(originalToDec, outRadixSys), "in radix", outRadixSys);   //and then convert from dec to anything
                }
            }
        }
    }

    public static boolean isValid(String inStr, int inRadixSys) {
        inStr = inStr.toUpperCase();
        for (int i = 0; i < inStr.length(); i++) {
            if (Character.digit(inStr.charAt(i), inRadixSys) != -1) {     //.digit return -1 if can't convert
                continue;
            } else {
                return false;
            }
        }
        return true;
    }

    public static String convertToDec(String inStr, int radixSys) {
        if (!isValid(inStr, radixSys)) {
            return "";
        }
        long decValue = 0;
        for (int i = 0; i < inStr.length(); i++) {
            decValue = decValue * radixSys + Character.digit(inStr.charAt(i), radixSys);
        }
        return Long.toString(decValue);
    }

    public static String convertDecToAny(String inDec, int outRadixSys) {
//        StringBuilder otherBase = new StringBuilder();
        long decValue = Long.parseLong(inDec);
//        while (decValue > 0) {
//            long remainder = decValue % outRadixSys;
//            otherBase.append(Integer.toUnsignedString((int) remainder, outRadixSys));
//            decValue /= outRadixSys;
//        }
        return Long.toUnsignedString(decValue, outRadixSys);
    }
}
