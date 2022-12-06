package sprint2.main;

import java.text.DecimalFormat;

public class FahrenheitToCelsius {
    double result;
    DecimalFormat df = new DecimalFormat("##.##");
    String formatDouble;

    public FahrenheitToCelsius(double num1){
        result = Double.parseDouble(FToC(num1)); //Temp from mainClassTemperatureConverter as double passed to method FToC
    }

    public String FToC(double num1){
        result = (num1-32)*5/9;
        formatDouble = df.format(result);
        return formatDouble;
    }
}
