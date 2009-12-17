package com.carlmagnuson.routing.model;

class RouteItem {
	
	int time;
	Edge edge;
	
	public int getEndTime(){
		return edge.getTraverseTime(time)+time;
	}
}