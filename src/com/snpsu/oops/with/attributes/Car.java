package com.snpsu.oops.with.attributes;

public class Car {
    //attributes-instance variables
    String Brand;
    int manuDate;


    Car(String Brand,int manuDate){
        this.Brand=Brand;
        this.manuDate=manuDate;

    }
    void printDetails(){
        System.out.println("Car Brand:"+Brand);
        System.out.println("Car brand:"+manuDate);

    }
    public static void main(String[]args){
        Car c1=new Car("BMW",2000);
        Car c2=new Car("Audi",2908);

        c1.printDetails();
        c2.printDetails();

    }

}
