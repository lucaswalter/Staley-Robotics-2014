package org.usfirst.frc4959.StaleyRobotics2014;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import org.usfirst.frc4959.StaleyRobotics2014.commands.Autonomous;
import org.usfirst.frc4959.StaleyRobotics2014.commands.DecreaseSensitivity;
import org.usfirst.frc4959.StaleyRobotics2014.commands.FireCatapult;
import org.usfirst.frc4959.StaleyRobotics2014.commands.FireCatapultSequence;
import org.usfirst.frc4959.StaleyRobotics2014.commands.IncreaseSensitivity;
import org.usfirst.frc4959.StaleyRobotics2014.commands.PrimeCatapult;
import org.usfirst.frc4959.StaleyRobotics2014.commands.RetractCatapult;
import org.usfirst.frc4959.StaleyRobotics2014.commands.StopRetractCatapult;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot
 */

public class OI
    {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);

    // Another type of button you can create is a DigitalIOButton, which is
    // a button or switch hooked up to the cypress module. These are useful if
    // you want to build a customized operator interface.
    // Button button = new DigitalIOButton(1);
    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:
    /// Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    /// Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());
    /// Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());
    
    public Joystick XboxController;
    private final JoystickButton increaseSensitivity;
    private final JoystickButton decreaseSensitivity;
    private final JoystickButton fireCatapult;
    private final JoystickButton retractCatapult;

    public OI()
    {

        XboxController = new Joystick(1);

        //These call certain methods when buttons are pressed
        increaseSensitivity = new JoystickButton(XboxController, RobotMap.RIGHT_BUMPER);
        increaseSensitivity.whenPressed(new IncreaseSensitivity());

        decreaseSensitivity = new JoystickButton(XboxController, RobotMap.LEFT_BUMPER);
        decreaseSensitivity.whenPressed(new DecreaseSensitivity());

        fireCatapult = new JoystickButton(XboxController, RobotMap.A_BUTTON);
        fireCatapult.whenPressed(new FireCatapultSequence());
        
        retractCatapult = new JoystickButton(XboxController, RobotMap.X_BUTTON);
        retractCatapult.whenPressed(new RetractCatapult());
        
        // SmartDashboard Buttons
        SmartDashboard.putData("Autonomous Command", new Autonomous());
        
        SmartDashboard.putData("Fire Catapult", new FireCatapult());
        SmartDashboard.putData("Prime Catapult", new PrimeCatapult());
        
        SmartDashboard.putData("Stop Catapult Retractor", new RetractCatapult());
        SmartDashboard.putData("Stop Catapult Retractor", new StopRetractCatapult());
        
        SmartDashboard.putNumber("Ultrasonic Sensor Distance (cm):", RobotMap.ultrasonic.getVoltage() / 0.0049);
    }

    //Methods for the axes of XBOX controller
    public double getLeftJoystick_XAxis()
        {
        return XboxController.getRawAxis(1);
        }
    
    public double getLeftJoystickYAxis()
        {
        return XboxController.getRawAxis(2);
        }

    public double getTriggers()
        {
        return XboxController.getRawAxis(3);
        }
    
    public double getRightJoystick_XAxis()
        {
        return XboxController.getRawAxis(4);
        }
    
    public double getRightJoystick_YAxis()
        {
        return XboxController.getRawAxis(5);
        }
    
    public double getDPad_XAxis()
        {
        return XboxController.getRawAxis(6);
        }
    
    public double getDPad_YAxis()
        {
        return XboxController.getRawAxis(7);
        }
    }
