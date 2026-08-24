package com.snpsu.oops.pillars.Inheritance.Polymorphism.Runtime;

public class Mom {
    void cook(){
        System.out.println("Indian");
    }

}
class Daughter extends Mom{
    void cook() {
        System.out.println("Chinse");
    }

}
class DriverCode{
    public static void main(String[] args){
        Mom m= new Mom();
        Daughter d= new Daughter();

        m.cook();
        d.cook();
    }
}