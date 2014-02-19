package org.usfirst.frc4959.StaleyRobotics2014.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class Autonomous extends CommandGroup
    {

    public Autonomous()
        {
        addSequential(new AutoMove());
        addSequential(new RetractCatapult());
        
        // Maybe fire maybe not
//        addSequential(new FireCatapultSequence());      
        }
}