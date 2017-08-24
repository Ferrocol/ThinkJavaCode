import java.util.Scanner;

public class Doubloon {

    public static void main(String[] args) {
        String word;
        int[] letterHistogram;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a word: ");
        word = input.nextLine();
        letterHistogram = Ex2.letterHist(word);
        isDoubloon(word);
    }

    public static void isDoubloon(int[] letterHistogram){
        String uniformWord = word.toLowerCase();
        int i = 0;
        boolean result = false;
        do {
            if (letterHistogram[i] == letterHistogram[i + 1]) {
                result = true;
                i++;
            } else {
                result = false;
                break;
            }
        } while (i < (letterHistogram.length - 1));
        System.out.println(result);
    }

}
