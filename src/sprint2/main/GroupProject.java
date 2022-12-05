package sprint2.main;

import java.util.Scanner;

public class GroupProject {
    public static void main(String[] Strings) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input a degree in Fahrenheit: ");
        double fahrenheit = sc.nextDouble();

        double  celsius =(( 5 *(fahrenheit - 32.0)) / 9.0);
        System.out.println(fahrenheit + " degree in Fahrenheit is equal to " + celsius + " in Celsius");
    }
}
