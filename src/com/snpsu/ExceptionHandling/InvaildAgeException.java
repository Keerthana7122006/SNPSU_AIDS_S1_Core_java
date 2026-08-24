package com.snpsu.ExceptionHandling;

public class InvaildAgeException extends Exception{
    InvaildAgeException(String msg){
        super(msg);
    }

}
class Driver{
    public static void main(String[]args)throws InvaildAgeException{
        int age=20;
        if(age<18){
            throw new InvaildAgeException("Age must be more than 18");
        }
    }
}