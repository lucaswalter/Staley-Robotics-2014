package org.usfirst.frc4959.StaleyRobotics2014.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.Watchdog;
import edu.wpi.first.wpilibj.command.Command;

/**
 * @author Not Ian Collins
 */

public class IansSecret extends Command
    {
    
    Watchdog wilhelm;
    
    public IansSecret()
        {
        }

    // Called just before this Command runs the first time
    protected void initialize()
        {
        wilhelm.setEnabled(true);
        System.out.println("Wilhelm Lives");
        }

    // Called repeatedly when this Command is scheduled to run
    protected void execute()
        {
        wilhelm.kill();
        System.out.println("Wilhelm is kill");
        }

    // Make this return true when this Commrand no longer needs to run execute()
    protected boolean isFinished()
        {
        return true;
        }

    // Called once after isFinished returns true
    protected void end()
        {
        Timer.delay(5);
        wilhelm.setEnabled(false);
        System.out.println("Wilhelm will rise again");
        }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted()
        {
        }
    }
