import java.util.Arrays;
import java.util.Random;

public class Ex1 {

  public static void main(String[] args) {
    double[] values = {1.0, 2.0, 3.0, 4.0, 5.0};
    System.out.print("Original array: ");
    System.out.println(Arrays.toString(values));
    powArray(values, 2);
    int[] scores = createScoresArray(100);
    histogram(scores);
  }

  public static void powArray(double[] array, int power) {
    double[] newArray = Arrays.copyOf(array, array.length);
    for (int i = 1; i < array.length; i++) {
      newArray[i] = Math.pow(array[i], power);
    }
    System.out.print("Original array to the power of " + power + ": ");
    System.out.println(Arrays.toString(newArray));
  }

  public static int[] createScoresArray(int size) {
    Random randomScore = new Random();
    int[] randomArray = new int[size];
    for (int i = 0; i < randomArray.length; i++) {
      randomArray[i] = randomScore.nextInt(100);
    }
    System.out.print(size + " random scores: ");
    System.out.println(Arrays.toString(randomArray));
    return randomArray;
  }

  public static void histogram(int[] scores) {
    System.out.print("Distribution of scores: ");
    int[] scoreDistribution = new int[scores.length];
    for (int score : scores) {
      scoreDistribution[score]++;
    }
    System.out.println(Arrays.toString(scoreDistribution));
  }
}
