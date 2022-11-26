import java.util.Scanner;

class ouncesTo {
    double pounds = 0.0, ounces = 0.0, kilograms = 0.0, grams = 0.0;
    int uOption;
    String poundsStr = " pounds ", ouncesStr = " ounces ", kilosStr = " kilograms ", gramsStr = " grams ";
    String poundStr = " pound ", ounceStr = " ounce ", kiloStr = " kilogram ", gramStr = " gram ";
    String equals = "is equal to ";
    String result;

    ouncesTo(){
        System.out.println("Welcome to the Mass Converter by JavaLinks!");
    }
    //================================
    ouncesTo(Scanner sc){
        System.out.println("Enter measurement to convert it into: 1. pounds; 2. kilograms; 3. grams");
        uOption = sc.nextInt();
        //
        switch(uOption){
            case 1: ouncesToLB(sc);break;
            case 2: ouncesToKg(sc);break;
            case 3: ouncesToGr(sc);break;
        }
    }
    //OUNCES TO conversion and return methods======================
    // to LBs
    public String ouncesToLB(Scanner sc){
        System.out.println("Enter amount of ounces:");
        ounces = sc.nextDouble();
        pounds = ounces * 0.0625;
        if(pounds == 1) {
            result = ounces + ounceStr + equals + pounds + poundsStr + ".";
        }else{
            result = ounces + ouncesStr + equals + pounds + poundsStr + ".";
        }
        return result;
    }
    // to KGs========================
    public String ouncesToKg(Scanner sc){
        System.out.println("Enter amount of ounces:");
        ounces = sc.nextDouble();
        kilograms = ounces * 0.0283495;

        if(pounds == 1) {
            result = ounces + ounceStr + equals + kilograms + kilosStr + ".";
        }else{
            result = ounces + ouncesStr + equals + kilograms + kilosStr + ".";
        }
        return result;
    }
    // to Grams=======================
    public String ouncesToGr(Scanner sc){
        System.out.println("Enter amount of ounces:");
        ounces = sc.nextDouble();
        grams = ounces * 28.34952;

        if(pounds == 1) {
            result = ounces + ounceStr + equals + grams + gramsStr + ".";
        }else{
            result = ounces + ouncesStr + equals + grams + gramsStr + ".";
        }
        return result;
    }
}