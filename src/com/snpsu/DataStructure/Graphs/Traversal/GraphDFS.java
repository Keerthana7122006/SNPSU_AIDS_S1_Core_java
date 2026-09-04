package com.snpsu.DataStructure.Graphs.Traversal;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;

public class GraphDFS {int v;
    GraphDFS(int v){
        this.v=v;

    }
    private void dfsRec(int srcNode,HashMap<Integer,ArrayList<Integer>> adjList,boolean[] visited,
                        ArrayList<Integer> ans){
        visited[srcNode]=true;
        ans.add(srcNode);

        for(int neigbhour:adjList.get(srcNode)){
            if(!visited[neigbhour]){

                dfsRec(neigbhour,adjList,visited,ans);
            }
        }
    }
    ArrayList<Integer> dfsTraversal(HashMap<Integer,ArrayList<Integer>>adjList){
        boolean[] visited=new boolean[v];
        ArrayList<Integer>ans=new ArrayList<>();
        dfsRec(0,adjList,visited,ans);


        return ans;
    }



}

class DriveCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Nodes and Edges");
        int n = sc.nextInt();//num of nodes
        int e = sc.nextInt();//num of edges

        //Adjacency List
        HashMap<Integer, ArrayList<Integer>> adjList = new HashMap<>();


        //creating an empty arraylist for every node
        for (int i = 0; i < n; i++) {
            adjList.put(i, new ArrayList<>());
        }
        // add edges
        for (int i = 0; i < e; i++) {
            System.out.println("Enter Edge" + i + ":");
            int u = sc.nextInt();
            int v = sc.nextInt();

            adjList.get(u).add(v);
            adjList.get(v).add(u);
        }
        //printing adjList
        System.out.println("AdjList: ");
        for (int i : adjList.keySet()) {
            System.out.println(i + "->" + adjList.get(i));
        }

         GraphDFS dfs=new GraphDFS(n);
        ArrayList<Integer>ans=dfs.dfsTraversal(adjList);
        System.out.println("DFS Traversal: ");
        for(int i:ans){
            System.out.print(i+" ");
        }
    }
}