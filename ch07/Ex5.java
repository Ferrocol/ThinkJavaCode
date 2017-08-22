public class Ex5 {

  public static void main(String[] args) {
    check(-0.1);
    }

  public static void check(double x) {
    if (Math.abs(x) <= 100) {
      System.out.println(x + "\t" + myexp(x) + "\t" + eToTheX(x));
      x = x * 10;
      check(x);
    }
  }

  public static double myexp(double terms) {
    double exponent = 1;
    double result = 1;
    double multiplier = 1;
    for (double i = 1; i < terms; i++) {
      multiplier = multiplier * exponent;
      result += (multiplier / i);
    }
    return result;
  }

  public static double eToTheX(double exponent) {
    double equals = Math.exp(exponent);
    return equals;
  }
}
