package com.snpsu.oops.pillars.Abstraction.PartialAbstraction;

abstract class Car {
     abstract void start();
     void brake(){
        System.out.println("Car ");
    }
}


class BMW extends Car{
    void start(){
        System.out.println("BMW starts with a button");
    }
}


class Toyota extends Car{
    void start(){
        System.out.println("Toyota strarts with a button");
    }

}
class DriverCode{
    public  static void main(String[] args){
        BMW bmw = new BMW();
        bmw.start();
        bmw.brake();

        Toyota toyota = new Toyota();
        toyota.start();
        toyota.brake();
    }
}

