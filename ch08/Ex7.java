import java.util.Arrays;

public class Ex7 {

  public static void main(String[] args) {
    int[] array = {4, 8, 12, 16, 20};
    isPrimeFactor(2, array);
  }

  public static boolean isPrimeFactor(int integer, int[] array) {
    boolean result = isPrime(integer) == true && isFactor(integer, array) == true;
    System.out.println("Therefore is " + integer + " a prime factor? " + result);
    return result;
  }

  public static boolean isPrime(int integer) {
    boolean[] primes = Ex5.sieveOfEratosthenes(integer);
    System.out.println("Is " + integer + " prime? " + primes[integer - 1]);
    if (primes[integer - 1]) {
      return true;
    } else {
      return false;
    }
  }

  public static boolean isFactor(int integer, int[] numbers) {
    System.out.print("Is " + integer + " a factor of ");
    System.out.print(Arrays.toString(numbers));
    System.out.print("? ");
    boolean factor = Ex6.isFactor(integer, numbers);
    return factor;
  }

}
