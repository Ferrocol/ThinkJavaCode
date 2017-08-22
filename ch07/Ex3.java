public class Ex3 {

  public static void main(String[] args) {
    power(2, 4);
  }

  public static void power(double number, int exponent) {
    double multiplier = number;
    for (int i = exponent - 1; i > 0; i--) {
      number = multiplier * number;
    }
    System.out.printf("%s to the %s power = ", multiplier, exponent);
    System.out.println(number);
  }
}
