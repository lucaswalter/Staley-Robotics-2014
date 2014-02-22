package org.usfirst.frc4959.StaleyRobotics2014.subsystems;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc4959.StaleyRobotics2014.RobotMap;
import org.usfirst.frc4959.StaleyRobotics2014.commands.MoveLoader;

/**
 * @author Ian Collins
 */

public class Loader extends Subsystem
    {

    SpeedController loaderVictor = RobotMap.loaderVictor;
    private static final Timer TIMER = new Timer();

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
                loaderVictor.set(0.45 * input);
            //Lower Arm    
            } else if (input > 0) {
                loaderVictor.set(0.45);
            } else {
                loaderVictor.set(0.0);
            }    
        }
    
    public void lowerLoader(double time)
        {
        TIMER.start();
        while(TIMER.get() < time)
            {
            loaderVictor.set(0.2);
            }    
        TIMER.stop();
        TIMER.reset();
        }
    }