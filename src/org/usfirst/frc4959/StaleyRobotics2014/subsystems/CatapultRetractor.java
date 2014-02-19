package org.usfirst.frc4959.StaleyRobotics2014.subsystems;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc4959.StaleyRobotics2014.RobotMap;

/**
 * Lucas Wyland, Ian Collins, & Dustin Klein
 */

public class CatapultRetractor extends Subsystem
    {

    SpeedController catapultVictor = RobotMap.CatapultVictor;
    DigitalInput limitSwitch = RobotMap.limitSwitch;

    public void initDefaultCommand()
        {
        }
    
    public void retract()
        {
        catapultVictor.set(1);
        }
    
    public void stop()
        {
        catapultVictor.set(0);
        }
    }
