package rp.assignments.individual.ex1;

import rp.robotics.DifferentialDriveRobot;

public class OctagonController extends PentagonController {

	public OctagonController(DifferentialDriveRobot robot, float sideLength) {
		super(robot, sideLength);
		this.rotate = 45.0f;
	}

}