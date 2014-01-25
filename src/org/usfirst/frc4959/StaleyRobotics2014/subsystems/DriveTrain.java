package org.usfirst.frc4959.StaleyRobotics2014.subsystems;

import org.usfirst.frc4959.StaleyRobotics2014.RobotMap;
import org.usfirst.frc4959.StaleyRobotics2014.commands.*;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * Lucas Walter, what a hack
 */
public class DriveTrain extends Subsystem
    {

    SpeedController rightVictor = RobotMap.driveTrainRightVictor;
    SpeedController leftVictor = RobotMap.driveTrainLeftVictor;
    RobotDrive robotDrive = RobotMap.robotDriveTrain;
    
    // Has the sensitivity set to highest when it starts up.
    private int sensitivityLevel = 5;

     //Put methods for controlling this subsystem
    // here. Call these from Commands.
    public void initDefaultCommand()
        {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
        setDefaultCommand(new DriveWithJoysticks());

        }

    public void falconDrive(double left, double right)
        {
        double leftPower = changeSpeed(left, sensitivity(sensitivityLevel));
        double rightPower = changeSpeed(right, sensitivity(sensitivityLevel));
        robotDrive.tankDrive(leftPower, rightPower);
        }

    public void takeJoystickInputs(double left, double right)
        {
        falconDrive(left, right);
        }

    public void stop()
        {
        robotDrive.drive(0, 0);
        }

    public void decreaseSensitivity()
        {
        if (sensitivityLevel > 1) {
            sensitivityLevel--;
        }
        }

    public void increaseSensitivity()
        {
        if (sensitivityLevel < 5) {
            sensitivityLevel++;
        }
        }

    /**
     * This method brought to you by Ian Eugene Collins and from contributions from viewers like you
     * Thank You!
     */
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
