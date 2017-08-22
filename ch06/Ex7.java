public class Ex7 {

  public static void main(String[] args) {
    System.out.println(oddSum(5));
  }

  public static int oddSum(int n) {
    if (n == 1) {
      return n;
    } else if (n > 1 && (n % 2 == 1)) {
      return n + oddSum(n - 2);
    } else {
      return oddSum(Math.abs(n) - 1); // this doesn't work for negative numbers
                                      // but I can't return a string that says
                                      // to only provide a positive odd integer
    }
  }
}
