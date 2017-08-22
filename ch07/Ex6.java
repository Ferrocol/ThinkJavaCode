public class Ex6 {

  public static void main(String[] args) {
    System.out.println(gauss(3, 100));
  }

  public static double gauss(double exponent, double terms) {
    double result = 1;
    double numerator = 1;
    double denominator = 1;
    for (double i = 1; i < terms; i++) {
      numerator = numerator * (-1) * exponent * exponent;
      denominator = denominator * i;
      result += numerator / denominator;
    }
    return result;
  }
}
