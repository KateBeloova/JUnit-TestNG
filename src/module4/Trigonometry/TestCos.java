package module4.Trigonometry;

import module4.BaseCalculatorTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class TestCos extends BaseCalculatorTest {

    @Test()
    public void cos0() {
        System.out.println("cos0");
        double result = calculator.cos(0);
        assertEquals(result, 1.0);
    }

    @Test()
    public void cos90() {
        System.out.println("cos90");
        double result = (calculator.cos(Math.PI / 2));
        assertEquals(result, 0.0);
    }

    @Test()
    public void cosMinus90() {
        System.out.println("cos-90");
        double result = calculator.cos((-Math.PI / 2));
        assertEquals(result, 0.0);
    }

}
