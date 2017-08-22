public class Ex9 {

  public static void main(String[] args) {
    System.out.println(power(2, 3));
  }

  public static double power(double x, int n) {
    if (n == 0) {
      return 1;
    } else if (n % 2 == 0) {
      return Math.pow(power(x, n/2), 2);
    } else {
      return x * power(x, n-1);
    }
  }
}
