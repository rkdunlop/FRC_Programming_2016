package org.usfirst.frc.team3256.robot.commands;

import org.usfirst.frc.team3256.robot.subsystems.DriveTrain;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class AutonomousNoLowBar extends CommandGroup {
    
    public  AutonomousNoLowBar() {
    	setInterruptible(false);
        DriveTrain.resetGyro();
        DriveTrain.resetEncoders();
        addSequential(new CatapultWinchAutomatic());
        addSequential(new EngageBallActuators());
        addSequential(new ShiftUp());
        addSequential(new PIDMoveForwardFast(30));
        addSequential(new IntakePosAuto());
        addSequential(new PIDMoveForward(125));
        addSequential(new DisengageBallActuators());
    }
}
