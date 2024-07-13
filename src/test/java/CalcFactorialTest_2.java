import Lesson_10.CalcFactorial;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.math.BigInteger;


public class CalcFactorialTest_2 {
    @Test(description = "Проверка позитивного значения (5)")
    public void positiveSimpleTest() {
        Assert.assertEquals(new BigInteger("120"), CalcFactorial.factorial(5));
    }

    @Test(description = "Проверка нуля")
    public void positiveZeroTest() {
        Assert.assertEquals(new BigInteger("1"), CalcFactorial.factorial(0));
    }

    @Test(description = "Проверка большого значения (100)")
    public void positiveHundredTest() {
        Assert.assertEquals(new BigInteger("93326215443944152681699238856266700490715968264381621468592963" +
                "8952175999932299156089414639761565182862536979208272237582511852109168640000000000" +
                "00000000000000"), CalcFactorial.factorial(100));
    }

    @Test(description = "Проверка отрицательного значения (-1)")
    public void negativeTest() {
        Assert.assertThrows(IllegalArgumentException.class, () -> CalcFactorial.factorial(-1));
    }
}