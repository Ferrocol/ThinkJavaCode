import java.util.Arrays;

public class Ex2 {

    public static void main(String[] args) {
        String myString = "I'm just a string, yes I'm only a string";
        letterHist(myString);
    }

    public static int[] letterHist(String textString) {
        String upperCaseString = textString.toUpperCase();
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int[] histogram = createEmptyArray(alphabet.length());

        for (int i = 0; i < upperCaseString.length(); i++) {
            char stringCharacter = upperCaseString.charAt(i);
            int whichLetterOfTheAlphabet = alphabet.indexOf(stringCharacter);
            if (whichLetterOfTheAlphabet >= 0) {
                histogram[whichLetterOfTheAlphabet] += 1;
            }
        }
//        System.out.println(Arrays.toString(histogram));
        return histogram;
    }

    public static int[] createEmptyArray(int size) {
        int[] emptyArray = new int[size];
        return emptyArray;
    }

}
