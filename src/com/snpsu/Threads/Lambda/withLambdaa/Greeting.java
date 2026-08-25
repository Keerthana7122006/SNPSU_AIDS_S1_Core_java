package com.snpsu.Threads.Lambda.withLambdaa;

public interface Greeting {
    void SayHello();
}
class Demo{
    public static void main (String[]args){
        Greeting g=()-> System.out.println("HelloWorld");
    }
}