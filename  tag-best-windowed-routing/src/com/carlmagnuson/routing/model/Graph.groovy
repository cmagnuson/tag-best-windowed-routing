package com.carlmagnuson.routing.model;

import java.util.HashMap;
import java.util.LinkedList;

class Graph {
	
	private LinkedList<Edge> edges = new LinkedList<Edge>();
	private HashMap<Integer, Node> nodes = new HashMap<Integer, Node>();
	private Integer minTime = null;
	private Integer maxTime = null;
	
	public Collection<Node> getNodes(){
		return nodes.values();
	}
	
	public Collection<Edge> getEdges(){
		return edges;
	}
	
	public getNode(int nodeId){
		return nodes.get(nodeId);
	}
	
	public addNode(Node n){
		nodes.put(n.getId(), n);
	}
	
	public void addEdge(Edge e){
		edges.add(e);
		nodes.get(e.getStart().getId()).addEdge(e);
		nodes.get(e.getDestination().getId()).addInEdge(e);
	}
	
	public int numEdges(){
		return edges.size();
	}
	
	public int numNodes(){
		return nodes.size();
	}
	
	//save min and max values once they are calculated once
	public int getMinTime(){
		if(minTime==null){
			minTime = Integer.MAX_VALUE;
			for(Edge e: edges){
				for(Integer time: e.getTravelTime().keySet()){
					if(time<minTime){
						minTime = time;
					}
				}
			}
		}
		
		return minTime;
	}
	
	public int getMaxTime(){
		if(maxTime==null){
			maxTime = Integer.MIN_VALUE;
			for(Edge e: edges){
				for(int time: e.getTravelTime().keySet()){
					if(time>maxTime){
						maxTime = time;
					}
				}
			}
		}
		return maxTime;
	}
}