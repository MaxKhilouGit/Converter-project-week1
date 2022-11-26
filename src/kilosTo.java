import java.util.Scanner;

class kilosTo extends convert{
    kilosTo(Scanner sc){
        System.out.println("Enter measurement to convert it into: 1. pounds; 2. grams; 3. ounces");
        uOption = sc.nextInt();
        //user options direct to appropriate methods
        switch(uOption){
            case 1: kilosToPounds(sc);break;
            case 2: kilosToGrams(sc);break;
            case 3: kilosToOunces(sc);break;
        }
    }
    //KiloGrams TO conversion and return methods======================
    // to pounds
    public String kilosToPounds(Scanner sc){
        System.out.println("Enter amount of kilograms:");
        kilograms = sc.nextDouble();
        pounds = kilograms * 2.20462;

        if(grams == 1) {
            result = kilograms + kiloStr + equals + pounds + poundsStr + ".";
        }else{
            result = kilograms + kilosStr + equals + pounds + poundsStr + ".";
        }
        return result;
    }
    //============to Grams
    public String kilosToGrams(Scanner sc){
        System.out.println("Enter amount of kilograms:");
        kilograms = sc.nextDouble();
        grams = kilograms * 1000;

        if(pounds == 1) {
            result = kilograms + kiloStr + equals + grams + gramsStr + ".";
        }else{
            result = kilograms + kilosStr + equals + grams + gramsStr + ".";
        }
        return result;
    }
    // to Ounces=======================
    public String kilosToOunces(Scanner sc){
        System.out.println("Enter amount of kilograms:");
        kilograms = sc.nextDouble();
        ounces = kilograms * 35.27;

        if(pounds == 1) {
            result = kilograms + kiloStr + equals + ounces + ouncesStr + ".";
        }else{
            result = kilograms + kilosStr + equals + ounces + ouncesStr + ".";
        }
        return result;
    }
}