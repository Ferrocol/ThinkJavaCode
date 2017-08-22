public class Ex8 {

  public static void main(String[] args) {
    int[] array = Ex4.createRandomArray(10);
    maxInRange(array, 3, 7);
  }

  public static void maxInRange(int[] array, int lowIndex, int highIndex) {
    if (lowIndex <= highIndex) {
      if (array[lowIndex] <= array[highIndex]) {
        int max = array[lowIndex];
        System.out.println(max);
        maxInRange(array, lowIndex + 1, highIndex);
      } else if (array[lowIndex] >= array[highIndex]) {
        int max = array[highIndex];
        System.out.println(max);
        maxInRange(array, lowIndex, highIndex - 1);
      }
    }
  }

}
