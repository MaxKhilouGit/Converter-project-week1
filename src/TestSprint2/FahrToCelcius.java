package TestSprint2;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.runners.Parameterized;
import sprint2.main.FahrenheitToCelsius;

@RunWith(Parameterized.class)
public class FahrToCelcius extends BaseTest {
    double a, expectedResult; //declared at Class level

    FahrenheitToCelsius ftoC = new FahrenheitToCelsius(a);

    @Test
    public void verifyPositiveTemp_Case1() {
        double expectedResult = 35.27777777777778;
        double a = 95.5;
        double actualResult = ftoC.FToC(a);
        String message = "expected = " + expectedResult + " : Actual = " + actualResult;
        Assert.assertTrue(message, expectedResult == actualResult);
    }
    @Test
    public void verifyNegativeTemp_Case2() {
        double expectedResult = -37.5;
        double a = -35.5;
        double actualResult = ftoC.FToC(a);
        String message = "expected = " + expectedResult + " : Actual = " + actualResult;
        Assert.assertTrue(message, expectedResult == actualResult);
    }
    @Test
    public void verifyZeroDegreeTemp_Case3(){
        double expectedResult = -17.77777777777778;
        double a = 0;
        double actualResult = ftoC.FToC(a);
        String message = "expected = " + expectedResult + " : Actual = " + actualResult;
        Assert.assertTrue(message, expectedResult == actualResult);
    }
    //Constructor
//    public FahrToCelcius(int num1, int expResult){
//        this.expectedResult = expResult;
//        this.a = num1;
//    }

    //Test Case
//    FahrenheitToCelsius fToC = new FahrenheitToCelsius(a);
//    @Test
//    public void verifyFahrToCelciusFunctionality(){
//        double actualResult = fToC.FToC(a);
//        String message = "Expected: " + expectedResult + "; Actual: " + actualResult;
//        Assert.assertEquals(message, expectedResult, actualResult);
//    }

//    @Parameterized.Parameters
//    public static Double[] supplyData() {
//        Double data[] = { 95.5, -35.5, 0.0 };
//        return data;
//    }




}
