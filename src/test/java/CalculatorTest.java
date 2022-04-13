import calculator.Calculator;
import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorTest {
    private static final double DELTA = 1e-15;
    Calculator meracalculator = new Calculator();

    @Test
    public void factorialTruePositive(){
        assertEquals("Calculating factorial of a number for True Positive", 120, meracalculator.calculatefact(5), DELTA);
        assertEquals("Calculating factorial of a number for True Positive", 720, meracalculator.calculatefact(6), DELTA);
    }

    @Test
    public void factorialFalsePositive(){
        assertNotEquals("Calculating factorial of a number for False Positive", 120, meracalculator.calculatefact(4), DELTA);
        assertNotEquals("Calculating factorial of a number for False Positive", 24, meracalculator.calculatefact(3), DELTA);
    }

    @Test
    public void powerTruePositive(){
        assertEquals("Calculating power for True Positive", 16, meracalculator.calculatepower(2, 4), DELTA);
        assertEquals("Calculating power for True Positive", 64, meracalculator.calculatepower(4, 3), DELTA);
    }

    @Test
    public void powerFalsePositive(){
        assertNotEquals("Calculating power for False Positive", 60, meracalculator.calculatepower(2, 2), DELTA);
        assertNotEquals("Calculating power for False Positive", -7.69, meracalculator.calculatepower(2, 3), DELTA);
    }

    @Test
    public void logTruePositive(){
        assertEquals("Calculating natural log for True Positive", 0, meracalculator.calculatenaturalLog(1), DELTA);
        assertEquals("Calculating natural log for True Positive", 0, meracalculator.calculatenaturalLog(1), DELTA);
    }

    @Test
    public void logFalsePositive(){
        assertNotEquals("Calculating natural log for False Positive", 6, meracalculator.calculatenaturalLog(2.4), DELTA);
        assertNotEquals("Calculating natural log for False Positive", 7.3, meracalculator.calculatenaturalLog(2.1), DELTA);
    }

    @Test
    public void sqrootTruePositive(){
        assertEquals("Calculating square root for True Positive", 5, meracalculator.calculatesqroot(25), DELTA);
        assertEquals("Calculating square root for True Positive", 10, meracalculator.calculatesqroot(100), DELTA);
    }

    @Test
    public void sqrootFalsePositive(){
        assertNotEquals("Calculating square root for False Positive", 1, meracalculator.calculatesqroot(3), DELTA);
        assertNotEquals("Calculating square root for False Positive", 0, meracalculator.calculatesqroot(4), DELTA);

    }


}