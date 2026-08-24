package com.snpsu.ExceptionHandling;

public class E3 {
    public static void main(String[] args) {
        int age=222;
        if(age>=18){
            System.out.println("Eligible-access Grant!");
        }
        else{
            throw new RuntimeException("Not Eligibl");
        }
    }
}
