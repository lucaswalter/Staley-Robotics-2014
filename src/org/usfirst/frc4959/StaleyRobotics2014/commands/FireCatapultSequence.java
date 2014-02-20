package org.usfirst.frc4959.StaleyRobotics2014.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc4959.StaleyRobotics2014.Robot;
import org.usfirst.frc4959.StaleyRobotics2014.RobotMap;

/**
 * @author Lucas Wyland & Ian Collins
 */

public class FireCatapultSequence extends Command {
    
    private static final Timer TIMER = new Timer();
    public boolean retractorSafety = RobotMap.retractorSafety;
    
    public FireCatapultSequence()
        {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        }

    // Called just before this Command runs the first time
    protected void initialize()
        {
        retractorSafety = false;
        Robot.shooter.fire();
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
        TIMER.start();
        
        while(TIMER.get() < 2.0)
            {
            // Does Nothing
            }       
        
        Robot.shooter.prime();
        retractorSafety = true;
        
        TIMER.stop();
        TIMER.reset();
        }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted()
        {
        }
    }
