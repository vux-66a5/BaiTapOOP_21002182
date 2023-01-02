package homework01;

import java.util.Scanner;

public class CountVowelsDigits {
    static boolean isVowels(char inChar) {
        switch (inChar) {
            case ('a'):
            case ('e'):
            case ('i'):
            case ('u'):
            case ('o'):
                return true;
            default:
                return false;
        }
    }
    static boolean isDigits(char inDigit) {
        if(inDigit >= '0' && inDigit <= '9') {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String inStr = scan.next().toLowerCase();
        int totalVowels = 0;
        int totalDigits = 0;
        for ( int charIdx = 0; charIdx < inStr.length(); charIdx++) {
            if(isVowels(inStr.charAt(charIdx))){
                totalVowels += 1;
            }
            if(Character.isDigit(inStr.charAt(charIdx))) {
                totalDigits += 1;
            }
        }
        double vowelsPercent = (double)totalVowels / inStr.length() * 100;
        double digitsPercent = (double)totalDigits / inStr.length() * 100;
        System.out.printf("%s%d %s%.2f%%%s%n", "Number of vowels: " , totalVowels , "(" , vowelsPercent , ")");
        System.out.printf("%s%d %s%.2f%%%s%n", "Number of digits: " , totalDigits , "(" , digitsPercent , ")");
    }
}

