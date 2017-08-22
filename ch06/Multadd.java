public class Multadd {

  public static void main(String[] args) {
    /* simple parameters
    double a1 = 1.0;
    double b1 = 2.0;
    double c1 = 3.0;
    System.out.println(multadd(a1, b1, c1));
    */
    /* sin(pi/4) + 1/2 cos(pi/4)
    double a2 = 0.5;
    double b2 = Math.cos(Math.PI/4.0);
    double c2 = Math.sin(Math.PI/4.0);
    System.out.println(multadd(a2, b2, c2));
    */
    // log10 + log20
    double a3 = 1.0;
    double b3 = Math.log10(10);
    double c3 = Math.log10(20);
    System.out.println(multadd(a3, b3, c3));

    System.out.println(expSum(2));
  }

  public static double multadd(double a, double b, double c) {
    return a * b + c;
  }

  public static double expSum(double x) {
    double a4 = x;
    double b4 = Math.exp(-x);
    double c4 = Math.sqrt(1 - Math.exp(-x));
    return multadd(a4, b4, c4);
  }
}
