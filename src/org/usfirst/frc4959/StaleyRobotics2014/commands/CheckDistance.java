/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.usfirst.frc4959.StaleyRobotics2014.commands;

import edu.wpi.first.wpilibj.AnalogChannel;
import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc4959.StaleyRobotics2014.RobotMap;

/**
 * @author Lucas Wyland
 */
public class CheckDistance extends Command
    {
    
    AnalogChannel ultrasonic = RobotMap.ultrasonic;
    Relay lightSpike = RobotMap.lightSpike;
    
    // Called just before this Command runs the first time
    protected void initialize()
        {
        }

    // Called repeatedly when this Command is scheduled to run
    protected void execute()
        {
        // 4.9 mV/cm
        double voltage = ultrasonic.getVoltage();
        double range = (((voltage / 0.009766) * 2) + 2);
        
        System.out.println(range);
        //lightSpike.set(Relay.Value.kOn);
        //lightSpike.set(Relay.Value.kOff);
        //Accurate range 4-7, 11-13.5
        //14 Feet Ideal Range
        if((range < 213 && range > 123) || (range < 411 && range > 335))
            {
            lightSpike.set(Relay.Value.kOn);
            } else
            {
            lightSpike.set(Relay.Value.kOff);
            }
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
