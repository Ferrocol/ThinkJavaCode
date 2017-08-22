/**
 * Fruit exercise.
 */
public class Fruit {

    public static int banana(int[] a) { // defines a function "banana," which takes the argument integer array "a" and returns an integer
        int kiwi = 1; // defines an integer "kiwi" and sets it equal to 1
        int i = 0; // defines a new integer "i" and sets it equal to 0
        while (i < a.length) { // while "i" is less than the number of elements in "a"
            kiwi = kiwi * a[i]; // set "kiwi" equal to its existing value times the ith element in "a"
            i++; // increase i and repeat until the "while" condition is no longer satisified
        }
        return kiwi; // return the final integer value of "kiwi," which is all of the elements in "a" multiplied together
    }

    public static int grapefruit(int[] a, int grape) { // defines a function "grapefruit," which takes the arguments integer array "a" and integer "grape," and returns an integer
        for (int i = 0; i < a.length; i++) { // for integer "i" starting at 0, if "i" is less than the number of elements in "a," then iterate again
            if (a[i] == grape) { // if the current index is equal to the argument "grape"
                return i; // then return the current integer value of "i," which is the array index containing the matching value
            }
        }
        return -1; // otherwise, return "-1" to indicate the search method failed to find the argument "grape" in the provided array
    }

    public static int pineapple(int[] a, int apple) { // defines a function "pineapple," which takes the arguments integer array "a" and integer "apple," and returns an integer
        int pear = 0; // defines an integer "pear" and sets it equal to 0
        for (int pine: a) { // call each value of array "a" "pine"
            if (pine == apple) { // and if that current value, "pine," is equal to the provided integer "apple"
                pear++; // add 1 to "pear"
            }
        }
        return pear; // return the final value of "pear," which represents the number of times the integer "apple" occurs in the array "a"
    }

}
