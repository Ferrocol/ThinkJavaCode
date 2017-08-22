public class Ex6 {

  public static void main(String[] args) {
    int[] numbers = {3, 6, 9, 12, 15};
    isFactor(2, numbers);
  }

  public static boolean isFactor(int factor, int[] numbers) {
    boolean result = true;
    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] % factor != 0) {
        result = false;
      }
    }
    System.out.println(result);
    return result;
  }

}
