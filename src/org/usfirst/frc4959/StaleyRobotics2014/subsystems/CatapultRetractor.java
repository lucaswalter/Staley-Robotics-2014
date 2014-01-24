package org.usfirst.frc4959.StaleyRobotics2014.subsystems;

import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc4959.StaleyRobotics2014.RobotMap;

/**
 * @authors Lucas and Ian
 */
public class CatapultRetractor extends Subsystem
    {

    private Relay catapultSpike = RobotMap.CatapultSpike;
    private boolean bStop = false;
    private boolean bForward = true;

    public void initDefaultCommand()
        {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
        }

    public void retract()
        {
        catapultSpike.set(Relay.Value.kReverse);
        bStop = true;
        }

    public void stop()
        {
        catapultSpike.set(Relay.Value.kOff);
        bStop = false;
        }
    
    public void toggle()
        {
        if (bStop == true)
            {
            catapultSpike.set(Relay.Value.kOff);
            bStop = false;
            }
        else
            {
            if (bForward == true)
                {
                catapultSpike.set(Relay.Value.kForward);
                bForward = false;
                }
            else
                {
                catapultSpike.set(Relay.Value.kReverse);
                bForward = true;
                }
            bStop = false;
            }
        }
    }
