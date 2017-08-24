import java.util.Scanner;

public class Anagram {

    public static void main(String[] args) {
        String firstWord, secondWord;
        int[] firstWordHist, secondWordHist;
        boolean result;

        Scanner input = new Scanner(System.in);

        System.out.println("Let's find out if two words are anagrams.");

        System.out.print("Please enter the first word: ");
        firstWord = input.nextLine();

        System.out.print("Please enter the second word: ");
        secondWord = input.nextLine();

        firstWordHist = createLetterHistogram(firstWord);
        secondWordHist = createLetterHistogram(secondWord);

        result = isAnagram(firstWordHist, secondWordHist);

        System.out.print("Are " + firstWord + " and " + secondWord + " anagrams? ");
        System.out.println(result);
    }

    public static int[] createLetterHistogram(String word) {
        int[] wordHist;
        wordHist = Ex2.letterHist(word);
        return wordHist;
    }

    public static boolean isAnagram(int[] firstWordHist, int[] secondWordHist) {
        boolean anagram = true;
        for (int i = 0; i < firstWordHist.length; i++) {
            if (firstWordHist[i] != secondWordHist[i]) {
                anagram = false;
                break;
            }
        }
        return anagram;
    }

}
