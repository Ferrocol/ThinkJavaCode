/**
 * Recursion exercise.
 */

import java.util.Scanner;

public class Recurse {

    public static void main(String[] args) {
        String s, sBackward;
        Scanner stringIn = new Scanner(System.in);

        System.out.print("Enter a string of text. ");
        s = stringIn.nextLine();

        System.out.println("First character: " + first(s));
        System.out.println("Remainder of the string: " + rest(s));
        System.out.println("Middle of the string: " + middle(s));
        System.out.println("Length: " + length(s));

        printString(s);
        sBackward = printBackward(s);
        isPalindrome(s, sBackward);
    }

    /**
     * Returns the first character of the given String.
     */
    public static char first(String s) {
        return s.charAt(0);
    }

    /**
     * Returns all but the first letter of the given String.
     */
    public static String rest(String s) {
        return s.substring(1);
    }

    /**
     * Returns all but the first and last letter of the String.
     */
    public static String middle(String s) {
        return s.substring(1, s.length() - 1);
    }

    /**
     * Returns the length of the given String.
     */
    public static int length(String s) {
        return s.length();
    }

    public static void printString(String s) {
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }
    }

    public static String printBackward(String s) {
        String backward = "";
        for (int i = (s.length() - 1); i >= 0; i--) {
            backward += s.charAt(i);
        }
        return backward;
    }

    public static boolean isPalindrome(String s, String sBackward) {
        boolean check = s.equals(sBackward);
        System.out.print("Is your string a palindrome? ");
        System.out.println(check);
        return check;
    }

}
