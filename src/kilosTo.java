import java.util.Scanner;

class kilosTo extends convert{
    kilosTo(Scanner sc){
        System.out.println("Enter measurement to convert it into: 1. pounds; 2. grams; 3. ounces");
        uOption = sc.nextInt();
        System.out.println("Enter amount of kilograms:");
        kilograms = sc.nextDouble();
        //user options direct to appropriate methods
        switch(uOption){
            case 1: kilosToPounds(kilograms);break;
            case 2: kilosToGrams(kilograms);break;
            case 3: kilosToOunces(kilograms);break;
        }
    }
    //KiloGrams TO conversion and return methods======================
    // to pounds
    public String kilosToPounds(double kilograms){
        pounds = kilograms * 2.20462;
        if(grams == 1) {
            result = kilograms + kiloStr + equals + pounds + poundsStr + ".";
        }else{
            result = kilograms + kilosStr + equals + pounds + poundsStr + ".";
        }
        return result;
    }
    //============to Grams
    public String kilosToGrams(double kilograms){
        grams = kilograms * 1000;
        if(pounds == 1) {
            result = kilograms + kiloStr + equals + grams + gramsStr + ".";
        }else{
            result = kilograms + kilosStr + equals + grams + gramsStr + ".";
        }
        return result;
    }
    // to Ounces=======================
    public String kilosToOunces(double kilograms){
        ounces = kilograms * 35.27;
        if(pounds == 1) {
            result = kilograms + kiloStr + equals + ounces + ouncesStr + ".";
        }else{
            result = kilograms + kilosStr + equals + ounces + ouncesStr + ".";
        }
        return result;
    }
}