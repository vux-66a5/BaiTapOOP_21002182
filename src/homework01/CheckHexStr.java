package homework01;

import java.util.Scanner;

public class CheckHexStr {
    static boolean isHexStr(String inStr) {
        int count = 0;
        for(int i = 0 ; i < inStr.length(); i++) {
            if( (inStr.charAt(i) >= '0' && inStr.charAt(i) <= '9')
                || (inStr.charAt(i) >= 'a' && inStr.charAt(i) <= 'f')
                || (inStr.charAt(i) >= 'A' && inStr.charAt(i) <= 'F') ) {
                    count++;
            }
        }
        return(count == inStr.length());
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a hex string: ");
        String inStr = scan.next();
        //print
        if(isHexStr(inStr)) {
            System.out.println('"' + inStr +'"'+ " is a hex string");
        } else {
            System.out.println('"' + inStr +'"'+ " is not a hex string");
        }

    }
}
