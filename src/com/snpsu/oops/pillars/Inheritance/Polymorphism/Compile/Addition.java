package com.snpsu.oops.pillars.Inheritance.Polymorphism.Compile;

public class Addition {
    int add(int a, int b) {
        return a + b;
    }


    float add(int a, int b, int c) {
        return a + b + c;
    }
}
class DriveCode{
    public static void main(String[] args) {
        Addition obj=new Addition();
        System.out.println(obj.add(1,2));
        System.out.println(obj.add(1,2,3));


    }
}