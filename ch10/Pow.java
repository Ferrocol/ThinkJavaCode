/**
 * BigInteger exercise.
 */
import java.math.BigInteger;

public class Pow {

    public static void main(String[] args) {
        System.out.println(pow(27, 13));
    }
    /**
     * Integer exponentiation.
     */
    public static BigInteger pow(int x, int n) {
        BigInteger one = BigInteger.valueOf(1);
        if (n == 0) return one;

        // find x to the n/2 recursively
        BigInteger bigX = BigInteger.valueOf(x);
        BigInteger t = pow(x, n / 2);

        // if n is even, the result is t squared
        // if n is odd, the result is t squared times x
        // if (n % 2 == 0) {
        //     return t * t;
        // } else {
        //     return t * t * x;
        // }

        if (n % 2 == 0) {
            return t.multiply(t);
        } else {
            return t.multiply(t.multiply(bigX));
        }
    }
}
