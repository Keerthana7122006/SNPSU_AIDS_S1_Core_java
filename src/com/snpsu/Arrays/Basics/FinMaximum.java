package com.snpsu.Arrays.Basics;

public class FinMaximum {
    public static void main(String[] args){
        int[]arr={5,11,7,8,4,6};
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            System.out.println("Max is" +" "+max);
        }

    }
}
