package com.carlmagnuson.routing.test;

import junit.framework.TestCase;
import com.carlmagnuson.routing.util.*;
import com.carlmagnuson.routing.model.*;
import com.carlmagnuson.routing.search.*;
import org.apache.log4j.*;

public class RandomSearchVaryingWindowTests extends TestCase {

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
	
	void testSmallerAllImport240(){
		Graph g = TextGraphImport.loadFromFile("data/mpl05_240.txt");
		long start = System.currentTimeMillis();
		for(int i=0; i<NUM_ITERATIONS; i++){
			Node startNode = g.getNode((int)Math.ceil(Math.random()*g.getNodes().size()));
			Node endNode = g.getNode((int)Math.ceil(Math.random()*g.getNodes().size()));
			Route r = BestAllConstrainedTime.findRoute(g, startNode, endNode, 0, 240, 0, 240);
		}
		System.out.println("Smaller Graph All 240: "+NUM_ITERATIONS+" Iterations, Avg Search Time: "+((double)System.currentTimeMillis()-start)/(1000*NUM_ITERATIONS));
	}
	
	void testSmallerAllImport120(){
		Graph g = TextGraphImport.loadFromFile("data/mpl05_240.txt");
		long start = System.currentTimeMillis();
		for(int i=0; i<NUM_ITERATIONS; i++){
			Node startNode = g.getNode((int)Math.ceil(Math.random()*g.getNodes().size()));
			Node endNode = g.getNode((int)Math.ceil(Math.random()*g.getNodes().size()));
			Route r = BestAllConstrainedTime.findRoute(g, startNode, endNode, 0, 120, 0, 120);
		}
		System.out.println("Smaller Graph All 120: "+NUM_ITERATIONS+" Iterations, Avg Search Time: "+((double)System.currentTimeMillis()-start)/(1000*NUM_ITERATIONS));
	}
	
	void testSmallerAllImport60(){
		Graph g = TextGraphImport.loadFromFile("data/mpl05_240.txt");
		long start = System.currentTimeMillis();
		for(int i=0; i<NUM_ITERATIONS; i++){
			Node startNode = g.getNode((int)Math.ceil(Math.random()*g.getNodes().size()));
			Node endNode = g.getNode((int)Math.ceil(Math.random()*g.getNodes().size()));
			Route r = BestAllConstrainedTime.findRoute(g, startNode, endNode, 0, 60, 0, 60);
		}
		System.out.println("Smaller Graph All 60: "+NUM_ITERATIONS+" Iterations, Avg Search Time: "+((double)System.currentTimeMillis()-start)/(1000*NUM_ITERATIONS));
	}
	
	void testSmallerAllImport30(){
		Graph g = TextGraphImport.loadFromFile("data/mpl05_240.txt");
		long start = System.currentTimeMillis();
		for(int i=0; i<NUM_ITERATIONS; i++){
			Node startNode = g.getNode((int)Math.ceil(Math.random()*g.getNodes().size()));
			Node endNode = g.getNode((int)Math.ceil(Math.random()*g.getNodes().size()));
			Route r = BestAllConstrainedTime.findRoute(g, startNode, endNode, 0, 30, 0, 30);
		}
		System.out.println("Smaller Graph All 30: "+NUM_ITERATIONS+" Iterations, Avg Search Time: "+((double)System.currentTimeMillis()-start)/(1000*NUM_ITERATIONS));
	}
	
	void testSmallerAllImport15(){
		Graph g = TextGraphImport.loadFromFile("data/mpl05_240.txt");
		long start = System.currentTimeMillis();
		for(int i=0; i<NUM_ITERATIONS; i++){
			Node startNode = g.getNode((int)Math.ceil(Math.random()*g.getNodes().size()));
			Node endNode = g.getNode((int)Math.ceil(Math.random()*g.getNodes().size()));
			Route r = BestAllConstrainedTime.findRoute(g, startNode, endNode, 0, 15, 0, 15);
		}
		System.out.println("Smaller Graph All 15: "+NUM_ITERATIONS+" Iterations, Avg Search Time: "+((double)System.currentTimeMillis()-start)/(1000*NUM_ITERATIONS));
	}
	
	void testSmallAllImport240(){
		Graph g = TextGraphImport.loadFromFile("data/mpl10_240.txt");
		long start = System.currentTimeMillis();
		for(int i=0; i<NUM_ITERATIONS; i++){
			Node startNode = g.getNode((int)Math.ceil(Math.random()*g.getNodes().size()));
			Node endNode = g.getNode((int)Math.ceil(Math.random()*g.getNodes().size()));
			Route r = BestAllConstrainedTime.findRoute(g, startNode, endNode, 0, 240, 0, 240);
		}
		System.out.println("Small Graph All 240: "+NUM_ITERATIONS+" Iterations, Avg Search Time: "+((double)System.currentTimeMillis()-start)/(1000*NUM_ITERATIONS));
	}

	void testSmallAllImport120(){
		Graph g = TextGraphImport.loadFromFile("data/mpl10_240.txt");
		long start = System.currentTimeMillis();
		for(int i=0; i<NUM_ITERATIONS; i++){
			Node startNode = g.getNode((int)Math.ceil(Math.random()*g.getNodes().size()));
			Node endNode = g.getNode((int)Math.ceil(Math.random()*g.getNodes().size()));
			Route r = BestAllConstrainedTime.findRoute(g, startNode, endNode, 0, 120, 0, 120);
		}
		System.out.println("Small Graph All 120: "+NUM_ITERATIONS+" Iterations, Avg Search Time: "+((double)System.currentTimeMillis()-start)/(1000*NUM_ITERATIONS));
	}
	
	void testSmallAllImport60(){
		Graph g = TextGraphImport.loadFromFile("data/mpl10_240.txt");
		long start = System.currentTimeMillis();
		for(int i=0; i<NUM_ITERATIONS; i++){
			Node startNode = g.getNode((int)Math.ceil(Math.random()*g.getNodes().size()));
			Node endNode = g.getNode((int)Math.ceil(Math.random()*g.getNodes().size()));
			Route r = BestAllConstrainedTime.findRoute(g, startNode, endNode, 0, 60, 0, 60);
		}
		System.out.println("Small Graph All 60: "+NUM_ITERATIONS+" Iterations, Avg Search Time: "+((double)System.currentTimeMillis()-start)/(1000*NUM_ITERATIONS));
	}
	
	void testSmallAllImport30(){
		Graph g = TextGraphImport.loadFromFile("data/mpl10_240.txt");
		long start = System.currentTimeMillis();
		for(int i=0; i<NUM_ITERATIONS; i++){
			Node startNode = g.getNode((int)Math.ceil(Math.random()*g.getNodes().size()));
			Node endNode = g.getNode((int)Math.ceil(Math.random()*g.getNodes().size()));
			Route r = BestAllConstrainedTime.findRoute(g, startNode, endNode, 0, 30, 0, 30);
		}
		System.out.println("Small Graph All 30: "+NUM_ITERATIONS+" Iterations, Avg Search Time: "+((double)System.currentTimeMillis()-start)/(1000*NUM_ITERATIONS));
	}
	
	void testSmallAllImport15(){
		Graph g = TextGraphImport.loadFromFile("data/mpl10_240.txt");
		long start = System.currentTimeMillis();
		for(int i=0; i<NUM_ITERATIONS; i++){
			Node startNode = g.getNode((int)Math.ceil(Math.random()*g.getNodes().size()));
			Node endNode = g.getNode((int)Math.ceil(Math.random()*g.getNodes().size()));
			Route r = BestAllConstrainedTime.findRoute(g, startNode, endNode, 0, 15, 0, 15);
		}
		System.out.println("Small Graph All 15: "+NUM_ITERATIONS+" Iterations, Avg Search Time: "+((double)System.currentTimeMillis()-start)/(1000*NUM_ITERATIONS));
	}
	
	void testMediumAllImport240(){
		Graph g = TextGraphImport.loadFromFile("data/mpl20_240.txt");
		long start = System.currentTimeMillis();
		for(int i=0; i<NUM_ITERATIONS; i++){
			Node startNode = g.getNode((int)Math.ceil(Math.random()*g.getNodes().size()));
			Node endNode = g.getNode((int)Math.ceil(Math.random()*g.getNodes().size()));
			Route r = BestAllConstrainedTime.findRoute(g, startNode, endNode, 0, 240, 0, 240);
		}
		System.out.println("Medium Graph All 240: "+NUM_ITERATIONS+" Iterations, Avg Search Time: "+((double)System.currentTimeMillis()-start)/(1000*NUM_ITERATIONS));
	}
	
	void testMediumAllImport120(){
		Graph g = TextGraphImport.loadFromFile("data/mpl20_240.txt");
		long start = System.currentTimeMillis();
		for(int i=0; i<NUM_ITERATIONS; i++){
			Node startNode = g.getNode((int)Math.ceil(Math.random()*g.getNodes().size()));
			Node endNode = g.getNode((int)Math.ceil(Math.random()*g.getNodes().size()));
			Route r = BestAllConstrainedTime.findRoute(g, startNode, endNode, 0, 120, 0, 120);
		}
		System.out.println("Medium Graph All 120: "+NUM_ITERATIONS+" Iterations, Avg Search Time: "+((double)System.currentTimeMillis()-start)/(1000*NUM_ITERATIONS));
	}
	
	void testMediumAllImport60(){
		Graph g = TextGraphImport.loadFromFile("data/mpl20_240.txt");
		long start = System.currentTimeMillis();
		for(int i=0; i<NUM_ITERATIONS; i++){
			Node startNode = g.getNode((int)Math.ceil(Math.random()*g.getNodes().size()));
			Node endNode = g.getNode((int)Math.ceil(Math.random()*g.getNodes().size()));
			Route r = BestAllConstrainedTime.findRoute(g, startNode, endNode, 0, 60, 0, 60);
		}
		System.out.println("Medium Graph All 60: "+NUM_ITERATIONS+" Iterations, Avg Search Time: "+((double)System.currentTimeMillis()-start)/(1000*NUM_ITERATIONS));
	}
	
	void testMediumAllImport30(){
		Graph g = TextGraphImport.loadFromFile("data/mpl20_240.txt");
		long start = System.currentTimeMillis();
		for(int i=0; i<NUM_ITERATIONS; i++){
			Node startNode = g.getNode((int)Math.ceil(Math.random()*g.getNodes().size()));
			Node endNode = g.getNode((int)Math.ceil(Math.random()*g.getNodes().size()));
			Route r = BestAllConstrainedTime.findRoute(g, startNode, endNode, 0, 30, 0, 30);
		}
		System.out.println("Medium Graph All 30: "+NUM_ITERATIONS+" Iterations, Avg Search Time: "+((double)System.currentTimeMillis()-start)/(1000*NUM_ITERATIONS));
	}
	
	void testMediumAllImport15(){
		Graph g = TextGraphImport.loadFromFile("data/mpl20_240.txt");
		long start = System.currentTimeMillis();
		for(int i=0; i<NUM_ITERATIONS; i++){
			Node startNode = g.getNode((int)Math.ceil(Math.random()*g.getNodes().size()));
			Node endNode = g.getNode((int)Math.ceil(Math.random()*g.getNodes().size()));
			Route r = BestAllConstrainedTime.findRoute(g, startNode, endNode, 0, 15, 0, 15);
		}
		System.out.println("Medium Graph All 15: "+NUM_ITERATIONS+" Iterations, Avg Search Time: "+((double)System.currentTimeMillis()-start)/(1000*NUM_ITERATIONS));
	}
	
	void testLargeAllImport240(){
		Graph g = TextGraphImport.loadFromFile("data/mpl30_240.txt");
		long start = System.currentTimeMillis();
		for(int i=0; i<NUM_ITERATIONS; i++){
			Node startNode = g.getNode((int)Math.ceil(Math.random()*g.getNodes().size()));
			Node endNode = g.getNode((int)Math.ceil(Math.random()*g.getNodes().size()));
			Route r = BestAllConstrainedTime.findRoute(g, startNode, endNode, 0, 240, 0, 240);
		}
		System.out.println("Large Graph All 240: "+NUM_ITERATIONS+" Iterations, Avg Search Time: "+((double)System.currentTimeMillis()-start)/(1000*NUM_ITERATIONS));
	}
	
	void testLargeAllImport120(){
		Graph g = TextGraphImport.loadFromFile("data/mpl30_240.txt");
		long start = System.currentTimeMillis();
		for(int i=0; i<NUM_ITERATIONS; i++){
			Node startNode = g.getNode((int)Math.ceil(Math.random()*g.getNodes().size()));
			Node endNode = g.getNode((int)Math.ceil(Math.random()*g.getNodes().size()));
			Route r = BestAllConstrainedTime.findRoute(g, startNode, endNode, 0, 120, 0, 120);
		}
		System.out.println("Large Graph All 120: "+NUM_ITERATIONS+" Iterations, Avg Search Time: "+((double)System.currentTimeMillis()-start)/(1000*NUM_ITERATIONS));
	}
	
	void testLargeAllImport60(){
		Graph g = TextGraphImport.loadFromFile("data/mpl30_240.txt");
		long start = System.currentTimeMillis();
		for(int i=0; i<NUM_ITERATIONS; i++){
			Node startNode = g.getNode((int)Math.ceil(Math.random()*g.getNodes().size()));
			Node endNode = g.getNode((int)Math.ceil(Math.random()*g.getNodes().size()));
			Route r = BestAllConstrainedTime.findRoute(g, startNode, endNode, 0, 60, 0, 60);
		}
		System.out.println("Large Graph All 60: "+NUM_ITERATIONS+" Iterations, Avg Search Time: "+((double)System.currentTimeMillis()-start)/(1000*NUM_ITERATIONS));
	}
	
	void testLargeAllImport30(){
		Graph g = TextGraphImport.loadFromFile("data/mpl30_240.txt");
		long start = System.currentTimeMillis();
		for(int i=0; i<NUM_ITERATIONS; i++){
			Node startNode = g.getNode((int)Math.ceil(Math.random()*g.getNodes().size()));
			Node endNode = g.getNode((int)Math.ceil(Math.random()*g.getNodes().size()));
			Route r = BestAllConstrainedTime.findRoute(g, startNode, endNode, 0, 30, 0, 30);
		}
		System.out.println("Large Graph All 30: "+NUM_ITERATIONS+" Iterations, Avg Search Time: "+((double)System.currentTimeMillis()-start)/(1000*NUM_ITERATIONS));
	}
	
	void testLargeAllImport15(){
		Graph g = TextGraphImport.loadFromFile("data/mpl30_240.txt");
		long start = System.currentTimeMillis();
		for(int i=0; i<NUM_ITERATIONS; i++){
			Node startNode = g.getNode((int)Math.ceil(Math.random()*g.getNodes().size()));
			Node endNode = g.getNode((int)Math.ceil(Math.random()*g.getNodes().size()));
			Route r = BestAllConstrainedTime.findRoute(g, startNode, endNode, 0, 15, 0, 15);
		}
		System.out.println("Large Graph All 15: "+NUM_ITERATIONS+" Iterations, Avg Search Time: "+((double)System.currentTimeMillis()-start)/(1000*NUM_ITERATIONS));
	}
	
}
