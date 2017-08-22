import java.util.Arrays;
import java.util.Random;
public class Ex4 {

  public static void main(String[] args) {
    int[] randomArray = createRandomArray(10);
    System.out.print("The max value is located at index: ");
    System.out.println(indexOfMax(randomArray));
  }

  public static int[] createRandomArray(int length) {
    Random random = new Random();
    int[] randomArray = new int[length];
    for (int i = 0; i < randomArray.length; i++) {
      randomArray[i] = random.nextInt(100);
    }
    System.out.print("Random array created: ");
    System.out.println(Arrays.toString(randomArray));
    return randomArray;
  }

  public static int indexOfMax(int[] numbers) {
    int max = 0;
    int maxIndex = 0;
    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] > max) {
        max = numbers[i];
        maxIndex = i;
      }
    }
    return maxIndex;
  }

}
