package com.carlmagnuson.routing.search;

import org.apache.log4j.Logger;
import java.util.LinkedList;
import java.util.HashMap;
import java.util.PriorityQueue;
import com.carlmagnuson.routing.model.Node;
import com.carlmagnuson.routing.model.*;

class BestAllConstrainedTime {
	
	private static Logger log = Logger.getInstance(BestAllConstrainedTime.class)
	
	public static Route findRoute(Graph g, Node s, Node d, int earliestLeave, int latestLeave, int earliestArrival, int latestArrival){
		int T = g.getMaxTime() - g.getMinTime();
		LinkedList<Node> Q = new LinkedList<Node>();
		HashMap<Node, HashMap<Integer, Edge>> parent = new HashMap<Node, HashMap<Integer, Edge>>();
		Q.add d
		
		//initialize cost data structure
		log.debug("best search initialization")
		HashMap<Node, HashMap<Integer, Integer>> C = new HashMap<Node, DefaultInitHashMap<Integer, Integer>>();
		for(Node n: g.getNodes()){
			parent.put(n, new HashMap<Integer, Edge>());
				if(n.equals(d)){
					C.put(n, new DefaultInitHashMap<Integer,Integer>(0));
				}
				else{
					C.put(n, new DefaultInitHashMap<Integer,Integer>(Integer.MAX_VALUE/2));
				}
		}
		
		log.debug("starting best search loop")
		while(!Q.isEmpty()){
			Node v = Q.removeFirst();
			log.trace("expanding from "+v.getId());
			for(Edge e: v.getInEdges()){
					Node u = e.getStart();
//					for(int t = g.getMinTime(); t<=g.getMaxTime(); t++){
					for(int t = earliestLeave; t<=latestArrival; t++){
						if(e.getTraverseTime(t)>=0 && C.get(u).get(t) > e.getTraverseTime(t)+C.get(v).get(t+e.getTraverseTime(t))
						//this line added to enforce destination time window
						&& e.getTraverseTime(t)+C.get(v).get(t+e.getTraverseTime(t)) + t <= latestArrival){
							C.get(u).put(t, e.getTraverseTime(t)+C.get(v).get(t+e.getTraverseTime(t)));
							if(!Q.contains(u)){
								Q.add(u);
							}
							RouteItem ri = new RouteItem();
							ri.setEdge(e);
							ri.setTime(t);
							parent.get(u).put(t, e);
						}
					}
			}
		}
		
		Route r = new Route();
		
		Node currentNode = s;
		int leastCost = Integer.MAX_VALUE;
		int time = 0;
		int nextTime = time;
		HashMap<Integer, Integer> timeSeries = C.get(currentNode);
		for(; time<=latestLeave && time<=g.getMaxTime(); time++){
			log.trace("Time: "+time+" Cost: "+timeSeries.get(time));
			if(timeSeries.get(time)<leastCost && timeSeries.get(time)+time>=earliestArrival){
				leastCost = timeSeries.get(time);
				nextTime = time;
			}
		}
		time = nextTime;
		
		while(!currentNode.equals(d)){
			log.trace("Time: "+time);
			log.trace("Node: "+currentNode.getId());
			
			if(parent.get(currentNode).get(time)==null){
				log.debug("No route found which satisfies requirements");
				r = null;
				break;
			}
			
			Node nextNode = parent.get(currentNode).get(time).getDestination();
			nextTime = time + parent.get(currentNode).get(time).getTraverseTime(time);
			
			RouteItem ri = new RouteItem();
			ri.setEdge(parent.get(currentNode).get(time));
			ri.setTime(time);
			r.addTraversal(ri);
			
			time = nextTime;
			currentNode = nextNode;
		}
		
		return r;
	}
	
}