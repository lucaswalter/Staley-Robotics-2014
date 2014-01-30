/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.usfirst.frc4959.StaleyRobotics2014.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc4959.StaleyRobotics2014.Robot;

/**
 *
 * @author Dustin, AutoBrett, and Saul
 */
public class InitialMove extends Command {

    public InitialMove() {
        requires(Robot.driveTrain);
    }

    protected void initialize() {

    }

    protected void execute() {
        while(true) //
        {
            Robot.driveTrain.falconDrive(0.5, 0);
        }
    }

    protected boolean isFinished() {
        return true;
    }

    protected void end() {

    }

    protected void interrupted() {

    }

}
