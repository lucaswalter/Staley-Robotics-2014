package org.usfirst.frc4959.StaleyRobotics2014.commands;

import edu.wpi.first.wpilibj.AnalogChannel;
import edu.wpi.first.wpilibj.Gyro;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc4959.StaleyRobotics2014.RobotMap;

/**
 * @author Lucas Wyland, Dustin, Ian Collins, and Saul
 */

public class ShortAutoMove extends Command
    {

    Gyro gyro = RobotMap.gyro;
    RobotDrive robotDrive = RobotMap.robotDriveTrain;
    AnalogChannel ultrasonic = RobotMap.ultrasonic;
    
    private static final Timer TIMER = new Timer();
    
    public ShortAutoMove()
        {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        }

    // Called just before this Command runs the first time
    protected void initialize()
        {
        TIMER.start();
        System.out.println("Timer Started");
        }

    // Called repeatedly when this Command is scheduled to run
    protected void execute()
        {
        double angle = gyro.getAngle();
        robotDrive.tankDrive(0.421, 0.4); //Math.abs(angle) > 5 ? -angle : 0);
        System.out.println(angle);
        }
    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished()
        {
        while(TIMER.get() < 2.00)
            {
            return false;
            }   
        return true;
        }

    // Called once after isFinished returns true
    protected void end()
        {
        System.out.println("AutoMove Finished");
        robotDrive.tankDrive(-0.5, -0.5);
        Timer.delay(0.3);
        robotDrive.stopMotor();
        TIMER.stop();
        TIMER.reset();
        }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted()
        {
        }
    }
