package module4.Trigonometry;


import module4.BaseCalculatorTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestTg extends BaseCalculatorTest{

    @Test()
    public void tg0() {
        double result = calculator.tg(Math.PI / 3);
        assertEquals(result, 0.57);
    }

    @Test()
    public void tg45() {
        System.out.println("tg45");
        double result = (calculator.tg(Math.PI / 4));
        assertEquals(result, 1.0);
    }

    @Test()
    public void tgMinus90() {
        System.out.println("tg-90");
        double result = calculator.tg((-Math.PI));
        assertEquals(result, 0.0);
    }


}
