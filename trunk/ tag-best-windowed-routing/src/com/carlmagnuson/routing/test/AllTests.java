package com.carlmagnuson.routing.test;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite(
				"Test for com.carlmagnuson.routing.test");
		//$JUnit-BEGIN$
		suite.addTestSuite(GraphImportTests.class);
		suite.addTestSuite(BestSearchTests.class);
		suite.addTestSuite(BestConstrainedTimeSearchTests.class);
		//$JUnit-END$
		return suite;
	}

}
