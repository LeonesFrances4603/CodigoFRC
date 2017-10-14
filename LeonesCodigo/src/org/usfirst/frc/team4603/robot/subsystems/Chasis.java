package org.usfirst.frc.team4603.robot.subsystems;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Chasis extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	Talon brazo = new Talon(1);
    	RobotDrive arcadeDrive = RobotDrive(2,3);
    }

	private RobotDrive RobotDrive(int i, int j) {
		// TODO Auto-generated method stub
		return null;
	}
	public void runChsis() {
	arcadeDrive.
	}
	

	}


