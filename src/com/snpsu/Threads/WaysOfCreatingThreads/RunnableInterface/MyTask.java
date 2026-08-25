package com.snpsu.Threads.WaysOfCreatingThreads.RunnableInterface;

class MyTask1 implements Runnable{
    public void run(){

        System.out.println("Task 1 is running");
    }

}
class MyTask2 implements Runnable{
    public void run(){
        System.out.println("Task 2 is running");
    }

}
class Demo{
    public static void main(String[] args) {
        MyTask1 task1=new MyTask1();
        MyTask2 task2=new MyTask2();
        Thread t1=new Thread(task1);
        Thread t2=new Thread(task2);
        t1.start();
        t2.start();
        System.out.println("Main thread is running");
    }
}
