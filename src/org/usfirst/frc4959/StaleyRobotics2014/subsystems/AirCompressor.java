/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.usfirst.frc4959.StaleyRobotics2014.subsystems;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc4959.StaleyRobotics2014.Robot;
import org.usfirst.frc4959.StaleyRobotics2014.RobotMap;
import org.usfirst.frc4959.StaleyRobotics2014.commands.RunCompressor;

/**
 *
 * @author Lucas Wyland
 */
public class AirCompressor extends Subsystem
{
    private Compressor compressor;
    
    public AirCompressor()
    {
        compressor = new Compressor(3, 2);
    }
    
    public void initDefaultCommand()
    {
        setDefaultCommand(new RunCompressor());
    }
    
    public void start()
    {   
        compressor.start();
        System.out.println("Compressor Started");
    }
    
    public void stop()
    {   
        compressor.stop();
    }
    
    public boolean isAirTankFull()
    {
        return compressor.getPressureSwitchValue();
    }
    
    public boolean isEnabled()
    {
        return compressor.enabled();
    }
}
