package homework01;

import java.util.Scanner;

public class DecipherCaesarCode {
    private void convertDecipherCode(String cipherText) {
        String plainText = "";
        for(int i = 0; i < cipherText.length(); i++) {
            if(Character.toString(cipherText.charAt(i)).matches("^[D-Z]$")) {
                plainText += Character.toString(cipherText.charAt(i) - 3);
            }
            else if(cipherText.charAt(i) == 'A') {
                plainText += "X";
            }
            else if(cipherText.charAt(i) == 'B') {
                plainText += "Y";
            }
            else if (cipherText.charAt(i) == 'C') {
                plainText += "Z";
            }
            else {
                plainText += Character.toString(cipherText.charAt(i));
            }

        }
        System.out.println("The plaintext string is: " + plainText);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a ciphertext string: ");
        String cipherText = scan.next().toUpperCase();

        DecipherCaesarCode decipher = new DecipherCaesarCode();
        decipher.convertDecipherCode(cipherText);
    }
}
