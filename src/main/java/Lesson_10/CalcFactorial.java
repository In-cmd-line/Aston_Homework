package Lesson_10;

import java.math.BigInteger;

public class CalcFactorial {
    public static BigInteger factorial(int n) {
        BigInteger fact = BigInteger.ONE;
        if (n < 0) {
            throw new IllegalArgumentException();
        }
        try {
            for (int i = 1; i <= n; i++) {
                fact = fact.multiply(BigInteger.valueOf(i));
            }
            return fact;
        } catch (IllegalArgumentException e) {
            return fact;
        }
    }
}
