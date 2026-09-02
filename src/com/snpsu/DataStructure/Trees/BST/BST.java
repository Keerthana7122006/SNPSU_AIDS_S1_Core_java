//package com.snpsu.DataStructure.Trees.BST;
//
//class Node {
//    int data;
//    Node left;
//    Node right;
//
//    Node(int data) {
//        this.data = data;
//        this.left = null;
//        this.right = null;
//    }
//}
//
//public class BST {
//
//    Node root;
//
//    private Node insertRec(Node root, int key) {
//        if (root == null) {
//            return new Node(key);
//        }
//
//        if (key < root.data) {
//            root.left = insertRec(root.left, key);
//        } else if (key > root.data) {
//            root.right = insertRec(root.right, key);
//        }
//
//        return root;
//    }
//
//    void insert(int key) {
//        root = insertRec(root, key);
//    }
//
//    private boolean searchRec(Node root, int key) {
//
//        if (root == null) {
//            return false;
//        }
//
//        if (key == root.data) {
//            return true;
//        } else if (key < root.data) {
//            return searchRec(root.left, key);
//        } else {
//            return searchRec(root.right, key);
//        }
//    }
//
//    boolean search(int key) {
//        return searchRec(root, key);
//    }
//
//    void DFS(Node root) {
//        if (root == null) {
//            return;
//        }
//
//        System.out.print(root.data + " ");
//
//        DFS(root.left);
//        DFS(root.right);
//    }
//
//
//    private Node removeRec(Node root,int key){
//        if(root==null) {
//            return null;
//        }
//        if(key<root.data) {
//            root.left = removeRec(root.left, key);
//        }else if(key>root.data){
//            root.right=removeRec(root.right,key);
//        }else{
//
//        }
//
//    }
//    void remove(){
//        root=removeRec(root,key);
//
//    }
//}
//
//class Driver {
//    public static void main(String[] args) {
//
//        BST bst = new BST();
//
//        bst.insert(100);
//        bst.insert(50);
//        bst.insert(180);
//
//        bst.search(70);
//
//        bst.DFS(bst.root);
//    }
//}