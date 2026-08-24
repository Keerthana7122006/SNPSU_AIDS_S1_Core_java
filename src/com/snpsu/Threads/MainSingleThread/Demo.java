package com.snpsu.Threads.MainSingleThread;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Main thread started!");
        for(int i=0;i<5;i++){
            System.out.println("Main thread:"+i);
        }
        System.out.println("Main thread stopped!");
    }


}
