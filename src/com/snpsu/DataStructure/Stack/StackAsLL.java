package com.snpsu.DataStructure.Stack;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public class StackAsLL {

        Node top = null;

        // Push
        void push(int data) {
            Node newNode = new Node(data);

            newNode.next = top;
            top = newNode;
        }

        // Pop
        void pop() {
            if (top == null) {
                System.out.println("Stack is empty");
                return;
            }

            System.out.println("Popped: " + top.data);
            top = top.next;
        }

        // Peek
        void peek() {
            if (top == null) {
                System.out.println("Stack is empty");
                return;
            }

            System.out.println("Top: " + top.data);
        }

        // Display
        void display() {
            Node temp = top;

            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }

        public static void main(String[] args) {

            StackAsLL stack = new StackAsLL();

            stack.push(10);
            stack.push(20);
            stack.push(30);

            stack.display();

            System.out.println();
            stack.peek();

            stack.pop();

            stack.display();
        }
    }
