package com.carlmagnuson.routing.test;

import junit.framework.TestCase;
import com.carlmagnuson.routing.util.*;
import com.carlmagnuson.routing.model.*;
import com.carlmagnuson.routing.search.*;
import org.apache.log4j.*;

public class RandomSearchTests extends TestCase {

	private static configured = false; 
	private static final int NUM_ITERATIONS = 30;
	
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
	
	void testTinyAllImport(){
		Graph g = TextGraphImport.loadFromFile("data/paperData");
		long start = System.currentTimeMillis();
		for(int i=0; i<NUM_ITERATIONS; i++){
			Node startNode = g.getNode((int)Math.ceil(Math.random()*g.getNodes().size()));
			Node endNode = g.getNode((int)Math.ceil(Math.random()*g.getNodes().size()));
			Route r = BestAllConstrainedTime.findRoute(g, startNode, endNode, 0, 100, 0, 100);
		}
		System.out.println("Tiny Graph All: "+NUM_ITERATIONS+" Iterations, Avg Search Time: "+((double)System.currentTimeMillis()-start)/(1000*NUM_ITERATIONS));
	}
	
	void testSmallerAllImport(){
		Graph g = TextGraphImport.loadFromFile("data/mpl05_240.txt");
		long start = System.currentTimeMillis();
		for(int i=0; i<NUM_ITERATIONS; i++){
			Node startNode = g.getNode((int)Math.ceil(Math.random()*g.getNodes().size()));
			Node endNode = g.getNode((int)Math.ceil(Math.random()*g.getNodes().size()));
			Route r = BestAllConstrainedTime.findRoute(g, startNode, endNode, 100, 220, 100, 220);
		}
		System.out.println("Smaller Graph All: "+NUM_ITERATIONS+" Iterations, Avg Search Time: "+((double)System.currentTimeMillis()-start)/(1000*NUM_ITERATIONS));
	}
	
	void testSmallAllImport(){
		Graph g = TextGraphImport.loadFromFile("data/mpl10_240.txt");
		long start = System.currentTimeMillis();
		for(int i=0; i<NUM_ITERATIONS; i++){
			Node startNode = g.getNode((int)Math.ceil(Math.random()*g.getNodes().size()));
			Node endNode = g.getNode((int)Math.ceil(Math.random()*g.getNodes().size()));
			Route r = BestAllConstrainedTime.findRoute(g, startNode, endNode, 100, 220, 100, 220);
		}
		System.out.println("Small Graph All: "+NUM_ITERATIONS+" Iterations, Avg Search Time: "+((double)System.currentTimeMillis()-start)/(1000*NUM_ITERATIONS));
	}
	
	void testMediumAllImport(){
		Graph g = TextGraphImport.loadFromFile("data/mpl20_240.txt");
		long start = System.currentTimeMillis();
		for(int i=0; i<NUM_ITERATIONS; i++){
			Node startNode = g.getNode((int)Math.ceil(Math.random()*g.getNodes().size()));
			Node endNode = g.getNode((int)Math.ceil(Math.random()*g.getNodes().size()));
			Route r = BestAllConstrainedTime.findRoute(g, startNode, endNode, 100, 220, 100, 220);
		}
		System.out.println("Medium Graph All: "+NUM_ITERATIONS+" Iterations, Avg Search Time: "+((double)System.currentTimeMillis()-start)/(1000*NUM_ITERATIONS));
	}
	
	void testLargeAllImport(){
		Graph g = TextGraphImport.loadFromFile("data/mpl30_240.txt");
		long start = System.currentTimeMillis();
		for(int i=0; i<NUM_ITERATIONS; i++){
			Node startNode = g.getNode((int)Math.ceil(Math.random()*g.getNodes().size()));
			Node endNode = g.getNode((int)Math.ceil(Math.random()*g.getNodes().size()));
			Route r = BestAllConstrainedTime.findRoute(g, startNode, endNode, 100, 220, 100, 220);
		}
		System.out.println("Large Graph All: "+NUM_ITERATIONS+" Iterations, Avg Search Time: "+((double)System.currentTimeMillis()-start)/(1000*NUM_ITERATIONS));
	}
	
	
	
	void testTinyImport(){
		Graph g = TextGraphImport.loadFromFile("data/paperData");
		long start = System.currentTimeMillis();
		for(int i=0; i<NUM_ITERATIONS; i++){
			Node startNode = g.getNode((int)Math.ceil(Math.random()*g.getNodes().size()));
			Node endNode = g.getNode((int)Math.ceil(Math.random()*g.getNodes().size()));
			Route r = Best.findRoute(g, startNode, endNode);
		}
		System.out.println("Tiny Graph: "+NUM_ITERATIONS+" Iterations, Avg Search Time: "+((double)System.currentTimeMillis()-start)/(1000*NUM_ITERATIONS));
	}
	
	void testSmallerImport(){
		Graph g = TextGraphImport.loadFromFile("data/mpl05_240.txt");
		long start = System.currentTimeMillis();
		for(int i=0; i<NUM_ITERATIONS; i++){
			Node startNode = g.getNode((int)Math.ceil(Math.random()*g.getNodes().size()));
			Node endNode = g.getNode((int)Math.ceil(Math.random()*g.getNodes().size()));
			Route r = Best.findRoute(g, startNode, endNode);
		}
		System.out.println("Smaller Graph: "+NUM_ITERATIONS+" Iterations, Avg Search Time: "+((double)System.currentTimeMillis()-start)/(1000*NUM_ITERATIONS));
	}
	
	void testSmallImport(){
		Graph g = TextGraphImport.loadFromFile("data/mpl10_240.txt");
		long start = System.currentTimeMillis();
		for(int i=0; i<NUM_ITERATIONS; i++){
			Node startNode = g.getNode((int)Math.ceil(Math.random()*g.getNodes().size()));
			Node endNode = g.getNode((int)Math.ceil(Math.random()*g.getNodes().size()));
			Route r = Best.findRoute(g, startNode, endNode);
		}
		System.out.println("Small Graph: "+NUM_ITERATIONS+" Iterations, Avg Search Time: "+((double)System.currentTimeMillis()-start)/(1000*NUM_ITERATIONS));
	}
	
	void testMediumImport(){
		Graph g = TextGraphImport.loadFromFile("data/mpl20_240.txt");
		long start = System.currentTimeMillis();
		for(int i=0; i<NUM_ITERATIONS; i++){
			Node startNode = g.getNode((int)Math.ceil(Math.random()*g.getNodes().size()));
			Node endNode = g.getNode((int)Math.ceil(Math.random()*g.getNodes().size()));
			Route r = Best.findRoute(g, startNode, endNode);
		}
		System.out.println("Medium Graph: "+NUM_ITERATIONS+" Iterations, Avg Search Time: "+((double)System.currentTimeMillis()-start)/(1000*NUM_ITERATIONS));
	}
	
	void testLargeImport(){
		Graph g = TextGraphImport.loadFromFile("data/mpl30_240.txt");
		long start = System.currentTimeMillis();
		for(int i=0; i<NUM_ITERATIONS; i++){
			Node startNode = g.getNode((int)Math.ceil(Math.random()*g.getNodes().size()));
			Node endNode = g.getNode((int)Math.ceil(Math.random()*g.getNodes().size()));
			Route r = Best.findRoute(g, startNode, endNode);
		}
		System.out.println("Large Graph: "+NUM_ITERATIONS+" Iterations, Avg Search Time: "+((double)System.currentTimeMillis()-start)/(1000*NUM_ITERATIONS));
	}
}
