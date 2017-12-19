package module4.Trigonometry;


import module4.BaseCalculatorTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestCtg extends BaseCalculatorTest {

    @Test()
    public void Ctg90() {
        System.out.println("Ctg90");
        double result = (calculator.ctg(Math.PI / 2));
        assertEquals(result, 1.0);
    }

    @Test()
    public void CtgMinus90() {
        System.out.println("Ctg-90");
        double result = calculator.ctg((-Math.PI / 2));
        assertEquals(result, -1.0);
    }


}
