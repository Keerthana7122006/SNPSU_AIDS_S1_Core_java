package com.snpsu.DynamicProgram.Memoization;

import java.util.Arrays;

public class Fibonacci {
    static int fib(int n,int[] dp){
        if(n==0||n==1){
            return n;

        }else{

            if(dp[n]!=-1){
                return dp[n];
            }
            dp[n]=fib(n-1,dp)+fib(n-2,dp);
            return dp[n];
        }
    }

    public static void main(String[] args) {
        int n=100;
        int[]dp=new int[n];
        Arrays.fill(dp,-1);



        for(int i=0;i<n;i++){
            System.out.print(fib(i,dp)+" ");
        }

    }

}
