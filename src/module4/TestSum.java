package module4;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class TestSum extends BaseCalculatorTest {

    @Test(dataProvider = "sumDP", groups = "a")
    public void testSum(long arg1, long arg2, long expected) {
        long result = calculator.sum(arg1, arg2);
        sleep(1);
        checkTime();
        Assert.assertEquals(result, expected);
    }

    @DataProvider(name = "sumDP")
    public Object[][] sumDP() {
        return new Object[][]{
                {1, 2, 3},
                {0, 0, 0},
                {2, -1, 1},
                {-1, -1, -2},

        };
    }

    public static void sleep(int sec) {
        try {
            Thread.sleep((long) (sec * 1000));
        } catch (InterruptedException var2) {
        }
    }

    @Test(dataProvider = "sumDPdouble", groups = "b")
    public void testSum(double arg1, double arg2, double expected) {
        double result = calculator.sum(arg1, arg2);
        sleep(1);
        checkTime();
        Assert.assertEquals(result, expected);
    }

    @DataProvider(name = "sumDPdouble")
    public Object[][] sumDPdouble() {
        return new Object[][]{
                {1.5, 2.8, 4.3},
                {0.0, 0.0, 0.0},
                {2.9, -1.0, 1.9},
                {-1.3, -1.5, -2.8},

        };
    }


}
