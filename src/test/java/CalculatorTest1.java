import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class CalculatorTest1 {
    private static Calculator calculator = new Calculator();
    private int param;
    private int result;

    @Parameterized.Parameters
    public static Collection data() {
        return Arrays.asList(new Object[][]{
                {2, 4},
                {0, 0},
                {-3, 9}
        });
    }
    public CalculatorTest1(int param,int result) {
        this.param = param;
        this.result = result;
    }

    @Test
    public void square() throws Exception {
        calculator.square(param);
        assertEquals(result,calculator.getResult());
    }
}