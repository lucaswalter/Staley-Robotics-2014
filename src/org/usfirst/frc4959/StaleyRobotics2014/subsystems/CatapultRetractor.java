package org.usfirst.frc4959.StaleyRobotics2014.subsystems;

import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc4959.StaleyRobotics2014.RobotMap;

/**
 * Lucas Wyland
 */
public class CatapultRetractor extends Subsystem
    {

    private Relay catapultSpike = RobotMap.CatapultSpike;
    private boolean bRetracting = false;

    public void initDefaultCommand()
        {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
        }

    public void retract()
        {
        catapultSpike.set(Relay.Value.kReverse);
        bRetracting = true;
        }

    public void stop()
        {
        catapultSpike.set(Relay.Value.kOff);
        bRetracting = false;
        }

    public void toggle()
        {
        if (bRetracting == true) {
            catapultSpike.set(Relay.Value.kOff);
            bRetracting = false;
        } else {
            catapultSpike.set(Relay.Value.kReverse);
            bRetracting = true;
        }
        }
    }