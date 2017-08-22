import java.util.Arrays;

public class Ex2 {

    public static void main(String[] args) {
        String myString = "This is a test string";
        letterHist(myString);
    }

    public static void letterHist(String textString) {
        System.out.println(textString.length());
//        char[] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',
//                            'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        int[] histogram = createNewArray(alphabet.length);
        String upperCaseString = textString.toUpperCase();
        System.out.println(upperCaseString);
        for (int i = 0; i < textString.length(); i++) {
            char currentCharacter = textString.charAt(i);
            int index = alphabet.indexOf(currentCharacter);
            System.out.println(index);
//            histogram(index) += 1;
//            return histogram;
        }
//        System.out.println(Arrays.toString(histogram));
    }

    public static int[] createNewArray(int size) {
        int[] array = new int[size];
        return array;
    }

}
