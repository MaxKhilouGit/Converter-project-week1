import java.util.Scanner;
class poundsTo extends convert{
    //================================
    poundsTo(Scanner sc){
        System.out.println("Enter measurement to convert it into: 1. ounces; 2. kilograms; 3. grams");
        uOption = sc.nextInt();
        System.out.println("Enter amount of pounds:");
        pounds = sc.nextDouble();
        //
        switch(uOption){
            case 1: poundsToOz(pounds);break;
            case 2: poundsToKG(pounds);break;
            case 3: poundsToGr(pounds);break;
        }
    }
    //POUNDS TO conversion and return methods======================
    // to Ozs
    public String poundsToOz(double pounds){
        ounces = pounds * 16.0;
        if(pounds == 1) {
            result = pounds + poundStr + equals + ounces + ouncesStr + ".";
        }else{
            result = pounds + poundsStr + equals + ounces + ouncesStr + ".";
        }
        return result;
    }
    // to KGs========================
    public String poundsToKG(double pounds){
        kilograms = pounds * 0.453592;
        if(pounds == 1) {
            result = pounds + poundStr + equals + kilograms + kilosStr + ".";
        }else{
            result = pounds + poundsStr + equals + kilograms + kilosStr + ".";
        }
        return result;
    }
    // to Grams=======================
    public String poundsToGr(double pounds){
        grams = pounds * 453.592;
        if(pounds == 1) {
            result = pounds + poundStr + equals + grams + gramsStr + ".";
        }else{
            result = pounds + poundsStr + equals + grams + gramsStr + ".";
        }
        return result;
    }
}