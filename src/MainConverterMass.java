import java.util.Scanner;
public class MainConverterMass {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int again = 0, uOption;
        System.out.println("Welcome to the Mass Converter by JavaLinks!");
        System.out.println("#########################");
        do {
            System.out.println("Enter measurement to convert: 1. pounds; 2. ounces; 3. kilograms; 4. grams");
            uOption = sc.nextInt();

            switch (uOption) {
                case 1:
                    poundsTo poundsTo = new poundsTo(sc);
                    System.out.println(poundsTo.result);
                    break;
                case 2:
                    ouncesTo ouncesTo = new ouncesTo(sc);
                    System.out.println(ouncesTo.result);
                    break;
                case 3:
                    kilosTo kilosTo = new kilosTo(sc);
                    System.out.println(kilosTo.result);
                    break;
                case 4:
                    gramsTo gramsTo = new gramsTo(sc);
                    System.out.println(gramsTo.result);
                    break;
            }
            System.out.println("Enter 1 to run program again: ");
            again = sc.nextInt();
            String decoy = sc.nextLine();
        }while(again == 1);
    }
}