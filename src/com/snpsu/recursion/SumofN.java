package com.snpsu.recursion;

public class SumofN {
    static int sum(int n){
        //base case
        if(n==1){
            return 1;
        }else{
            return n+sum(n-1);
        }

    }

    public static void main(String[] args) {
        System.out.println(sum(5));


    }
}
