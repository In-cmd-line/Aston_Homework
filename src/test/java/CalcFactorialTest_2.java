import Lesson_10.CalcFactorial;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.math.BigInteger;


public class CalcFactorialTest_2 {
    @Test
    public void positiveSimple() {
        Assert.assertEquals(new BigInteger("120"), CalcFactorial.factorial(5));
        System.out.println("-----------------------\n" +
                "Testing input data: 5\nStatus: well done" +
                "\n-----------------------");
    }

    @Test
    public void positiveZero() {
        Assert.assertEquals(new BigInteger("1"), CalcFactorial.factorial(0));
        System.out.println("-----------------------\n" +
                "Testing input data: 0\nStatus: well done" +
                "\n-----------------------");
    }

    @Test
    public void positiveHundred() {
        Assert.assertEquals(new BigInteger("93326215443944152681699238856266700490715968264381621468592963" +
                "8952175999932299156089414639761565182862536979208272237582511852109168640000000000" +
                "00000000000000"), CalcFactorial.factorial(100));
        System.out.println("-----------------------\n" +
                "Testing input data: 100\nStatus: well done" +
                "\n-----------------------");
    }

    @Test
    public void negative() {
        Assert.assertThrows(ArithmeticException.class, () -> CalcFactorial.factorial(-1));
        System.out.println("-----------------------\n" +
                "Testing input data: -1\nStatus: well done" +
                "\n-----------------------");
    }

}
