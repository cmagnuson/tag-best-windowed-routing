package com.carlmagnuson.routing.test;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite(
				"Test for com.carlmagnuson.routing.test");
		//$JUnit-BEGIN$
		suite.addTest(AllTests.suite());
		suite.addTestSuite(BestConstrainedTimeSearchTests.class);
		suite.addTestSuite(BestSearchTests.class);
		suite.addTestSuite(RandomSearchVaryingWindowTests.class);
		suite.addTestSuite(BestAllConstrainedTimeSearchTests.class);
		suite.addTestSuite(RandomSearchTests.class);
		suite.addTestSuite(GraphImportTests.class);
		//$JUnit-END$
		return suite;
	}

}
