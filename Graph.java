package com.aman.data_structures;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Graph {

//    // Adjacency Matrix Representation : START
//
//    private int V;  // no of vertices in Graph
//    private int E;  // no of edges in Graph
//    private int[][] adjMatrix;
//
//    public Graph(int nodes){
//        this.V = nodes;
//        this.E = 0;
//        this.adjMatrix = new int[nodes][nodes];
//    }
//
//    public void addEdge(int u, int v){
//        adjMatrix[u][v] = 1;
//        adjMatrix[v][u] = 1;
//        E++;
//    }
//
//    public String toString(){
//        StringBuilder sb = new StringBuilder();
//        sb.append(V + " vertices, " + E + " edges " + "\n");
//        for(int v = 0; v < V; v++){
//            sb.append(v + ": ");
//            for(int w : adjMatrix[v]){
//                sb.append(w + " ");
//            }
//            sb.append("\n");
//        }
//        return sb.toString();
//    }
//
//    public static void main(String[] args) {
//        Graph g = new Graph(4);
//        g.addEdge(0, 1);
//        g.addEdge(1, 2);
//        g.addEdge(2, 3);
//        g.addEdge(3, 0);
//        System.out.println(g);
//    }
//
//    // Adjacency Matrix Representation : END



    // Adjacency List Representation : START

    private LinkedList<Integer>[] adj;
    private int V; // no of vertices
    private int E; // no of edges

    public Graph(int nodes){
        this.V = nodes;
        this.E = 0;
        this.adj = new LinkedList[nodes];
        for(int v = 0; v < V; v++){
            adj[v] = new LinkedList<>();
        }
    }

    public void addEdge(int u, int v){
        adj[u].add(v);
        adj[v].add(u);
        E++;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(V + " vertices, " + E + " edges " + "\n");
        for(int v = 0; v < V; v++){
            sb.append(v + ": ");
            for(int w : adj[v]){
                sb.append(w + " ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    // Adjacency List Representation : END



    // Breadth First Search of undirected Graph (Level Order Traversal)

    public void bfs(int s){  // s is the source node
        boolean[] visited = new boolean[V];
        Queue<Integer> q = new LinkedList<>();
        visited[s] = true;
        q.offer(s);

        while(!q.isEmpty()){
            int u = q.poll();
            System.out.print(u + " ");
            for(int v : adj[u]){
                if(!visited[v]){
                    visited[v] = true;
                    q.offer(v);
                }
            }
        }
    }


    // Depth First Search of undirected Graph (Iterative)

//    public void dfs(int s){  // s is the source node
//        boolean[] visited = new boolean[V];
//        Stack<Integer> stack = new Stack<>();
//        stack.push(s);
//
//        while(!stack.isEmpty()){
//            int u = stack.pop();
//            if(!visited[u]){
//                visited[u] = true;
//                System.out.print(u + " ");
//                for(int v : adj[u]){
//                    if(!visited[v]){
//                        stack.push(v);
//                    }
//                }
//            }
//        }
//    }


    // Depth First Search of undirected Graph (Recursive)

//    public void dfs(){
//        boolean[] visited = new boolean[V];
//        for(int v = 0; v < V; v++){
//            if(!visited[v]){
//                dfs(v, visited);
//            }
//        }
//    }
//
//    public void dfs(int v, boolean[] visited){
//        visited[v] = true;
//        System.out.print(v + " ");
//        for(int w : adj[v]){
//            if(!visited[w]){
//                dfs(w, visited);
//            }
//        }
//    }


    // Connected Components in undirected Graph

    public void dfs(){
        boolean[] visited = new boolean[V];
        int[] compId = new int[V];
        int count = 0;

        for(int v = 0; v < V; v++){
            if(!visited[v]){
                dfs(v, visited, compId, count);
                count++;
            }
        }
    }

    private void dfs(int v, boolean[] visited, int[] compId, int count) {
        visited[v] = true;
        compId[v] = count;

        for(int w : adj[v]){
            if(!visited[w]){
                dfs(w, visited, compId, count);
            }
        }
    }



    public static void main(String[] args) {
        Graph g = new Graph(6);
        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(2, 3);
        g.addEdge(3, 0);
        g.addEdge(2, 4);


//        System.out.println(g);

        // calling bfs method & displaying the result
//        g.bfs(0);  // s is the source node

        // calling dfs method & displaying the result (Iterative)
//        g.dfs(0);

        // calling dfs method & displaying the result (Recursive)
//        g.dfs();
    }

}
