package sprint2.main;

import java.text.DecimalFormat;

public class FahrenheitToKelvin {
    double result;
    DecimalFormat df = new DecimalFormat("##.##");
    String formatDouble;

    public FahrenheitToKelvin(double num1){
        result = Double.parseDouble(FToK(num1));
    }

    public String FToK(double num1){
        result = (num1 - 32) * 5 / 9 + 273.15;
        formatDouble = df.format(result);
        return formatDouble;

    }
}
