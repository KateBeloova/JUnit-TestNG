package module4;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class TestPow extends BaseCalculatorTest{

    @Test(dataProvider = "powDP", groups = "a")
    public void testPow(double arg1, double arg2, double expected) {
        double result = calculator.pow(arg1, arg2);
        Assert.assertEquals(result, expected);
    }

    @DataProvider(name = "powDP")
    public Object[][] powDP() {
        return new Object[][]{
                {2,0,1},
                {2,4.5,16},
                {2,-2,0.25}
        };
    }


    @Test(dataProvider = "powDPdouble")
    public void testSum(double arg1, double arg2, double expected) {
        double result = calculator.pow(arg1, arg2);
        Assert.assertEquals(result, expected);
    }

    @DataProvider(name = "powDPdouble")
    public Object[][] powDPdouble() {
        return new Object[][]{
                {1.5, 2.8, 2.25},
                {0.0, 0.0, 1.0},
                {2.5, -1.0, 0.4},
                {-1.1, -0.8, -0.9},

        };
    }
}
