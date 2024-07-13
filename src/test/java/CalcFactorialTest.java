import Lesson_10.CalcFactorial;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalcFactorialTest {

    @Test
    @DisplayName("Проверка позитивного значения (5)")
    public void positiveSimpleTest() {
        assertEquals(new BigInteger("120"), CalcFactorial.factorial(5));
    }

    @Test
    @DisplayName("Проверка нуля")
    public void positiveZeroTest() {
        assertEquals(new BigInteger("1"), CalcFactorial.factorial(0));
    }

    @Test
    @DisplayName("Проверка большого значения (100)")
    public void positiveHundredTest() {
        assertEquals(new BigInteger("93326215443944152681699238856266700490715968264381621468592963" +
                "8952175999932299156089414639761565182862536979208272237582511852109168640000000000" +
                "00000000000000"), CalcFactorial.factorial(100));
    }

    @Test
    @DisplayName("Проверка отрицательного значения (-1)")
    public void negativeTest() {
        assertThrows(IllegalArgumentException.class, () -> CalcFactorial.factorial(-1));
    }
}
