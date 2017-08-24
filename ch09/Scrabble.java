import java.util.Scanner;

public class Scrabble {

    public static void main(String[] args) {
        String word, letters;
        int[] letterHist, wordHist;
        boolean result;

        Scanner input = new Scanner(System.in);

        System.out.println("Let's play Scrabble. Can you spell your word with the letters you have?");

        System.out.print("What letters do you have? ");
        letters = input.nextLine();

        System.out.print("What word are you trying to spell? ");
        word = input.nextLine();

        letterHist = createLetterHistogram(letters);
        wordHist = createLetterHistogram(word);

        result = canSpell(wordHist, letterHist);
        System.out.print("Can \"" + word + "\" be spelled with " + letters + "? ");
        System.out.println(result);
    }

    public static int[] createLetterHistogram(String string) {
        int[] stringHist = Ex2.letterHist(string);
        return stringHist;
    }

    public static boolean canSpell(int[] word, int[] letters) {
        boolean enoughLetters = true;
        for (int i = 0; i < word.length; i++) {
            if (letters[i] < word[i]) {
                enoughLetters = false;
                break;
            }
        }
        return enoughLetters;
    }

}
