package org.usfirst.frc4959.StaleyRobotics2014;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import java.util.Vector;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap
    {

    public static RobotDrive robotDriveTrain;
    public static SpeedController driveTrainRightVictor;
    public static SpeedController driveTrainLeftVictor;
    public static Relay CatapultSpike;
    
    //Xbox Controller Bindings
    public static final int LEFT_BUMPER = 5;
    public static final int RIGHT_BUMPER = 6;
    public static final int A_BUTTON = 1;

    public static void init()
        {

        driveTrainRightVictor = new Victor(1, 1);
        driveTrainLeftVictor = new Victor(1, 2);
        CatapultSpike = new Relay(1);

        LiveWindow.addActuator("Drive Train", "Right Victor", (Victor) driveTrainRightVictor);
        LiveWindow.addActuator("Drive Train", "Left Victor", (Victor) driveTrainLeftVictor);

        robotDriveTrain = new RobotDrive(driveTrainLeftVictor, driveTrainRightVictor);

        //robotDriveTrain.setInvertedMotor(RobotDrive.MotorType.kRearRight, true);
        //robotDriveTrain.setInvertedMotor(RobotDrive.MotorType.kRearLeft, true);
        robotDriveTrain.setSafetyEnabled(true);
        robotDriveTrain.setExpiration(0.1);
        robotDriveTrain.setSensitivity(0.5);
        robotDriveTrain.setMaxOutput(1.0);

        }
    }
