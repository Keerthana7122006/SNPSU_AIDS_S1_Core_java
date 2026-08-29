package com.snpsu.DataStructure.LinkedList.SLL;

class Node {
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }

}
public class SLL {
    Node head;

    SLL() {
        this.head = null;
    }

    void insertAtHead(int val) {
        Node n = new Node(val);
        n.next = head;
        head = n;
    }
    void printSLL(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println(temp);
    }
}
class Driver{
    public static void main(String[] args){
        SLL sll=new SLL();
        sll.insertAtHead(1);
        sll.insertAtHead(2);
        sll.insertAtHead(3);
        sll.printSLL();
    }
}