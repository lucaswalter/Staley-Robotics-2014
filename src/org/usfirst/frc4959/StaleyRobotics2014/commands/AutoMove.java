package org.usfirst.frc4959.StaleyRobotics2014.commands;

import edu.wpi.first.wpilibj.AnalogChannel;
import edu.wpi.first.wpilibj.Gyro;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc4959.StaleyRobotics2014.RobotMap;

/**
 * @author Dustin, Ian Collins, and Saul
 */

public class AutoMove extends Command
    {

    Gyro gyro = RobotMap.gyro;
    RobotDrive robotDrive = RobotMap.robotDriveTrain;
    AnalogChannel ultrasonic = RobotMap.ultrasonic;
    
    public AutoMove()
        {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        }

    // Called just before this Command runs the first time
    protected void initialize()
        {
        }

    // Called repeatedly when this Command is scheduled to run
    protected void execute()
        {
        gyro.reset();

        double angle = gyro.getAngle();
        
        robotDrive.arcadeDrive(1, -angle * 0.03);
        }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished()
        {
        // 4.9 mV/cm
        double range = ultrasonic.getVoltage() / 0.049;
        
        System.out.println(range + " cm");

        if (range < 20)
            {
            return true;
            } else {
            return false;
            }
        }

    // Called once after isFinished returns true
    protected void end()
        {
        robotDrive.stopMotor();
        }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted()
        {
        }
    }
