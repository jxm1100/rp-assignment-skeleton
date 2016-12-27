package rp.assignments.individual.ex1;

import rp.robotics.testing.RobotTest;
import rp.robotics.testing.TestViewer;

/**
 * This class gives you an example of how to visualise a controller running in a
 * test.
 * 
 * @author Nick Hawes
 *
 */
public class ViewTest {

	public static void main(String[] args) throws ClassNotFoundException {

		// Instantiate the tests
		Ex1Tests tests = new Ex1Tests();

		// Create the test object plus the controller for the test (via
		// SolutionFactory)
		RobotTest<?> test = tests.createVirtualBumperTest();

		// Create the visualisation of the test, then run everything
		TestViewer demo = new TestViewer(test, test.getSimulation());
		demo.run();
	}

}
