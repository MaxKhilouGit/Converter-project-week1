package Test;

import org.junit.Assert;
import org.junit.Test;

public class OuncesTest {
    // 1.positive number converting to kg/gr/pounds /done/
    // 3.negative numbers converting to kg/gr/pounds /done/
    // 4.number zero converting to kg/gr/pounds /done/

    @Test
    public void verifyPositiveNumberToKg(){
        double expectedResult = 0.283495;
        double a = 10;
        double actualResult = a*0.0283495;
        String message = "expected = "+ expectedResult + " : Actual = "+actualResult;
        Assert.assertTrue(message, expectedResult==actualResult);
    }
    @Test
    public void verifyPositiveNumberToGr(){
        double expectedResult = 283.49519999999995;
        double a = 10;
        double actualResult = a*28.34952;
        String message = "expected = "+ expectedResult + " : Actual = "+actualResult;
        Assert.assertTrue(message, expectedResult==actualResult);
    }
    //pounds = grams * 0.00220462;
    @Test
    public void verifyPositiveNumberToPounds(){
        double expectedResult = 0.625;
        double a = 10;
        double actualResult = a*0.0625;
        String message = "expected = "+ expectedResult + " : Actual = "+actualResult;
        Assert.assertTrue(message, expectedResult==actualResult);
    }
    @Test
    public void verifyNegativeNumberToKg(){
        double expectedResult = -0.283495;
        double a = -10;
        double actualResult = a*0.0283495;
        String message = "expected = "+ expectedResult + " : Actual = "+actualResult;
        Assert.assertTrue(message, expectedResult==actualResult);
    }
    @Test
    public void verifyNegativeNumberToGr(){
        double expectedResult = -283.49519999999995;
        double a = -10;
        double actualResult = a*28.34952;
        String message = "expected = "+ expectedResult + " : Actual = "+actualResult;
        Assert.assertTrue(message, expectedResult==actualResult);
    }
    //pounds = grams * 0.00220462;
    @Test
    public void verifyNegativeNumberToPounds(){
        double expectedResult = -0.625;
        double a = -10;
        double actualResult = a*0.0625;
        String message = "expected = "+ expectedResult + " : Actual = "+actualResult;
        Assert.assertTrue(message, expectedResult==actualResult);
    }

    @Test (expected = AssertionError.class)
    public void verifyZeroToKg() {
        int expectedResult = 0;
        int a = 0;
        double actualResult = 0.0283495/a;
        String message = "expected=" + expectedResult + " : Actual=" + actualResult;
        Assert.assertTrue(message, expectedResult == actualResult);
    }

    @Test (expected = AssertionError.class)
    public void verifyZeroToGr() {
        int expectedResult = 0;
        int a = 0;
        double actualResult = 28.34952/a;
        String message = "expected=" + expectedResult + " : Actual=" + actualResult;
        Assert.assertTrue(message, expectedResult == actualResult);
    }

    @Test (expected = AssertionError.class)
    public void verifyZeroToPound() {
        int expectedResult = 0;
        int a = 0;
        double actualResult = 0.0625 /a;
        String message = "expected=" + expectedResult + " : Actual=" + actualResult;
        Assert.assertTrue(message, expectedResult == actualResult);
    }
}
