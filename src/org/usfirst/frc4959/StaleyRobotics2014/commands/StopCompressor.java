package org.usfirst.frc4959.StaleyRobotics2014.commands;

import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc4959.StaleyRobotics2014.Robot;
import org.usfirst.frc4959.StaleyRobotics2014.RobotMap;

/**
 * @author Lucas Wyland, Ian, Dustin, & Saul
 */
public class StopCompressor extends Command
    {
    
    Relay spikeRelayTest = RobotMap.compressorSpike;
    public StopCompressor()
        {
        // Use requires() here to declare subsystem dependencies
        requires(Robot.shooter);
        }

    // Called just before this Command runs the first time
    protected void initialize()
        {
        //Robot.airCompressor.start();
        //spikeRelayTest.set(Relay.Value.kOff);
        }

    // Called repeatedly when this Command is scheduled to run
    protected void execute()
        {
        spikeRelayTest.set(Relay.Value.kOff);
        }

    // Make this return true when this Commrand no longer needs to run execute()
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
        //spikeRelayTest.set(Relay.Value.kOn);
        }
    }
