package org.usfirst.frc4959.StaleyRobotics2014.subsystems;

/**
 * @author Saul, Dustin, and Ian
 */
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc4959.StaleyRobotics2014.RobotMap;

public class Shooter extends Subsystem
    {

    private Relay solenoidSpike = RobotMap.SolenoidSpike;
    private Compressor compressorSpike = RobotMap.CompressorSpike;

    public void initDefaultCommand()
        {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
        }

    public void fire()
        {
        solenoidSpike.set(Relay.Value.kOn);
        }

    public void reload()
        {
        solenoidSpike.set(Relay.Value.kOff);
        }

    public void Compressor()
        {
        compressorSpike.start();
        }
    }
