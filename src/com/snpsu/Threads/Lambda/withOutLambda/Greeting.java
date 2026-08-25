package com.snpsu.Threads.Lambda.withOutLambda;

interface Greeting {
    void SayHello();

}
class Demo{
    public static void main (String[]args){
        Greeting g=new Greeting(){
            @Override
            public void SayHello(){
                System.out.println("Hello World");
            }
        };
        g.SayHello();
    }
}
