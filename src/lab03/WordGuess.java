package lab03;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;

public class WordGuess {
    //Khai bao bien toan cuc (declare instance variables)
    static int numTrials = 1; //count number of trials
    static int count = 0; //decice when to stop ( when full boolean[] is true -> guess full character )

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //String key = scan.nextLine();  // dap an //user input
        //String key = args[0]; //argument

        String key = null;
        try {
            key = Files.readAllLines(Paths.get("/home/vux/randomword.txt")).get((int) (Math.random() * 10)); //input random line from a file ( < 10 lines )
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        boolean[] isValid = new boolean[key.length()]; // co dang [true,false,false,true, ....] have same length as key
        StringBuilder hint = new StringBuilder(); //empty String, use later

        while (true) {

            System.out.print("Key in one character of your guess word: ");
            String guessStr = scan.next(); //input from user

            // catch exception
            if (guessStr == null || guessStr.length() == 0) {
                System.out.println("Enter at least 1 character !");
                break;
            }

            if (guessStr.length() == 1) { // user guess only 1 character of word

                isRight(isValid, key, guessStr); // pass by sharing
                System.out.printf("%s %d %s %s \n", "Trial", numTrials, ":", guessStrByChar(hint, isValid, key, guessStr)); //print the revealed character
                System.out.println(Arrays.toString(isValid));     //use to see the changes of boolean[] - not important
                numTrials += 1; // you know it right =))
            } else {  // user guess full word
                if (guessStrbyStr(key, guessStr)) {  //print things
                    System.out.printf("%s %d %s %s \n", "Trial", numTrials, ":", "True!");
                } else {
                    System.out.printf("%s %d %s %s \n", "Trial", numTrials, ":", "Not true! Guess again");
                }
                numTrials += 1;
            }

            if (count == key.length()) {  // read line 12
                System.out.println("Congratulation!");
                System.out.println("You got in " + (numTrials - 1) + " trials");
                break; //out
            }
        }

    }

    public static void isRight(boolean[] isValid, String key, String inChar) {
        for (int i = 0; i < isValid.length; i++) {
            if (inChar.equals(String.valueOf(key.charAt(i)))) {
                isValid[i] = true; //have = 1 , don't have = 0;
                count++; //1 char guessed -> count = 1 ; 2 char guessed -> count = 2 ; ....
            }
        }
    }

    public static String printHint(StringBuilder hint, String key, boolean[] isValid, String inChar) {
        //first assign the hint string to "____________"
        if (hint.length() == 0) {
            hint.append("_".repeat(key.length()));
        }
        //replace all character at indexes where boolean[index] = true AND hasn't been replace before ("_")
        for (int i = 0; i < isValid.length; i++) {
            if (isValid[i] && String.valueOf(hint.charAt(i)).equals("_")) {
                hint.setCharAt(i, inChar.charAt(0));
            }
        }
        return hint.toString();
    }

    public static String guessStrByChar(StringBuilder hint, boolean[] isValid, String key, String inChar) {
        return printHint(hint, key, isValid, inChar);
    }

    public static boolean guessStrbyStr(String key, String inStr) {
        if (key.equals(inStr)) {
            count = key.length(); //equal -> guess true -> need to stop program ( read line 12 )
            return true;
        }
        return false;
    }
}
