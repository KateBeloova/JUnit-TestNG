package module4;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class TestSub extends BaseCalculatorTest {

    @Test(dataProvider = "subDP", groups = "a")
    public void testSub(long arg1,long arg2, long expected){
        long result = calculator.sub(arg1,arg2);
        Assert.assertEquals(result,expected);
    }

    @DataProvider(name="subDP")
    public Object [][] sumDP(){
        return new Object[][]{
                {1,1,0},
                {-1,-1,-2}

        };

    }

    @Test(groups = "b")
    public void zeroMinusZero(){
        long result = calculator.sub(0, 0);
        assertEquals(result, 0);
    }

    @Test(dataProvider = "subDPdouble", groups = "b")
    public void testSum(double arg1, double arg2, double expected) {
        double result = calculator.sub(arg1, arg2);
        Assert.assertEquals(result, expected);
    }

    @DataProvider(name = "subDPdouble")
    public Object[][] subDPdouble() {
        return new Object[][]{
                {2.5, 2.0, 0.5},
                {0.0, 0.0, 0.0},
                {2.9, -1.0, 3.9},
                {-1.3, -1.5, 0.2},

        };
    }
}
