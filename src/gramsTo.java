import java.util.Scanner;
class gramsTo extends convert{
    gramsTo(Scanner sc){
        System.out.println("Enter measurement to convert it into: 1. pounds; 2. kilograms; 3. ounces");
        uOption = sc.nextInt();
        String decoy = sc.nextLine();
        System.out.println("Enter amount of grams:");
        grams = sc.nextDouble();
        //user options direct to appropriate methods below =============
        switch(uOption){
            case 1: gramsToPounds(grams);break;
            case 2: gramsToKG(grams);break;
            case 3: gramsToOz(grams);break;
        }
    }
    //Grams TO conversion and return methods======================
    // TO POUNDS
    public String gramsToPounds(double grams){
        pounds = grams * 0.00220462;
        if(grams == 1) {
            result = grams + gramStr + equals + pounds + poundsStr + ".";
        }else{
            result = grams + gramsStr + equals + pounds + poundsStr + ".";
        }
        return result;
    }
    // TO KILOGRAMS
    public String gramsToKG(double grams){
        kilograms = grams * 1000;
        if(grams == 1) {
            result = grams + gramStr + equals + kilograms + kilosStr + ".";
        }else{
            result = grams + gramsStr + equals + kilograms + kilosStr + ".";
        }
        return result;
    }
    // TO OUNCES
    public String gramsToOz(double grams){
        ounces = grams * 0.035274;
        if(grams == 1) {
            result = grams + gramStr + equals + ounces + ouncesStr + ".";
        }else{
            result = grams + gramsStr + equals + ounces + ouncesStr + ".";
        }
        return result;
    }
}