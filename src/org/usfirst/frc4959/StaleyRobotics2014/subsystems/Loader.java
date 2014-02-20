package org.usfirst.frc4959.StaleyRobotics2014.subsystems;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc4959.StaleyRobotics2014.RobotMap;
import org.usfirst.frc4959.StaleyRobotics2014.commands.MoveLoader;

/**
 * @author Ian Collins
 */

public class Loader extends Subsystem
    {

    SpeedController loaderVictor = RobotMap.loaderVictor;

    public void initDefaultCommand()
        {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
        setDefaultCommand(new MoveLoader());
        }

    //Values may need to be reversed depending on the direction the motor turns
    //A negative value is returned by the right trigger and a positive by the right
    public void moveLoader(double input)
        {
            //Raise Arm
            if (input < 0) {
                loaderVictor.set(0.5 * input);
            //Lower Arm    
            } else if (input > 0) {
                loaderVictor.set(0.5);
            } else {
                loaderVictor.set(0.0);
            }    
        }
    }