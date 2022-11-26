import java.util.Scanner;

class gramsTo extends convert {
    gramsTo(){
        System.out.println("Welcome to the Mass Converter by JavaLinks!");
    }
    gramsTo(Scanner sc){
        System.out.println("Enter measurement to convert it into: 1. pounds; 2. kilograms; 3. ounces");
        uOption = sc.nextInt();
        //user options direct to appropriate methods
        switch(uOption){
            case 1: gramsToPounds(sc);break;
            case 2: gramsToKG(sc);break;
            case 3: gramsToOz(sc);break;
        }
    }
    //Grams TO conversion and return methods======================
    // to pounds
    public String gramsToPounds(Scanner sc){
        System.out.println("Enter amount of grams:");
        grams = sc.nextDouble();
        pounds = grams * 0.00220462;

        if(grams == 1) {
            result = grams + gramStr + equals + pounds + poundsStr + ".";
        }else{
            result = grams + gramsStr + equals + pounds + poundsStr + ".";
        }
        return result;
    }
    // to KGs========================
    public String gramsToKG(Scanner sc){
        System.out.println("Enter amount of grams:");
        grams = sc.nextDouble();
        kilograms = grams * 1000;

        if(grams == 1) {
            result = grams + gramStr + equals + kilograms + kilosStr + ".";
        }else{
            result = grams + gramsStr + equals + kilograms + kilosStr + ".";
        }
        return result;
    }
    // to ounces=======================
    public String gramsToOz(Scanner sc){
        System.out.println("Enter amount of grams:");
        grams = sc.nextDouble();
        ounces = grams * 0.035274;

        if(grams == 1) {
            result = grams + gramStr + equals + ounces + ouncesStr + ".";
        }else{
            result = grams + gramsStr + equals + ounces + ouncesStr + ".";
        }
        return result;
    }
}