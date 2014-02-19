package org.usfirst.frc4959.StaleyRobotics2014.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc4959.StaleyRobotics2014.Robot;

/**
 * @author Lucas Wyland & Ian Collins
 */

public class StopRetractCatapult extends Command
    {
    
    public StopRetractCatapult()
        {
        requires(Robot.catapultRetractor);
        }

    // Called just before this Command runs the first time
    protected void initialize()
        {
        Robot.catapultRetractor.stop();
        }

    // Called repeatedly when this Command is scheduled to run
    protected void execute()
        {
        }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished()
        {
        return true;
        }

    // Called once after isFinished returns true
    protected void end()
        {
        Robot.catapultRetractor.stop();
        }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted()
        {
        }
    }