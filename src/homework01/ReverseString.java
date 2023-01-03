package homework01;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String inStr = scan.next();
        scan.close();
        StringBuilder revStr = new StringBuilder("\"");
        for (int charInx = inStr.length() - 1; charInx >= 0; charInx--) {
            revStr.append(Character.toString(inStr.charAt(charInx)));
        }
        revStr.append("\"");
        System.out.printf("%s \"%s\" %s%s", "The reverse of the String", inStr, "is: ", revStr);

        //System.out.print(revStr.toString());


    }
}
