import org.calculator.Calculation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class CalculationTest {
//    у  моего калькулятора тип возвращаемого значения double, отсюда и числа беру десятичные
//    в методе Calculation  сделал округление до двух знаков после запятой, чтобы не было больших значений
    private static Calculation calculation;

    @BeforeAll
    public static void init() {
        calculation = new Calculation();
    }

    @Test
    @DisplayName("Test add 6 and 1.4")
    public void addTest() {
        double expectedResult = 7.4;
        double actualResult = calculation.add(6, 1.4);
        Assertions.assertEquals(expectedResult, actualResult);

//        ну либо я мог бы сократить до одной строки
//        Assertions.assertEquals(7.4, calculation.add(6, 1.4));
//        но буду придерживаться пока развёрнутого варианта во всех тестах
    }

    @Test
    @DisplayName("Test subtract 10 and 1.4")
    public void subtractTest() {
        double expectedResult = 8.6;
        double actualResult = calculation.subtract(10, 1.4);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("Test multiply 3.8 and 4.2")
    public void multiplyTest() {
        double expectedResult = 15.96;
        double actualResult = calculation.multiply(3.8, 4.2);
        Assertions.assertEquals(expectedResult, actualResult);

//        или можно было бы использовать assertTrue, просто потому что я могу,
//        хоть для  калькуляьтора всё же assertEquals выглядет лучше
//        Assertions.assertTrue(expectedResult == actualResult);
    }

    @ParameterizedTest
    @DisplayName("Divide parameterized test")
    @MethodSource("doubleStreamProvider")
    public void divideTestWithParams(double a, double b, double expectedResult) {
        double actualResult = calculation.divide(a, b);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    private static Stream<Arguments> doubleStreamProvider() {
        return Stream.of(
                Arguments.arguments(6, 3.3, 1.82),
                Arguments.arguments(8, 2, 4),
                Arguments.arguments(2.4, 2, 1.2)
        );
    }
}
