package com.snpsu.oops.pillars.Inheritance.superkeyword;

public class Person {
    String Fname;
    String Lname;
    Person(String Fname,String Lname) {
        this.Fname = Fname;
        this.Lname = Lname;
    }
}
class Student extends Person{
    int rollno;
    Student(String Fname,String Lname,int rollno) {
        super(Fname,Lname);
        this.rollno=rollno;
    }
}
class DriverCode{
    public static void main(String[] args){
        Student s1=new Student("Keerthana","S",101);
        System.out.println(s1.Fname);

    }
}
