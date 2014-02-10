package org.usfirst.frc4959.StaleyRobotics2014.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc4959.StaleyRobotics2014.Robot;

/**
 * @author Dustin, AutoBrett, and Saul
 */
public class InitialMove extends Command
    {

    public InitialMove()
        {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        }

    // Called just before this Command runs the first time
    protected void initialize()
        {
        }

    // Called repeatedly when this Command is scheduled to run
    protected void execute()
        {
        Robot.driveTrain.falconDrive(0.5, 0);
        }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished()
        {
        return true;
        }

    // Called once after isFinished returns true
    protected void end()
        {
        }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted()
        {
        }
    }
