public class Time {

  public static void main(String[] args) {
    double hourStart = 16.0;
    double minuteStart = 20.0;
    double secondStart = 25.0;
    System.out.print("Seconds since midnight: " );
    double secondsSinceMidnight = hourStart * 3600 + minuteStart * 60 + secondStart;
    System.out.println(secondsSinceMidnight);
    System.out.print("Seconds remaining in the day: ");
    double secondsRemainingInDay = 86400 - secondsSinceMidnight;
    System.out.println(secondsRemainingInDay);
    System.out.print("Percentage of the day that has passed: ");
    double percentageOfDayPassed = secondsSinceMidnight / 86400 * 100;
    System.out.println(percentageOfDayPassed);
    double hourEnd = 16.0;
    double minuteEnd = 50.0;
    double secondEnd = 11.0;
    System.out.print("Seconds elapsed since I started this exercise: ");
    double secondsSinceStart = (hourEnd * 3600 + minuteEnd * 60 + secondEnd) - secondsSinceMidnight;
    System.out.println(secondsSinceStart);
  }
}
