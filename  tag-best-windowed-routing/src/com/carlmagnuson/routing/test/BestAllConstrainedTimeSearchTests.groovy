package com.carlmagnuson.routing.test;

import org.apache.log4j.*;
import com.carlmagnuson.routing.model.*;
import com.carlmagnuson.routing.util.*;
import com.carlmagnuson.routing.search.*;

class BestAllConstrainedTimeSearchTests extends GroovyTestCase {
	
	private static configured = false; 
	
	void setUp(){
		if (!configured){
			BasicConfigurator.configure(); 
			Logger.getRootLogger().setLevel(Level.DEBUG);
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
		Route r = BestAllConstrainedTime.findRoute(g, g.getNode(1), g.getNode(4), 0, 100, 0, 100);
		
		System.out.println(r);
		System.out.println("Search Time: "+((double)System.currentTimeMillis()-start)/1000);
		assert(r.getRouteString().equals("1->2->4"));
		assert(r.getTimeString().equals("3-4-4-5"));
	}
	
	void testMediumImport(){
		Graph g = TextGraphImport.loadFromFile("data/mpl20_30");
		
		long start = System.currentTimeMillis();
		Route r = BestAllConstrainedTime.findRoute(g, g.getNode(1), g.getNode(4), 0, 100, 0, 100);
		
		System.out.println(r);
		System.out.println("Search Time: "+((double)System.currentTimeMillis()-start)/1000);
		
	}
	
	void testLargeImport(){
		Graph g = TextGraphImport.loadFromFile("data/mpl30_100");
		
		long start = System.currentTimeMillis();
		Route r = BestAllConstrainedTime.findRoute(g, g.getNode(1), g.getNode(4), 20, 63, 20, 80);
		
		System.out.println(r);
		System.out.println("Search Time: "+((double)System.currentTimeMillis()-start)/1000);
		
	}
	
}