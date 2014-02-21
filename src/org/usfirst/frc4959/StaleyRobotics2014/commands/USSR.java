package org.usfirst.frc4959.StaleyRobotics2014.commands;

import edu.wpi.first.wpilibj.AnalogChannel;
import edu.wpi.first.wpilibj.Gyro;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc4959.StaleyRobotics2014.RobotMap;

/**
 * @author Sir Ian Collins
 */

public class USSR extends Command
    {

    AnalogChannel ultrasonic = RobotMap.ultrasonic;
    Gyro gyro = RobotMap.gyro;
    
    public USSR()
        {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        }

    // Called just before this Command runs the first time
    protected void initialize()
        {
        //gyro.reset();
        //ultrasonic.getChannel();
        //System.out.print(ultrasonic.getChannel());
        }

    // Called repeatedly when this Command is scheduled to run
    protected void execute()
        {
        // 4.9 mV/cm
        //double voltage = ultrasonic.getVoltage();
        //double range = ((voltage / 0.009766) * 2) + 2;
        
        //System.out.println(voltage + " V");
        System.out.println(gyro.getAngle());
        //System.out.println((int)range + " Centimeters");
        //System.out.println(voltage);
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
