package homework01;

import java.util.Scanner;

public class TestPalindromicWord {
    static boolean isPalindrome(String inStr) {
        inStr = inStr.toLowerCase().replaceAll("\\s+", "").replaceAll("\\p{Punct}", "");
        String reverseStr = "";
        for (int i = inStr.length() - 1; i >= 0; i--) {
            if (Character.toString(inStr.charAt(i)).matches("^[a-z]$")) {
                reverseStr += Character.toString(inStr.charAt(i));
            }
        }
        return (reverseStr.equals(inStr));
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string(word/phrase): ");
        String inStr = scan.nextLine();

        if (isPalindrome(inStr)) {
            System.out.println('"' + inStr + '"' + " is a palinerome.");
        } else {
            System.out.println('"' + inStr + '"' + " is not a palinerome.");
        }
    }
}
