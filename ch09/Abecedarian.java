import java.util.Scanner;

public class Abecedarian {

    public static void main(String[] args) {
        String stringIn;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a word: ");
        stringIn = input.nextLine();

        isAbecedarian(stringIn);
    }

    public static void isAbecedarian(String s) {
        int i = 0;
        boolean result = false;
        String lowerS = s.toLowerCase();

        do {
            if (s.charAt(i) < s.charAt(i + 1)) {
                result = true;
                i++;
            } else {
                result = false;
                break;
            }
        } while (i < ((s.length()) - 1));

        System.out.println("Is \"" + s + "\" abecedarian? " + result);
    }

}
