import java.util.Scanner;

public class ConvertSecondToHourMinuteSecond {

  public static void main(String[] args){
    int totalSeconds, hours, minutes, seconds;
    Scanner in = new Scanner(System.in);

    System.out.print("How many seconds? ");
    totalSeconds = in.nextInt();

    hours = totalSeconds / 3600;
    minutes = (totalSeconds % 3600) / 60;
    seconds = (totalSeconds % 3600) % 60;
    System.out.printf("%d seconds = %d hours, %d minutes, and %d seconds",
                      totalSeconds, hours, minutes, seconds);
  }
}
