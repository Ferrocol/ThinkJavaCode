public class Ex3 {

  public static void main(String[] args) {
    isTriangle(3, 4, 5);
  }

  public static boolean isTriangle(double a, double b, double c) {
    /*
    boolean result = (a + b > c && a + c > b && b + c > a);
    System.out.println(result);
    return result;
    */
    return (a + b > c && a + c > b && b + c > a);
  }
}
