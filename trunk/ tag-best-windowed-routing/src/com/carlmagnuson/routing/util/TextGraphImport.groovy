package com.carlmagnuson.routing.util;

import java.util.HashMap;

import org.apache.log4j.Logger;

import com.carlmagnuson.routing.model.*;

public class TextGraphImport {
	
	private static Logger log = Logger.getInstance(TextGraphImport.class);
	
	public static Graph loadFromFile(String filename){
		File f = new File(filename);
		return loadFromFile(f);
	}

	public static Graph loadFromFile(File f){
		String s = f.getText();
		return loadFromString(s);
	}
	
	public static Graph loadFromString(String s){
		Graph g = new Graph();
		
		String[] lines = s.split("\n");
		for(String line: lines){
			
			log.trace("Processing line: "+line);
			
			//no need to parse these, we will get all info from the edges
			if(line.startsWith("c") || line.startsWith("n") || line.startsWith("p")){
				continue;
			}
			else if(line.startsWith("a")){
				String[] edgeParts = line.split(" ");
				
				int startNodeId = Integer.valueOf(edgeParts[1]);
				int endNodeId = Integer.valueOf(edgeParts[2]);
				if(g.getNode(startNodeId)==null){
					g.addNode(new Node(startNodeId));
				}
				if(g.getNode(endNodeId)==null){
					g.addNode(new Node(endNodeId));
				}
				
				Node start = g.getNode(startNodeId);
				Node end = g.getNode(endNodeId);
				HashMap<Integer, Integer> timeSeries = new HashMap<Integer, Integer>();
				for(int time=0; time+3<edgeParts.length; time++){
					timeSeries.put(time, (int)Double.valueOf(edgeParts[time+3]));
				}
				Edge e = new Edge(start, end, timeSeries);
				g.addEdge(e);
			}
			
		}
		
		return g;
	}

}
