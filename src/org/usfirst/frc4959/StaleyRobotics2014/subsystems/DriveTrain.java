package org.usfirst.frc4959.StaleyRobotics2014.subsystems;

import edu.wpi.first.wpilibj.Gyro;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc4959.StaleyRobotics2014.RobotMap;
import org.usfirst.frc4959.StaleyRobotics2014.commands.DriveWithJoysticks;

/**
 * Lucas Wyland & Ian Collins
 */

public class DriveTrain extends Subsystem
    {

    SpeedController rightVictor = RobotMap.driveTrainRightVictor;
    SpeedController leftVictor = RobotMap.driveTrainLeftVictor;
    RobotDrive robotDrive = RobotMap.robotDriveTrain;
    Gyro gyro = RobotMap.gyro;
      
    private int sensitivityLevel = 5;
    
    public DriveTrain()
        {
        super();        
        gyro.setSensitivity(0.007);
        gyro.reset();
        }
    
    public void initDefaultCommand()
        {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
        setDefaultCommand(new DriveWithJoysticks());
        }

    public void falconDrive(double left, double right)
        {
        double moveValue = changeSpeed(-left, sensitivity(sensitivityLevel));
        double rotationValue = changeSpeed(-right, sensitivity(sensitivityLevel));
        
        robotDrive.arcadeDrive(moveValue, rotationValue);
        }
    
    public void stop()
        {
        robotDrive.drive(0, 0);
        }

    public void decreaseSensitivity()
        {
        if (sensitivityLevel > 1) 
            {
            sensitivityLevel--;
            }
        }
    //TODO: Lower gyro sensitivity
    public double gyroRotationAdjustment(double right)
        {
        if (right < 0.15 || right > -0.15)
            {
            return gyro.getAngle() * -0.03;
            } else {
            return right; 
            }
        }

    public void increaseSensitivity()
        {
        if (sensitivityLevel < 5)
            {
            sensitivityLevel++;
            }
        }
    
    public double sensitivity(int sensitivityLevel)
        {
        
        double sensitivity;

        switch (sensitivityLevel) {

            case 1:
                sensitivity = 0.6;
                break;
            case 2:
                sensitivity = 0.7;
                break;
            case 3:
                sensitivity = 0.8;
                break;
            case 4:
                sensitivity = 0.9;
                break;
            case 5:
                sensitivity = 1.0;
                break;
            default:
                sensitivity = 1.0;
                break;
        }
        return (sensitivity);
        }

    public static double changeSpeed(double input, double sensitivity)
        {
        return (sensitivity * input);
        }
    }
