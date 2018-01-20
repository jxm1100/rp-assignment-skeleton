package rp.assignments.individual.ex1;

import lejos.robotics.navigation.DifferentialPilot;
import rp.robotics.DifferentialDriveRobot;
import rp.robotics.MobileRobot;
import rp.systems.StoppableRunnable;

public class PentagonController implements StoppableRunnable {

	protected final DifferentialDriveRobot robot;
	protected final DifferentialPilot pilot;
	protected float sideLength;
	protected boolean isRunning = false;
	
	protected float rotate;
	
	public PentagonController(DifferentialDriveRobot robot, float sideLength) {
		this.robot = robot;
		this.pilot = robot.getDifferentialPilot();
		this.sideLength = sideLength;
		this.rotate = 72.0f;
	}

	@Override
	public void run() {
		
		isRunning = true;
		
		pilot.setTravelSpeed(pilot.getMaxTravelSpeed());
		
		while (isRunning) {
			pilot.travel(this.sideLength);
			pilot.rotate(rotate);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				stop();
				e.printStackTrace();
			}
		}
	}

	@Override
	public void stop() {
		isRunning = false;
	}

}
