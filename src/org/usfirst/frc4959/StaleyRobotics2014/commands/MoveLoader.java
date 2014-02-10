package org.usfirst.frc4959.StaleyRobotics2014.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc4959.StaleyRobotics2014.Robot;

/**
 * @author Ian Collins & Lucas Wyland
 */

public class MoveLoader extends Command
    {
    
    public MoveLoader()
        {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        requires(Robot.loader);
        }
    
    // Called Just before this Command runs for the first time
    protected void initialize()
        {
        }

    // Called repeatedly when this Command is scheduled to run
    protected void execute()
        {
        Robot.loader.moveLoader(Robot.oi.getTriggers());
        }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished()
        {
        return false;
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
