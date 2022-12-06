package TestSprint2;

import org.junit.After;
import org.junit.Before;
import org.junit.Assert;
import org.junit.Test;
import sprint2.main.FahrenheitToCelsius;
import sprint2.main.FahrenheitToKelvin;

public class BaseTest {
    double a;
    FahrenheitToKelvin fToK;
    @Before //activities before each test case
    public void setUp(){
         fToK = new FahrenheitToKelvin(a);
//        System.out.println("Before");
    }
    @After //activities after each test case
    public void cleanUp(){
        //clean up activity
//        System.out.println("After");
    }

}
