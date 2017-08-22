public class Date {

  public static void main(String[] args) {
    String day = "Monday";
    int date = 14;
    String month = "August";
    int year = 2017;
    printAmerican(day, date, month, year);
    printEuropean(day, date, month, year);
  }

  public static void printAmerican(String day, int date, String month, int year) {
    System.out.print("Today's date (American format) is: ");
    System.out.println(day + ", " + month + " " + date + ", " + year);
  }

  public static void printEuropean(String day, int date, String month, int year) {
    System.out.print("Today's date (European format) is: ");
    System.out.println(day + " " + date + " " + month + " " + year);
  }

}
