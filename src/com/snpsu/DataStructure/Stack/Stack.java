package com.snpsu.DataStructure.Stack;

public class Stack {
    int[]arr;
    int top;
    int size;

    Stack(int size){
        this.size=size;
        top=-1;
        arr=new int[size];
    }
    void push(int val){
        if(top==size-1){
            System.out.println("Overflow");
            return;
        }
        top++;
        arr[top]=val;
    }
    void pop(){
        if(top==-1){
            System.out.println("Underflow");
            return;
        }
        arr[top]=0;
        top--;
    }
    int Top(){
        if(top==-1){
            System.out.println("Underflow");
            return-1;
        }
        return arr[top];
    }
    boolean isEmpty(){
        return top==-1;
    }
}
class Driver{
    public static void main(String[] args){
        Stack s=new Stack(10);
        s.push(11);
        s.push(56);
        s.push(7);
        s.push(34);
        s.push(10);
        System.out.println(s.Top());
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        System.out.println(s.Top());
    }
}
