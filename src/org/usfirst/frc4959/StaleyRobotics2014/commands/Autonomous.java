package org.usfirst.frc4959.StaleyRobotics2014.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class Autonomous extends CommandGroup
    {

    public Autonomous()
        {
        addSequential(new PrimeCatapult());
        addSequential(new RetractCatapult());
        addSequential(new AutoLowerLoader());
        addSequential(new AutoMove());               
        addSequential(new FireCatapultSequence());
        }
}