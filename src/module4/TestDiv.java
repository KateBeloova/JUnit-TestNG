package module4;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.junit.Assert.assertEquals;


public class TestDiv extends BaseCalculatorTest {

    @Test()
    public void testDiv() {
        long result = calculator.div(8,4);
        assertEquals(result, 2);
    }

    @Test()
    public void testDivNegative() {
        long result = calculator.div(-4,-2);
        assertEquals(result, 2);
    }

   /* @Test()
    public void testDivze() {
        long result = calculator.div(8,0);
        assertEquals(result, "Attempt to divide by zero");
    }*/


    @Test(dataProvider = "divDPdouble", groups = "b")
    public void testSum(double arg1, double arg2, double expected) {
        double result = calculator.div(arg1, arg2);
        Assert.assertEquals(result, expected);
    }

    @DataProvider(name = "divDPdouble")
    public Object[][] divDPdouble() {
        return new Object[][]{
                {6.9, 2.3, 3.0},
                {2.9, -1.0, -2.9},
                {-2.8, -1.4, 2.0},

        };
    }
}
