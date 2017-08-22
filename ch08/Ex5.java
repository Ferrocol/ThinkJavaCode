import java.util.Arrays;

public class Ex5 {

  public static void main(String[] args) {
    sieveOfEratosthenes(100);
  }

  public static boolean[] sieveOfEratosthenes(int limit) {
    int[] numbers = makeIntArray(limit);
    boolean[] primes = makeBooleanArray(limit);
    System.out.println("Prime numbers up to " + limit + " :");
    System.out.printf("%6d ", numbers[1]);
    System.out.println(primes[1]);
    for (int i = 2; i < limit; i++) {
      for (int j = 1; j < (limit - i); j++) {
        if (numbers[i + j] % i == 0) {
          primes[i + j] = false;
        }
      }
      System.out.printf("%6d ", (i + 1));
      System.out.println(primes[i]);
    }
    return primes;
  }

  public static int[] makeIntArray(int size) {
    int[] array = new int[size];
    for (int i = 0; i < array.length; i++) {
      array[i] = i + 1;
    }
    return array;
  }

  public static boolean[] makeBooleanArray(int size) {
    boolean[] array = new boolean[size];
    Arrays.fill(array, true);
    return array;
  }

}
