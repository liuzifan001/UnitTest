import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

/**
 * Created by LiuZifan on 2017/8/21.
 */
public class CalculatorTest {
    private static Calculator calculator = new Calculator();
    @Before
    public void setUp() throws Exception {
        calculator.clear();

    }

    @Test
    public void add() throws Exception {
        calculator.add(2);
        calculator.add(3);
        assertEquals(5,calculator.getResult());
    }

    @Test
    public void substract() throws Exception {
        calculator.add(10);
        calculator.substract(2);
        assertEquals(8, calculator.getResult());
    }

    @Ignore("Multiply() Not yet implemented")
    @Test
    public void multiply() throws Exception {

    }

    @Test
    public void divide() throws Exception {
        calculator.add(8);
        calculator.divide(2);
        assertEquals(4, calculator.getResult());
    }
    //测试运行超时
    @Test(timeout = 1000)
    public void squareRoot() {
        calculator.squareRoot(4);
        assertEquals(2, calculator.getResult());
    }
    //测试异常
    @Test(expected = ArithmeticException.class)
    public void divideByZero() {
        calculator.divide(1);
    }
}