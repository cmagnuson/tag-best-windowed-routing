package com.carlmagnuson.routing.model;

import java.util.LinkedList;

class Node {
	
	int id;
	LinkedList<Edge> edges = new LinkedList<Edge>();
	LinkedList<Edge> inEdges = new LinkedList<Edge>();
	HashMap<Integer, Integer> presence = new HashMap<Integer, Integer>();
	
	public Node(int id){
		this.id = id;
	}
	
	public int hashCode(){
		return id;
	}
	
	public void addEdge(Edge e){
		edges.add(e);
	}
	
	public void addInEdge(Edge e){
		inEdges.add(e);
	}
}
