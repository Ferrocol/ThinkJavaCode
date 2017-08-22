public class BottlesOfBeerSong {

  public static void main(String[] args) {
    sing(99);
  }

  public static void sing(int bottles) {
    if (bottles == 0) {
      System.out.println("No bottles of beer on the wall,");
      System.out.println("no bottles of beer,");
      System.out.println("ya' can't take one down, ya' can't pass it around");
      System.out.println("'cause there are no more bottles of beer on the wall!");
    } else if (bottles == 1) {
      System.out.println(bottles + " bottle of beer on the wall,");
      System.out.println(bottles + " bottle of beer,");
      System.out.println("ya' take it down, ya' pass it around,");
      System.out.println("no bottles of beer on the wall.");
      System.out.println();
      sing(bottles - 1);
    } else {
      System.out.println(bottles + " bottles of beer on the wall,");
      System.out.println(bottles + " bottles of beer,");
      System.out.println("ya' take one down, ya' pass it around,");
      System.out.println(bottles - 1 + " bottles of beer on the wall.");
      System.out.println();
      sing(bottles - 1);
    }
  }
}
