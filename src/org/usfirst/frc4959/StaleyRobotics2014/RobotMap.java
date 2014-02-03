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
    public static SpeedController loaderVictor;
    public static Relay CatapultSpike;
    public static Relay FiringSpike;
    
    //Xbox Controller Bindings
    //TODO: Rework controller bindings
    public static final int A_BUTTON = 1;
    public static final int B_BUTTON = 2;
    public static final int X_BUTTON = 3;
    public static final int Y_BUTTON = 4;
    public static final int LEFT_BUMPER = 5;
    public static final int RIGHT_BUMPER = 6;
    public static final int BACK_BUTTON = 7;
    public static final int START_BUTTON = 8;
    public static final int LEFT_STICK_PRESS = 9;
    public static final int RIGHT_STICK_PRESS = 10;
    

    public static void init()
        {

        driveTrainRightVictor = new Victor(1, 1);
        driveTrainLeftVictor = new Victor(1, 2);
        loaderVictor = new Victor(1, 3);
        CatapultSpike = new Relay(1);
        FiringSpike = new Relay(2);
        
        LiveWindow.addActuator("Drive Train", "Right Victor", (Victor) driveTrainRightVictor);
        LiveWindow.addActuator("Drive Train", "Left Victor", (Victor) driveTrainLeftVictor);

        robotDriveTrain = new RobotDrive(driveTrainLeftVictor, driveTrainRightVictor);

        robotDriveTrain.setSafetyEnabled(true);
        robotDriveTrain.setExpiration(0.1);
        robotDriveTrain.setSensitivity(0.5);
        robotDriveTrain.setMaxOutput(1.0);

        }
    }
