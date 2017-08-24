/**
 * Exercise on encapsulation and generalization.
 */

import java.util.Scanner;

public class Exercise {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string of text, such as a simple math calculation with parentheses: ");
        String s = input.nextLine();
        openCloseParentheses(s);
    }

    public static void openCloseParentheses(String s) {
        System.out.println(s);
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                count++;
            } else if (c == ')') {
                count--;
            }
        }
        System.out.println("Number of open parentheses: " + count);
    }


}
