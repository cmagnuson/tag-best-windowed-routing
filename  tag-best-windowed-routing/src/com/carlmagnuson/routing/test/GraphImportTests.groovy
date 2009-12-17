package com.carlmagnuson.routing.test;

import org.apache.log4j.*;
import com.carlmagnuson.routing.model.*;
import com.carlmagnuson.routing.util.*;

class GraphImportTests extends GroovyTestCase {
	
	void setUp(){
		BasicConfigurator.configure();
		Logger.getRootLogger().setLevel(Level.DEBUG);
	}
	
	void testImport(){
		Graph g = TextGraphImport.loadFromFile("data/mpl30_100");
		assert(g.numEdges()==2106)
		assert(g.numNodes()==786)
	}
}