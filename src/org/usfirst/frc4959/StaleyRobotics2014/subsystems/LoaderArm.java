package org.usfirst.frc4959.StaleyRobotics2014.subsystems;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc4959.StaleyRobotics2014.RobotMap;

/**
 * * @author Ian
 */
public class LoaderArm extends Subsystem
    {

    SpeedController loaderVictor = RobotMap.loaderArmVictor;

    public void initDefaultCommand()
        {
        }

    public void moveLoader(double input)
        {
        if (input < 0)
            {
            loaderVictor.set(0.5);
            }
        else
            if (input > 0)
                {
                loaderVictor.set(-0.5);
                }
            else
                {
                loaderVictor.set(0.0);
                }
        }
    }
