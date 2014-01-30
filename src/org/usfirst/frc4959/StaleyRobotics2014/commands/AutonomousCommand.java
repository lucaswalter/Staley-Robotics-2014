package org.usfirst.frc4959.StaleyRobotics2014.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class AutonomousCommand extends CommandGroup
    {

    public AutonomousCommand()
        {
        addSequential(new InitialMove());
        addSequential(new SensorMove());
        addSequential(new FireCatapult());      
        }
}