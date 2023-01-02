package homework01;

import java.util.Scanner;

public class CaesarCode {
    private void computeCipherText(String plaintext) {
        String cipherText = "";
        for(int i = 0; i < plaintext.length(); i++) {
            if(Character.toString(plaintext.charAt(i)).matches("^[A-W]$")) {
                cipherText += Character.toString(plaintext.charAt(i) + 3);
            }
            else if(plaintext.charAt(i) == 'X') {
                cipherText += "A";
            }
            else if(plaintext.charAt(i) == 'Y') {
                cipherText += "B";
            }
            else if (plaintext.charAt(i) == 'Z') {
                cipherText += "C";
            }
            else {
                cipherText += Character.toString(plaintext.charAt(i));
            }

        }
        System.out.println("The ciphertext string is: " + cipherText);
    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a plaintext string: ");
        String plainText = scan.next().toUpperCase();

        CaesarCode caesar = new CaesarCode();
        caesar.computeCipherText(plainText);
    }
}
