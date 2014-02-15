package org.usfirst.frc4959.StaleyRobotics2014.commands;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc4959.StaleyRobotics2014.Robot;
import org.usfirst.frc4959.StaleyRobotics2014.RobotMap;

/**
 * @author Lucas Wyland & Ian Collins
 */

public class RetractCatapult extends Command
    {

    boolean retractorSafety = RobotMap.retractorSafety;
    DigitalInput limitSwitch = RobotMap.limitSwitch;
    
    public RetractCatapult()
        {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        requires(Robot.retractor);
        }

    // Called just before this Command runs the first time
    protected void initialize()
        {
        // Robot.retractor.timerSafety();
        }

    // Called repeatedly when this Command is scheduled to run
    protected void execute()
        {
       // if (true)
            Robot.retractor.retract();
            //}
        }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished()
        {
//        if (limitSwitch.get() || Robot.retractor.getSafetyTimer())
//            {
//            Robot.retractor.setSafetyTimer(false);
//            return true;
//            } else {
//            return false;
//            }
        
        return limitSwitch.get();
        }

    // Called once after isFinished returns true
    protected void end()
        {
        Robot.retractor.stop();
        }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted()
        {
        }
    }