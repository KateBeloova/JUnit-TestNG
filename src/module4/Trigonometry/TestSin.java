package module4.Trigonometry;


import module4.BaseCalculatorTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestSin extends BaseCalculatorTest {

    @Test()
    public void sin0() {
        //System.out.println("sin0");
        double result = calculator.sin(0);
        assertEquals(result, 0.0);
    }

    @Test()
    public void sin90() {
        System.out.println("sin90");
        double result = (calculator.sin(Math.PI / 2));
        assertEquals(result, 1.0);
    }

    @Test()
    public void sinMinus90() {
        System.out.println("sin-90");
        double result = calculator.sin((-Math.PI / 2));
        assertEquals(result, -1.0);
    }
}
