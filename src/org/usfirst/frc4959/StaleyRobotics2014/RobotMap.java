package org.usfirst.frc4959.StaleyRobotics2014;

import edu.wpi.first.wpilibj.AnalogChannel;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Gyro;
import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */

/**
 * @author Lucas Wyland
 */

public class RobotMap
    {

    public static RobotDrive robotDriveTrain;
    
    public static SpeedController driveTrainRightVictor;
    public static SpeedController driveTrainLeftVictor;
    public static SpeedController loaderVictor;
    public static SpeedController CatapultVictor;
    
    public static Relay FireSolenoidSpike;
    public static Relay PrimeSolenoidSpike;
    public static Relay compressorSpike;
    
    public static Compressor CompressorSpike;
    
    public static Gyro gyro;
    public static AnalogChannel ultrasonic;
    
    public static DigitalInput limitSwitch;
    public static DigitalInput pressureSwitch;
    
    //Xbox Controller Bindings
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
    public static final int XBOX_BUTTON = 11;
    
    public static boolean retractorSafety = true;

    public static void init()
        {
        
        driveTrainRightVictor = new Victor(1, 1);
        driveTrainLeftVictor = new Victor(1, 3);
        loaderVictor = new Victor(1, 2);
        CatapultVictor = new Victor(1, 4);  
        
        FireSolenoidSpike = new Relay(2);
        PrimeSolenoidSpike = new Relay(3);
        compressorSpike = new Relay(8);
        
        gyro = new Gyro(1);
        ultrasonic = new AnalogChannel(2);
        
        limitSwitch = new DigitalInput(3);
        pressureSwitch = new DigitalInput(2);
                
        LiveWindow.addActuator("Drive Train", "Right Victor", (Victor) driveTrainRightVictor);
        LiveWindow.addActuator("Drive Train", "Left Victor", (Victor) driveTrainLeftVictor);

        robotDriveTrain = new RobotDrive(driveTrainLeftVictor, driveTrainRightVictor);

        robotDriveTrain.setSafetyEnabled(false);
        robotDriveTrain.setExpiration(0.1);
        robotDriveTrain.setSensitivity(0.5);
        robotDriveTrain.setMaxOutput(1.0);
        }
    }
