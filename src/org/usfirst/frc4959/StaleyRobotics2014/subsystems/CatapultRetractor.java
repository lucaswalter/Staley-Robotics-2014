package org.usfirst.frc4959.StaleyRobotics2014.subsystems;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc4959.StaleyRobotics2014.RobotMap;

/**
 * Lucas Wyland, Ian Collins, & Dustin
 */

public class CatapultRetractor extends Subsystem
    {

    SpeedController catapultVictor = RobotMap.CatapultVictor;
    private boolean bHasTimerExpired;

    public void initDefaultCommand()
        {
        }
    
    public void retract()
        {
        catapultVictor.set(1);
        }
    
    public void timerSafety()
        {
        Timer.delay(2);
        bHasTimerExpired = true;
        }
    
    public boolean getSafetyTimer()
        {
        return bHasTimerExpired;
        }
    
    public void setSafetyTimer(boolean bHasTimerExpired)
        {
        this.bHasTimerExpired = bHasTimerExpired;
        }
    
    public void stop()
        {
        catapultVictor.set(0);
        }
    }
