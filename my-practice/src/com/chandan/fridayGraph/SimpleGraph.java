package com.chandan.fridayGraph;

import java.util.ArrayList;

//adjecency list
public class SimpleGraph {

	public static void addEdge(ArrayList<ArrayList<Integer>> add, int s, int d) {
		add.get(s).add(d);
		add.get(d).add(s);
	}
	public static void printGraph(ArrayList<ArrayList<Integer>> addList) {
		for(int i =0; i<addList.size(); i++) {
			System.out.println("\nadjecency node of vertex:-"+ i);
			System.out.print("head");
			for(int j = 0; j<addList.get(i).size(); j++) {
				System.out.print("->"+ addList.get(i).get(j));
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int V = 5;
		ArrayList<ArrayList<Integer>> adj = 
				new ArrayList<ArrayList<Integer>>();
		for(int i = 0;i<V; i++) {
			adj.add(new ArrayList<Integer>());
		}
		 // Adding edges one by one 
        addEdge(adj, 0, 1); 
        addEdge(adj, 0, 4); 
        addEdge(adj, 1, 2); 
        addEdge(adj, 1, 3); 
        addEdge(adj, 1, 4); 
        addEdge(adj, 2, 3); 
        addEdge(adj, 3, 4); 
		printGraph(adj);
	}
}
