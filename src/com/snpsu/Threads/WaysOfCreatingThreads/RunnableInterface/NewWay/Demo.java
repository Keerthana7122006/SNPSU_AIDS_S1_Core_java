package com.snpsu.Threads.WaysOfCreatingThreads.RunnableInterface.NewWay;

public class Demo {
    public static void main (String[]args){
        Thread t1=new Thread(()->{
            System.out.println("Task1 is running");
        });
        Thread t2=new Thread(()->{
            for (int i = 0; i < 10; i++) {
                System.out.println("Task2 is Running:" + i);
            }
        });
        t2.start();
        t1.start();
    }
}
