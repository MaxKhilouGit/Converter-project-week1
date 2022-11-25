import java.util.Scanner;
class Converter{
    double pounds = 0.0, ounces = 0.0, kilograms = 0.0, grams = 0.0;
    int uOption;
    // String variables for the results to send back to MainConverterMass
    String poundsStr = " pounds ", ouncesStr = " ounces ", kilosStr = " kilograms ", gramsStr = " grams ";
    String poundStr = " pound ", ounceStr = " ounce ", kiloStr = " kilogram ", gramStr = " gram ";
    String equals = "is equal to ";
    String result;

    Converter(){
        System.out.println("Welcome to the Mass Converter by JavaLinks!"); //General Intro
    }
    //================================
    Converter(Scanner sc){
        System.out.println("Enter measurement to convert it into: 1. ounces; 2. kilograms; 3. grams");
        uOption = sc.nextInt();
        //user options direct to appropriate methods
        switch(uOption){
            case 1: poundsToOz(sc);break;
            case 2: poundsToKG(sc);break;
            case 3: poundsToGr(sc);break;
        }
    }
    //POUNDS TO conversion and return methods======================
    // to Ozs
    public String poundsToOz(Scanner sc){
        System.out.println("Enter amount of pounds:");
        pounds = sc.nextDouble();
        ounces = pounds * 16.0;

        if(pounds == 1) {
            result = pounds + poundStr + equals + ounces + ouncesStr + ".";
        }else{
            result = pounds + poundsStr + equals + ounces + ouncesStr + ".";
        }
        return result;
    }
    // to KGs========================
    public String poundsToKG(Scanner sc){
        System.out.println("Enter amount of pounds:");
        pounds = sc.nextDouble();
        kilograms = pounds * 0.453592;

        if(pounds == 1) {
            result = pounds + poundStr + equals + kilograms + kilosStr + ".";
        }else{
            result = pounds + poundsStr + equals + kilograms + kilosStr + ".";
        }
        return result;
    }
    // to Grams=======================
    public String poundsToGr(Scanner sc){
        System.out.println("Enter amount of pounds:");
        pounds = sc.nextDouble();
        grams = pounds * 453.592;

        if(pounds == 1) {
            result = pounds + poundStr + equals + grams + gramsStr + ".";
        }else{
            result = pounds + poundsStr + equals + grams + gramsStr + ".";
        }
        return result;
    }
}