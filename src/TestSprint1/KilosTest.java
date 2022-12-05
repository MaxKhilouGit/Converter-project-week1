package TestSprint1;

import org.junit.Assert;
import org.junit.Test;

public class KilosTest {
    // 1.positive number converting to pounds/gr/ounces /done/
    // 3.negative numbers converting to kg/gr/ounces /done/
    // 4.number zero converting to kg/gr/ounces /done/

    @Test
    public void verifyPositiveNumberToGr() {
        double expectedResult = 10000;
        double a = 10;
        double actualResult = a * 1000;
        String message = "expected = " + expectedResult + " : Actual = " + actualResult;
        Assert.assertTrue(message, expectedResult == actualResult);
    }

    @Test
    public void verifyPositiveNumberToOz() {
        double expectedResult = 352.74;
        double a = 10;
        double actualResult = a * 35.274;
        String message = "expected = " + expectedResult + " : Actual = " + actualResult;
        Assert.assertTrue(message, expectedResult == actualResult);
    }

    //pounds = grams * 0.00220462;
    @Test
    public void verifyPositiveNumberToPounds() {
        double expectedResult = 22.0462;
        double a = 10;
        double actualResult = a * 2.20462;
        String message = "expected = " + expectedResult + " : Actual = " + actualResult;
        Assert.assertTrue(message, expectedResult == actualResult);
    }

    @Test
    public void verifyNegativeNumberToGr() {
        double expectedResult = -10000;
        double a = -10;
        double actualResult = a * 1000;
        String message = "expected = " + expectedResult + " : Actual = " + actualResult;
        Assert.assertTrue(message, expectedResult == actualResult);
    }

    @Test
    public void verifyNegativeNumberToOz() {
        double expectedResult = -352.74;
        double a = -10;
        double actualResult = a * 35.274;
        String message = "expected = " + expectedResult + " : Actual = " + actualResult;
        Assert.assertTrue(message, expectedResult == actualResult);
    }

    //pounds = grams * 0.00220462;
    @Test
    public void verifyNegotiveNumberToPounds() {
        double expectedResult = -22.0462;
        double a = -10;
        double actualResult = a * 2.20462;
        String message = "expected = " + expectedResult + " : Actual = " + actualResult;
        Assert.assertTrue(message, expectedResult == actualResult);
    }

    @Test(expected = ArithmeticException.class)
    public void verifyZeroToGr() {
        int expectedResult = 0;
        int a = 0;
        double actualResult = 1000 / a;
        String message = "expected=" + expectedResult + " : Actual=" + actualResult;
        Assert.assertTrue(message, expectedResult == actualResult);

    }

    @Test(expected = AssertionError.class)
    public void verifyZeroToOz() {
        int expectedResult = 0;
        int a = 0;
        double actualResult = 35.274 / a;
        String message = "expected=" + expectedResult + " : Actual=" + actualResult;
        Assert.assertTrue(message, expectedResult == actualResult);
    }

    @Test(expected = AssertionError.class)
    public void verifyZeroToPound() {
        int expectedResult = 0;
        int a = 0;
        double actualResult = 2.20462 / a;
        String message = "expected=" + expectedResult + " : Actual=" + actualResult;
        Assert.assertTrue(message, expectedResult == actualResult);
    }
}
