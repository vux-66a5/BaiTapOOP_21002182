package homework01;

import java.util.Scanner;

public class ExchangeCipher {
    private void outSymmetricCipher(String plaintext) {
        String cipherText = "";
        char originalChar, symmetricChar;
        for (int i = 0; i < plaintext.length(); i++) {
            originalChar = plaintext.charAt(i);
            symmetricChar = (char) ('A' + 'Z' - plaintext.charAt(i));
            cipherText += Character.toString(symmetricChar);
        }
        System.out.println("The cipher text string is: " + cipherText);
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a plaintext string: ");
        String plaintext = scan.next().toUpperCase();

        ExchangeCipher exCipher = new ExchangeCipher();
        exCipher.outSymmetricCipher(plaintext);
    }
}
