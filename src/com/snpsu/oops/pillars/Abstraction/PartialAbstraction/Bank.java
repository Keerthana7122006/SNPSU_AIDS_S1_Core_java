package com.snpsu.oops.pillars.Abstraction.PartialAbstraction;

abstract class RBI{
    abstract int ROI();


    void welcomeMessage(){

        System.out.println("Welcome");
    }
    static void termsAndConditions(){

        System.out.println("Some Terms and Condition");
    }
}

class HDFC extends RBI{
    int ROI(){

        return 6;
    }


}
class SBI extends RBI{
    int ROI(){

        return 10;
    }
}
class DriveCode2{
    public  static void main(String[] args){
        HDFC hdfc=new HDFC();
        System.out.println(hdfc.ROI());

        SBI sbi=new SBI();
        System.out.println(sbi.ROI());
    }
}
