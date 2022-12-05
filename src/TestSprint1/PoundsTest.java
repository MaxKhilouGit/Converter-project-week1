package TestSprint1;

import org.junit.Assert;
import org.junit.Test;

public class PoundsTest {
    // 1.positive number converting to kg/gr/ounces /done/
    // 3.negative numbers converting to kg/gr/ounces /done/
    // 4.number zero converting to kg/gr/ounces /done/

    @Test
    public void verifyPositiveNumberToKg(){
        double expectedResult = 4.53592;
        double a = 10;
        double actualResult = a*0.453592;
        String message = "expected = "+ expectedResult + " : Actual = "+actualResult;
        Assert.assertTrue(message, expectedResult==actualResult);
    }
    @Test
    public void verifyPositiveNumberToGr(){
        double expectedResult = 4535.92;
        double a = 10;
        double actualResult = a*453.592;
        String message = "expected = "+ expectedResult + " : Actual = "+actualResult;
        Assert.assertTrue(message, expectedResult==actualResult);
    }
    //pounds = grams * 0.00220462;
    @Test
    public void verifyPositiveNumberToOz(){
        double expectedResult = 160;
        double a = 10;
        double actualResult = a*16.0;
        String message = "expected = "+ expectedResult + " : Actual = "+actualResult;
        Assert.assertTrue(message, expectedResult==actualResult);
    }
    @Test
    public void verifyNegativeNumberToKg(){
        double expectedResult = -4.53592;
        double a = -10;
        double actualResult = a*0.453592;
        String message = "expected = "+ expectedResult + " : Actual = "+actualResult;
        Assert.assertTrue(message, expectedResult==actualResult);
    }
    @Test
    public void verifyNegativeNumberToGr(){
        double expectedResult = -4535.92;
        double a = -10;
        double actualResult = a*453.592;
        String message = "expected = "+ expectedResult + " : Actual = "+actualResult;
        Assert.assertTrue(message, expectedResult==actualResult);
    }
    //pounds = grams * 0.00220462;
    @Test
    public void verifyNegativeNumberToOz(){
        double expectedResult = -160;
        double a = -10;
        double actualResult = a*16.0;
        String message = "expected = "+ expectedResult + " : Actual = "+actualResult;
        Assert.assertTrue(message, expectedResult==actualResult);
    }

    @Test (expected = AssertionError.class)
    public void verifyZeroToKg() {
        int expectedResult = 0;
        int a = 0;
        double actualResult = 0.453592/a;
        String message = "expected=" + expectedResult + " : Actual=" + actualResult;
        Assert.assertTrue(message, expectedResult == actualResult);
    }

    @Test (expected = AssertionError.class)
    public void verifyZeroToGr() {
        int expectedResult = 0;
        int a = 0;
        double actualResult = 453.592/a;
        String message = "expected=" + expectedResult + " : Actual=" + actualResult;
        Assert.assertTrue(message, expectedResult == actualResult);
    }

    @Test (expected = AssertionError.class)
    public void verifyZeroToOz() {
        int expectedResult = 0;
        int a = 0;
        double actualResult = 16.0 /a;
        String message = "expected=" + expectedResult + " : Actual=" + actualResult;
        Assert.assertTrue(message, expectedResult == actualResult);
    }
}
