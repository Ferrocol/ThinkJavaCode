public class Ex4 {

  public static void main(String[] args) {
    checkFermat(2, 2, 2, 2);
  }

  public static void checkFermat(int a, int b, int c, int n) {
    boolean fermatTheorem = (Math.pow(a, n) + Math.pow(b, n) == Math.pow(c, n));
    if (n > 2 && fermatTheorem) {
      System.out.println("Holy smokes, Fermat was wrong!");
    } else if (!fermatTheorem) {
      System.out.println("No, that doesn't work.");
    }
  }
}
