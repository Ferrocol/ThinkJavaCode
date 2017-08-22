public class Ex2 {

  public static void main(String[] args) {
    squareRoot(25.0);
  }

  public static void squareRoot(double x) {
    double root = x / 2;
    while (Math.abs(root - Math.sqrt(x)) > 0.0001) {
      root = (root + x / root) / 2;
    }
    System.out.println(root);
  }
}
