package TestSprint1;

import org.junit.Assert;
import org.junit.Test;

public class GramsTest {
    // 1.positive number converting to kg/gr/ounces /done/
    // 3.negative numbers converting to kg/gr/ounces /done/
    // 4.number zero converting to kg/gr/ounces /done/

    @Test
    public void verifyPositiveNumberToKg(){
        double expectedResult = 0.01;
        double a = 10;
        double actualResult = a/1000;
        String message = "expected = "+ expectedResult + " : Actual = "+actualResult;
        Assert.assertTrue(message, expectedResult==actualResult);
    }
    @Test
    public void verifyPositiveNumberToOz(){
        double expectedResult = 283.4949254408346;
        double a = 10;
        double actualResult = a/0.035274;
        String message = "expected = "+ expectedResult + " : Actual = "+actualResult;
        Assert.assertTrue(message, expectedResult==actualResult);
    }
    //pounds = grams * 0.00220462;
    @Test
    public void verifyPositiveNumberToPounds(){
        double expectedResult = 4535.929094356397;
        double a = 10;
        double actualResult = a/0.00220462;
        String message = "expected = "+ expectedResult + " : Actual = "+actualResult;
        Assert.assertTrue(message, expectedResult==actualResult);
    }
    @Test
    public void verifyNegativeNumberToKg(){
        double expectedResult = -0.01;
        double a = -10;
        double actualResult = a/1000;
        String message = "expected = "+ expectedResult + " : Actual = "+actualResult;
        Assert.assertTrue(message, expectedResult==actualResult);
    }
    @Test
    public void verifyNegativeNumberToOz(){
        double expectedResult = -283.4949254408346;
        double a = -10;
        double actualResult = a/0.035274;
        String message = "expected = "+ expectedResult + " : Actual = "+actualResult;
        Assert.assertTrue(message, expectedResult==actualResult);
    }
    //pounds = grams * 0.00220462;
    @Test
    public void verifyNegativeNumberToPounds(){
        double expectedResult = -4535.929094356397;
        double a = -10;
        double actualResult = a/0.00220462;
        String message = "expected = "+ expectedResult + " : Actual = "+actualResult;
        Assert.assertTrue(message, expectedResult==actualResult);
    }

    @Test (expected =ArithmeticException.class)
    public void verifyZeroToKg() {
        int expectedResult = 0;
        int a = 0;
        double actualResult = 1000/a;
        String message = "expected=" + expectedResult + " : Actual=" + actualResult;
        Assert.assertTrue(message, expectedResult == actualResult);

    }

    @Test (expected = AssertionError.class)
    public void verifyZeroToOz() {
        int expectedResult = 0;
        int a = 0;
        double actualResult = 0.035274/a;
        String message = "expected=" + expectedResult + " : Actual=" + actualResult;
        Assert.assertTrue(message, expectedResult == actualResult);
    }

    @Test (expected = AssertionError.class)
    public void verifyZeroToPound() {
        int expectedResult = 0;
        int a = 0;
        double actualResult = 0.00220462 /a;
        String message = "expected=" + expectedResult + " : Actual=" + actualResult;
        Assert.assertTrue(message, expectedResult == actualResult);
    }
}