package homework01;

import java.util.Scanner;

public class PhoneKeyPad {
    static void convertUseSwitchCase(String inStr) {
        int digit = 0;
        for (int i = 0; i < inStr.length(); i++) {
            switch (inStr.toUpperCase().charAt(i)) {
                case 'A':
                case 'B':
                case 'C':
                    digit = 2;
                    break;
                case 'D':
                case 'E':
                case 'F':
                    digit = 3;
                    break;
                case 'G':
                case 'H':
                case 'I':
                    digit = 4;
                    break;
                case 'J':
                case 'K':
                case 'L':
                    digit = 5;
                    break;
                case 'M':
                case 'N':
                case 'O':
                    digit = 6;
                    break;
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                    digit = 7;
                    break;
                case 'T':
                case 'U':
                case 'V':
                    digit = 8;
                    break;
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                    digit = 9;
                    break;
            }
            System.out.print(digit);
        }
        System.out.println();
    }

    static void convertUseNestedIf(String inStr) {
        String digitStr = "";
        for (int i = 0; i < inStr.length(); i++) {
            char checkChar = inStr.toLowerCase().charAt(i);
            if (checkChar == 'a' || checkChar == 'b' || checkChar == 'c') {
                digitStr += "2";
            }
            if (checkChar == 'd' || checkChar == 'e' || checkChar == 'f') {
                digitStr += "3";
            }
            if (checkChar == 'g' || checkChar == 'h' || checkChar == 'i') {
                digitStr += "4";
            }
            if (checkChar == 'j' || checkChar == 'k' || checkChar == 'l') {
                digitStr += "5";
            }
            if (checkChar == 'm' || checkChar == 'n' || checkChar == 'o') {
                digitStr += "6";
            }
            if (checkChar == 'p' || checkChar == 'q' || checkChar == 'r' || checkChar == 's') {
                digitStr += "7";
            }
            if (checkChar == 't' || checkChar == 'u' || checkChar == 'v') {
                digitStr += "8";
            }
            if (checkChar == 'w' || checkChar == 'x' || checkChar == 'y' || checkChar == 'z') {
                digitStr += "9";
            }
        }
        System.out.println(digitStr);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a String: ");
        String inStr = scan.next();
        //PhoneKeyPad keypad= new PhoneKeyPad();
        //convertUseSwitchCase(inStr);
        convertUseNestedIf(inStr);
    }

}
