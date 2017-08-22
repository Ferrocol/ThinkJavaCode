public class Ex2 {

  public static void main(String[] args) {
    isDivisible(6, 2);
  }

  public static boolean isDivisible(int n, int m) {
    /*
    boolean result = (n % m == 0);
    System.out.println(result);
    return result;
    */
    return n % m == 0;
  }
}
