package com.snpsu.Threads.ControllingThreads;

public class Demo {
    public static void main (String[]args){
        Thread t1=new Thread(()->{
            for(int i=0;i<10;i++) {
                System.out.println("Task1 is running"+i);
                try{
                    Thread.sleep(500);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        });
        Thread t2=new Thread(()->{
            for (int i = 0; i < 10; i++) {
                System.out.println("Task2 is Running:" + i);
                try{
                    Thread.sleep(1000);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        });
        t2.start();
        t1.start();
    }
}

