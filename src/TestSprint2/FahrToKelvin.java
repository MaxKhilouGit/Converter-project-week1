package TestSprint2;
import groups.JoshTests;
import groups.SmokeTest;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runners.Parameterized;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;

@RunWith(Parameterized.class)
public class FahrToKelvin extends BaseTest {
    double a, expectedResult;

//    FahrenheitToKelvin fToK = new FahrenheitToKelvin(a);
    public FahrToKelvin(double a, double expdResult){
        this.expectedResult = expdResult;
        this.a = a;
    }

    @Category({ SmokeTest.class, JoshTests.class })
    @Test
    public void verifyFahrToKelvinFunctionality(){
        double actualResult = Double.parseDouble(fToK.FToK(a));
        String message = "Expected: " + expectedResult + "; Actual: " + actualResult;
        Assert.assertTrue(message, expectedResult == actualResult);
    }

    @Parameterized.Parameters(name = "Converting {0} Fahrenheit and expecting {1} Kelvin.")
    public static Double[][] supplyData(){
        Double data[][] = {
                {95.5, 308.43},
                {-35.5, 235.65},
                {0.0, 255.37}
        };
        return data;
    }

//    @Test
//    public void verifyPositiveTemp_Case1() {
//        double expectedResult = 308.43;
//        double a = 95.5;
//        double actualResult = Double.parseDouble(fToK.FToK(a));
//        String message = "Expected: " + expectedResult + "; Actual: " + actualResult;
//        Assert.assertTrue(message, expectedResult == actualResult);
//    }
//    @Test
//    public void verifyNegativeTemp_Case2(){
//        double expectedResult = 235.65;
//        double a = -35.5;
//        double actualResult = Double.parseDouble(fToK.FToK(a));
//        String message = "Expected: " + expectedResult + "; Actual: " + actualResult;
//        Assert.assertTrue(message, expectedResult == actualResult);
//    }
//    @Test
//    public void verifyZeroDegreeTemp_Case3(){
//        double expectedResult = 255.37;
//        double a = 0;
//        double actualResult = Double.parseDouble(fToK.FToK(a));
//        String message = "Expected: " + expectedResult + "; Actual: " + actualResult;
//        Assert.assertTrue(message, expectedResult == actualResult);
//    }

}
