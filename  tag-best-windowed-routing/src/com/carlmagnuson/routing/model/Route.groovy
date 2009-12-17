package com.carlmagnuson.routing.model;

import java.util.HashMap;
import java.util.LinkedList;

import org.apache.log4j.Logger;

class Route {
	
	//what time to traverse which edge
	LinkedList<RouteItem> traversals = new LinkedList<RouteItem>();
	
	private static Logger log = Logger.getInstance(Route.class);

	public void addTraversal(RouteItem ri){
		traversals.add(ri);
	}
	
	public int getTripTime(){
		int startTime = Integer.MAX_VALUE;
		int endTime = Integer.MIN_VALUE;
		
		startTime = traversals.peek().getTime();
		endTime = traversals.last().getTime();
		
		if(endTime<startTime){
			log.error("< 0 time route calculated");
			return -1;
		}
		
		int actualEndTime = traversals.get(endTime).getTraverseTime(endTime);
		return actualEndTime-startTime;
	}
	
	public String toString(){
		String ret = "Route:\n";
		for(RouteItem ri: traversals){
			ret+= "["+ri.getEdge().getStart().getId()+"->"+ri.getEdge().getDestination().getId()+", "+ri.getTime()+"-"+ri.getEndTime()+"]\n";
		}
		ret+="Total Time: "+(traversals.getLast().getEndTime()-traversals.getFirst().getTime());
		return ret;
	}
	
	public String getRouteString(){
		String ret = ""+traversals.peek().getEdge().getStart().getId()+"->";
		for(RouteItem ri: traversals){
			ret+=ri.getEdge().getDestination().getId()+"->"
		}
		ret = ret.substring(0, ret.length()-2);
		return ret;
	}
	public String getTimeString(){
		String ret = "";
		for(RouteItem ri: traversals){
			ret+=ri.getTime()+"-"+ri.getEndTime()+"-";
		}
		ret = ret.substring(0, ret.length()-1);
		return ret;
	}
}