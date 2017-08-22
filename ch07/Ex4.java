public class Ex4 {

  public static void main(String[] args) {
    factorial(10);
  }

  public static void factorial(int x) {
    int result = 1;
    for (int i = x; i > 0; i--) {
      result = result * i;
    }
    System.out.println(x + "! = " + result);
  }
}
