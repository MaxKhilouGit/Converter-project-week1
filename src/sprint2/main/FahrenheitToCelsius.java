package sprint2.main;

import java.text.DecimalFormat;

public class FahrenheitToCelsius {
    double result;

    public FahrenheitToCelsius(double num1){
        result = FToC(num1); //Temp from mainClassTemperatureConverter as double passed to method FToC
    }

    public double FToC(double num1){
        result = (num1-32)*5/9;
        return result;
    }
}
