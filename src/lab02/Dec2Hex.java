package lab02;

import java.util.Scanner;

public class Dec2Hex {
    static boolean isDec(String inDecStr) {
        for (int i = 0; i < inDecStr.length(); i++) {
            if (inDecStr.charAt(i) >= '0' && inDecStr.charAt(i) <= '9') {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }

    static String convertDec2Hex(int inDec) {
        StringBuilder hexStr = new StringBuilder();
        while (inDec > 0) {
            int remainder = inDec % 16;
            switch (remainder) {
                case 0:
                    hexStr.append("0");
                    break;
                case 1:
                    hexStr.append("1");
                    break;
                case 2:
                    hexStr.append("2");
                    break;
                case 3:
                    hexStr.append("3");
                    break;
                case 4:
                    hexStr.append("4");
                    break;
                case 5:
                    hexStr.append("5");
                    break;
                case 6:
                    hexStr.append("6");
                    break;
                case 7:
                    hexStr.append("7");
                    break;
                case 8:
                    hexStr.append("8");
                    break;
                case 9:
                    hexStr.append("9");
                    break;
                case 10:
                    hexStr.append("A");
                    break;
                case 11:
                    hexStr.append("B");
                    break;
                case 12:
                    hexStr.append("C");
                    break;
                case 13:
                    hexStr.append("D");
                    break;
                case 14:
                    hexStr.append("E");
                    break;
                case 15:
                    hexStr.append("F");
                    break;
            }
            inDec /= 16;
        }
        return hexStr.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int inDecStr = scan.nextInt();
        System.out.println("The equivalent hexadecimal number is " + convertDec2Hex(inDecStr));

    }
}
