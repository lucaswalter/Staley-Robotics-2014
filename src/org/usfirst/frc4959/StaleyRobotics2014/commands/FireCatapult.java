package org.usfirst.frc4959.StaleyRobotics2014.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc4959.StaleyRobotics2014.Robot;
import org.usfirst.frc4959.StaleyRobotics2014.RobotMap;

/**
 * @author Dustin, Saul, Ian Collins, & Lucas Wyland
 */

public class FireCatapult extends Command{
    
    boolean retractorSafety = RobotMap.retractorSafety;
    
    public FireCatapult()
        {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        }

    // Called just before this Command runs the first time
    protected void initialize()
        {
        System.out.println("retractorSafety: " + retractorSafety);
        }

    // Called repeatedly when this Command is scheduled to run
    protected void execute()
        {
        Robot.shooter.fire();
        }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished()
        {
        return true;
        }

    // Called once after isFinished returns true
    protected void end()
        {
        retractorSafety = false;
        }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted()
        {
        }
    }
