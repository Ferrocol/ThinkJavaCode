import java.util.Scanner;
import java.util.Random;

public class GuessMyNumber{

  public static void main(String[] args){
    Random random = new Random();
    int randomNumber = random.nextInt(100) + 1;
    System.out.print("I'm thinking of a number between 1 and 100, inclusive. ");
    System.out.println("Can you guess what it is?");
    guessMyNumber(randomNumber);
  }

  public static void guessMyNumber(int randomNumber) {
    Scanner in = new Scanner(System.in);
    System.out.print("Type a number: ");
    int guessNumber = in.nextInt();
    System.out.printf("Your guess is: %d\n", guessNumber);
    checkDifference(guessNumber, randomNumber);
  }

  public static void checkDifference(int guessNumber, int randomNumber) {
    if (guessNumber > randomNumber) {
      System.out.println("Too high. Guess again!");
    } else if (guessNumber < randomNumber) {
      System.out.println("Too low. Guess again!");
    } else {
      System.out.println("Your guess was correct!");
      return;
    }
    guessMyNumber(randomNumber);
  }
}
