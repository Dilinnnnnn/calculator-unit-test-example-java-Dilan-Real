package ec.edu.epn.calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    private Calculator calculator = null;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testSum() {
        int result = calculator.sum(2, 2);
        assertEquals(4, result);
    }

    @Test
    public void testMinus() {
        int result = calculator.minus(2, 1);
        assertEquals(1, result);
    }

    @Test
    public void testDivideSuccess() {
        int result = calculator.divide(4, 2);
        assertEquals(2, result);
    }

    @Test
    public void testMultiply() {
        int result = calculator.multiply(2, 3);
        assertEquals(6, result);
    }

    @Test
    public void testDivideFail() {
        assertThrows(ArithmeticException.class,
                () -> {
                    calculator.divide(4, 0);
                });
    }
}