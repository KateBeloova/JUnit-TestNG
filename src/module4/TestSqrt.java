package module4;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class TestSqrt extends BaseCalculatorTest {

    @Test(dataProvider = "sqrtDP", groups = "a")
    public void testPow(double arg1, double expected) {
        double result = calculator.sqrt(arg1);
        Assert.assertEquals(result, expected);
    }

    @DataProvider(name = "sqrtDP")
    public Object[][] powDP() {
        return new Object[][]{
                {4,2},
                {0,0},
                {-2,4}
        };
    }

    @Test(dataProvider = "sqrtDPdouble", groups = "b")
    public void testSum(double arg1, double expected) {
        double result = calculator.sqrt(arg1);
        Assert.assertEquals(result, expected);
    }

    @DataProvider(name = "sqrtDPdouble")
    public Object[][] sqrtDPdouble() {
        return new Object[][]{
                {5.0, 2.23},
                {0.0, 0.0},
                {-2.5, 1.58},

        };
    }
}
