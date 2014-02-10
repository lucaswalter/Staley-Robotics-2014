package org.usfirst.frc4959.StaleyRobotics2014.commands;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc4959.StaleyRobotics2014.Robot;
import org.usfirst.frc4959.StaleyRobotics2014.RobotMap;

/**
 * @author Lucas Wyland, Ian Collins, Dustin, & Saul
 */

public class RunCompressor extends Command
    {
    
    Relay compressorSpike = RobotMap.compressorSpike;
    DigitalInput pressureSwitch = RobotMap.pressureSwitch;
    
    public RunCompressor()
        {
        requires(Robot.shooter);
        }

    // Called just before this Command runs the first time
    protected void initialize()
        {
        }

    // Called repeatedly when this Command is scheduled to run
    protected void execute()
        {
        if(pressureSwitch.get() == false)
            {
            compressorSpike.set(Relay.Value.kOn);
            }
        else
            {
            compressorSpike.set(Relay.Value.kOff);
            }
        }

    // Make this return true when this Commrand no longer needs to run execute()
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
