import java.math.BigInteger;
import java.util.Scanner;

public class Big {

    public static void main(String[] args) {
        // int startNum = askUserForInteger();
        // int endNum = factorial(startNum);
        for (int i = 0; i <= 30; i ++) {
            factorial(i); // over ~15 these values get wonky because they get too big for the int data type
        } // I think BigInteger is mutable because I can construct a new BigInteger and set the attribute
    }

    public static BigInteger factorial(int x) {
        int result = 1;
        BigInteger bigResult = BigInteger.valueOf(result);
        for (int i = x; i > 0; i--) {
            BigInteger counter = BigInteger.valueOf(i);
            bigResult = bigResult.multiply(counter);
        }
        System.out.println(x + "! = " + bigResult);
        return bigResult;
    }
}
