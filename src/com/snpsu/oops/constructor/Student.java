package com.snpsu.oops.constructor;

public class Student {
    String name;
    int rollno;

    // Parameterized constructor
    Student(String name, int rollno) {
        this.name = name;
        this.rollno = rollno;
    }

    // Copy constructor
    Student(Student s1) {
        this.name = s1.name;
        this.rollno = s1.rollno;
    }

    public static void main(String[] args) {
        Student s1 = new Student("Keerthana", 58);
        Student s2 = new Student(s1);

        System.out.println(s1 == s2);

        s2.name = "David";
        System.out.println(s2.name);
    }
}