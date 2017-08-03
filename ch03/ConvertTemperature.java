import java.util.Scanner;

public class ConvertTemperature {

  public static void main(String[] args){
    double celsius, fahrenheit;
    Scanner in = new Scanner(System.in);

    System.out.print("What is the temperature in degrees Celsius? ");
    celsius = in.nextDouble();

    fahrenheit = celsius * 9 / 5 + 32;
    System.out.printf("%.1f C = %.1f F", celsius, fahrenheit);
  }
}
