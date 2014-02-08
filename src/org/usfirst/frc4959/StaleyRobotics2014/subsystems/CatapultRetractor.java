package org.usfirst.frc4959.StaleyRobotics2014.subsystems;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc4959.StaleyRobotics2014.RobotMap;
import org.usfirst.frc4959.StaleyRobotics2014.commands.StartRetractCatapult;

/**
 * Lucas Wyland
 */
public class CatapultRetractor extends Subsystem
    {

    private SpeedController catapultVictor = RobotMap.CatapultVictor;

    public void initDefaultCommand()
        {
        // Set the default command for a subsystem here.
        setDefaultCommand(new StartRetractCatapult());
        }

    public void retract(double input)
        {
        catapultVictor.set(Math.abs(input));
        }

    public void stop()
        {
        catapultVictor.set(0);
        }

    }