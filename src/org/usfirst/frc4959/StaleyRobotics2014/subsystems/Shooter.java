package org.usfirst.frc4959.StaleyRobotics2014.subsystems;

/**
 * @author Saul, Dustin, and Ian
 */

import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc4959.StaleyRobotics2014.RobotMap;
import org.usfirst.frc4959.StaleyRobotics2014.commands.RunCompressor;

public class Shooter extends Subsystem
    {

    Relay fireSolenoidSpike = RobotMap.FireSolenoidSpike;
    Relay primeSolenoidSpike = RobotMap.PrimeSolenoidSpike;

    public void initDefaultCommand()
        {
        // Set the default command for a subsystem here.
        setDefaultCommand(new RunCompressor());
        }

    public void fire()
        {
        fireSolenoidSpike.set(Relay.Value.kOff);
        primeSolenoidSpike.set(Relay.Value.kOn);
        }

    public void prime()
        {
        fireSolenoidSpike.set(Relay.Value.kOn);
        primeSolenoidSpike.set(Relay.Value.kOff);
        }
    }
