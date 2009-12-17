package com.carlmagnuson.routing.test;

import junit.framework.TestCase;
import com.carlmagnuson.routing.util.*;
import com.carlmagnuson.routing.model.*;
import com.carlmagnuson.routing.search.*;
import org.apache.log4j.*;

public class RandomSearchTests extends TestCase {

	private static configured = false; 
	private static final int NUM_ITERATIONS = 20;
	
	void setUp(){
		if (!configured){
			BasicConfigurator.configure(); 
			Logger.getRootLogger().setLevel(Level.WARN);
			configured = true; 
		}
	}
	
	void tearDown(){
		if (configured) { 
			LogManager.shutdown(); 
			configured = false; 
		} 
	}
	
	void testSmallImport(){
		Graph g = TextGraphImport.loadFromFile("data/paperData");
		long start = System.currentTimeMillis();
		for(int i=0; i<NUM_ITERATIONS; i++){
			Node startNode = g.getNode((int)Math.ceil(Math.random()*g.getNodes().size()));
			Node endNode = g.getNode((int)Math.ceil(Math.random()*g.getNodes().size()));
			Route r = BestConstrainedTime.findRoute(g, startNode, endNode, 0, 100);
		}
		System.out.println("Small Graph: "+NUM_ITERATIONS+" Iterations, Avg Search Time: "+((double)System.currentTimeMillis()-start)/(1000*NUM_ITERATIONS));
	}
	
	void testMediumImport(){
		Graph g = TextGraphImport.loadFromFile("data/mpl20_30");
		long start = System.currentTimeMillis();
		for(int i=0; i<NUM_ITERATIONS; i++){
			Node startNode = g.getNode((int)Math.ceil(Math.random()*g.getNodes().size()));
			Node endNode = g.getNode((int)Math.ceil(Math.random()*g.getNodes().size()));
			Route r = BestConstrainedTime.findRoute(g, startNode, endNode, 0, 100);
		}
		System.out.println("Medium Graph: "+NUM_ITERATIONS+" Iterations, Avg Search Time: "+((double)System.currentTimeMillis()-start)/(1000*NUM_ITERATIONS));
	}
	
	void testLargeImport(){
		Graph g = TextGraphImport.loadFromFile("data/mpl30_100");
		long start = System.currentTimeMillis();
		for(int i=0; i<NUM_ITERATIONS; i++){
			Node startNode = g.getNode((int)Math.ceil(Math.random()*g.getNodes().size()));
			Node endNode = g.getNode((int)Math.ceil(Math.random()*g.getNodes().size()));
			Route r = BestConstrainedTime.findRoute(g, startNode, endNode, 0, 100);
		}
		System.out.println("Large Graph: "+NUM_ITERATIONS+" Iterations, Avg Search Time: "+((double)System.currentTimeMillis()-start)/(1000*NUM_ITERATIONS));
	}
	
}
