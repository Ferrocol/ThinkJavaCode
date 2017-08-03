import java.util.Scanner;
import java.util.Random;

public class GuessMyNumber{

  public static void main(String[] args){
    int guessNumber, randomNumber, difference;
    Scanner in = new Scanner(System.in);
    Random random = new Random();

    System.out.print("I'm thinking of a number between 1 and 100, inclusive. ");
    System.out.println("Can you guess what it is?");
    System.out.print("Type a number: ");
    guessNumber = in.nextInt();
    System.out.printf("Your guess is: %d\n", guessNumber);
    randomNumber = random.nextInt(100) + 1;
    System.out.printf("The number I was thinking of is: %d\n", randomNumber);
    difference = guessNumber - randomNumber;
    System.out.printf("You were off by: %d", difference);
  }
}
