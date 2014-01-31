package org.usfirst.frc4959.StaleyRobotics2014.subsystems;

/**
 * @author Saul and Dustin
 */

import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc4959.StaleyRobotics2014.RobotMap;

public class Shooter extends Subsystem
{
    
    private Relay firingSpike = RobotMap.FiringSpike;
    
     public void initDefaultCommand()
     {
         // Set the default command for a subsystem here.
         //setDefaultCommand(new MySpecialCommand());
     }
     
     public void fire()
     {
         firingSpike.set(Relay.Value.kOn);
     }  
     
     public void reload()
     {
         firingSpike.set(Relay.Value.kOff);
     }
}