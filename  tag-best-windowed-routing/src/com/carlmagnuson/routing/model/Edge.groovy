package com.carlmagnuson.routing.model;

import java.util.HashMap;

class Edge {
	
	public static final int NO_PATH = -1;
	
	private Node start;
	private Node destination;
	
	HashMap<Integer, Integer> travelTime;
	
	public Edge(Node start, Node destination, HashMap<Integer, Integer> travelTime){
		this.start = start;
		this.destination = destination;
		this.travelTime = travelTime;
	}
	
	public Integer getTraverseTime(int time){
		if(travelTime.containsKey(time)){
			return travelTime.get(time);
		}
		else{
			return NO_PATH;
		}
	}
	
	public Node getStart(){
		return start;
	}
	
	public Node getDestination(){
		return destination;
	}
	
}