import java.util.Scanner;
public class ConverterMass {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int again = 0, uOption;
        Converter conv = new Converter();
        do {
            System.out.println("Enter measurement to convert: 1. pounds; 2. ounces; 3. kilograms; 4. grams");
            uOption = sc.nextInt();

            switch (uOption) {
                case 1:
                    Converter poundsTo = new Converter(sc);
                    System.out.println(poundsTo.result);
                    break;
                case 2:
                    Converter ouncesTo = new Converter(sc);
                    System.out.println(ouncesTo.result);
                    break;
                case 3:
                    Converter kilosTo = new Converter(sc);
                    System.out.println(kilosTo.result);
                    break;
                case 4:
                    Converter gramsTo = new Converter(sc);
                    System.out.println(gramsTo.result);
                    break;
            }
            System.out.println("Enter 1 to run program again: ");
            again = sc.nextInt();
            String decoy = sc.nextLine();
        }while(again == 1);
    }
}
    }
    public static double convertOzToGrams(double Ounce) {

        return (double) (Ounce * 28.34952);
    }

    public static double convertOzToKilo(double Ounce) {
        return (double) (Ounce * 0.0283495);
    }

    public static double convertOzToLb(double Ounce) {
        return (double) (Ounce * 0.0625);
    }
}

