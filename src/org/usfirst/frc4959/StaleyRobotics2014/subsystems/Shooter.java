package org.usfirst.frc4959.StaleyRobotics2014.subsystems;

/**
 * @author Saul, Dustin, and Ian
 */

import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc4959.StaleyRobotics2014.RobotMap;

public class Shooter extends Subsystem
    {

    Relay solenoidSpike = RobotMap.SolenoidSpike;
    boolean retractorSafety = RobotMap.retractorSafety;

    public void initDefaultCommand()
        {
        // Set the default command for a subsystem here.
//        setDefaultCommand(new RunCompressor());
        }

    public void fire()
        {
        solenoidSpike.set(Relay.Value.kOn);
        retractorSafety = false;
        }

    public void reload()
        {
        solenoidSpike.set(Relay.Value.kOff);
        retractorSafety = true;
        }
    }
