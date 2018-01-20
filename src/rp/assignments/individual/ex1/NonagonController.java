package rp.assignments.individual.ex1;

import rp.robotics.DifferentialDriveRobot;

public class NonagonController extends PentagonController {

	public NonagonController(DifferentialDriveRobot robot, float sideLength) {
		super(robot, sideLength);
		this.rotate = 40.0f;
	}

}
