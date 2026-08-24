package com.snpsu.recursion;

public class Recursion{
    static void function(int n) {
        if (n == 0){
            return;
    }


        System.out.println(n);//main body of recursive function
        function(n-1);//recursion function
    }
    public static void main(String[]args){
        function(10);

    }
}
