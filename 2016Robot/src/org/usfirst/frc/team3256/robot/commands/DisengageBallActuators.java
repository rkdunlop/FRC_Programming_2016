package org.usfirst.frc.team3256.robot.commands;

import org.usfirst.frc.team3256.robot.Robot;
import org.usfirst.frc.team3256.robot.RobotMap;
import org.usfirst.frc.team3256.robot.subsystems.Shooter;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class DisengageBallActuators extends Command {
	
    public DisengageBallActuators() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.shooter);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	setTimeout(5);
    	Shooter.disengageBallActuators();
    	RobotMap.isShooting = true;
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	/*
    	System.out.println("Is timed out uninitialized " + this.isTimedOut());
    	if (this.isTimedOut())
    	{
    		System.out.println("DisengageActuators - creating a new timeout");
        	setTimeout(1);
    	}
    	*/
    		
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	System.out.println("BallActuators: " + isTimedOut());
        //return isTimedOut();
    	return true;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
