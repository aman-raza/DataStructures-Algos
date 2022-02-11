package com.aman.data_structures;

import java.util.LinkedList;

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

    public static void main(String[] args) {
        Graph g = new Graph(4);
        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(2, 3);
        g.addEdge(3, 0);
        System.out.println(g);
    }
}
