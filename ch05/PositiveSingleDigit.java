public class PositiveSingleDigit {

  public static void main(String[] args) {
    checkIfPositiveSingleDigit(5);
  }

  public static void checkIfPositiveSingleDigit(int x) {
    if (x > 0 && x < 10) {
      System.out.println("positive single digit number.");
    }
  }
}
