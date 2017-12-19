package module4;


import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestMult extends BaseCalculatorTest {

    @Test(dataProvider = "multDP", groups = "a")
    public void testMult(long arg1, long arg2, long expected) {
        long result = calculator.mult(arg1, arg2);
        Assert.assertEquals(result, expected);
    }

    @DataProvider(name = "multDP")
    public Object[][] multDP() {
        return new Object[][]{
                {2, 3, 6},
                {5, 0, 0},
                {0, 0, 0},
                {-4, 2, -8}
        };
    }

    @Test(dataProvider = "multDPdouble")
    public void testSum(double arg1, double arg2, double expected) {
        double result = calculator.mult(arg1, arg2);
        Assert.assertEquals(result, expected);
    }

    @DataProvider(name = "multDPdouble")
    public Object[][] multDPdouble() {
        return new Object[][]{
                {1.5, 2.3, 3.0},
                {0.0, 0.0, 0.0},
                {2.9, -1.0, -3.0},
                {-1.3, -1.5, 1.0},

        };
    }

}
