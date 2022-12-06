package sprint2.main;

import java.text.DecimalFormat;
import java.util.Scanner;

public class mainClassTemperatureConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("##.##");
        String formatDouble;
        double Fahrenheit=0;
        int KelvinOrCelsius;
        int again = 0;
        System.out.println("Welcome to the Temperature Converter by JavaLinks!");
        System.out.println("#########################");
        do {
            System.out.println("Enter Fahrenheit degree to convert into Kelvin or Celsius");
            Fahrenheit = sc.nextDouble();
            System.out.println("Now please enter \"1\" for Kelvin and \"2\" for Celsius:");
            KelvinOrCelsius = sc.nextInt();
            switch (KelvinOrCelsius){
                case 1:
                    FahrenheitToKelvin FK = new FahrenheitToKelvin(Fahrenheit);
                    formatDouble = df.format(FK.result);
                    System.out.println(Fahrenheit +" Fahrenheit is equal to "+formatDouble+" Celsius");
                    break;
                case 2:
                    FahrenheitToCelsius FC = new FahrenheitToCelsius(Fahrenheit);
                    formatDouble = df.format(FC.result);
                    System.out.println(Fahrenheit +" Fahrenheit is equal to "+formatDouble+" Celsius");
                    break;
            }
            System.out.println("Enter 1 to run program again: ");
            again = sc.nextInt();
            String decoy = sc.nextLine();
        }while(again == 1);

    }
}
