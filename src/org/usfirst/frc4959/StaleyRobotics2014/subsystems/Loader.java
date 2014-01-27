package org.usfirst.frc4959.StaleyRobotics2014.subsystems;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc4959.StaleyRobotics2014.RobotMap;

/**
 * @author Ian
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
    public void moveLoader(double input)
        {
            if (input < 0) {
                loaderVictor.set(-0.6);
            } else if (input > 0) {
                loaderVictor.set(0.6);
            } else {
                loaderVictor.set(0.0);
            }
        }
    }
