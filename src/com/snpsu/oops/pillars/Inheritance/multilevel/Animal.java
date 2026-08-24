package com.snpsu.oops.pillars.Inheritance.multilevel;



class Animal {
    void eat() {

        System.out.println("Eating...");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Barking...");
    }
}
class Puppy extends Dog {

    void cry() {
        System.out.println("crying...");
    }
}

class DriveCode {
    public static void main(String[] args) {

        Animal a = new Animal();
        Dog d = new Dog();
        Puppy p=new Puppy();

        a.eat();
        d.bark();
        d.eat();
        p.cry();
        p.eat();
        p.bark();
    }
}