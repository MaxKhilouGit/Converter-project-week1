import java.util.Scanner;

class ouncesTo extends convert {
    //================================
    ouncesTo(Scanner sc){
        System.out.println("Enter measurement to convert it into: 1. pounds; 2. kilograms; 3. grams");
        uOption = sc.nextInt();
        System.out.println("Enter amount of ounces:");
        ounces = sc.nextDouble();
        //
        switch(uOption){
            case 1: ouncesToLB(ounces);break;
            case 2: ouncesToKg(ounces);break;
            case 3: ouncesToGr(ounces);break;
        }
    }
    //OUNCES TO conversion and return methods======================
    // to LBs
    public String ouncesToLB(double ounces){
        pounds = ounces * 0.0625;
        if(pounds == 1) {
            result = ounces + ounceStr + equals + pounds + poundsStr + ".";
        }else{
            result = ounces + ouncesStr + equals + pounds + poundsStr + ".";
        }
        return result;
    }
    // to KGs========================
    public String ouncesToKg(double ounces){
        kilograms = ounces * 0.0283495;
        if(pounds == 1) {
            result = ounces + ounceStr + equals + kilograms + kilosStr + ".";
        }else{
            result = ounces + ouncesStr + equals + kilograms + kilosStr + ".";
        }
        return result;
    }
    // to Grams=======================
    public String ouncesToGr(double ounces){
        grams = ounces * 28.34952;
        if(pounds == 1) {
            result = ounces + ounceStr + equals + grams + gramsStr + ".";
        }else{
            result = ounces + ouncesStr + equals + grams + gramsStr + ".";
        }
        return result;
    }
}