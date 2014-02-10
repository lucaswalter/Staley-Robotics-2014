package org.usfirst.frc4959.StaleyRobotics2014.subsystems;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc4959.StaleyRobotics2014.RobotMap;

/**
 * Lucas Wyland, Ian Collins, & Dustin
 */

public class CatapultRetractor extends Subsystem
    {

    private SpeedController catapultVictor = RobotMap.CatapultVictor;
    public DigitalInput checkRetractorSwitch = RobotMap.limitSwitch;

    public void initDefaultCommand()
        {
        }

    public void retract()
        {
        catapultVictor.set(0.3);
        }

    public void stop()
        {
        catapultVictor.set(0);
        }
    }
