package org.usfirst.frc1591.PBot2019;

import org.usfirst.frc1591.PBot2019.commands.*;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.*;
import org.usfirst.frc1591.PBot2019.subsystems.*;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);

    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.

    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:

    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());

    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());

    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());

    public JoystickButton lB;
    public JoystickButton rB;
    public JoystickButton x;
    public JoystickButton b;
    public Joystick logitechGamepad;

    public OI() {

        logitechGamepad = new Joystick(0);
        
        b = new JoystickButton(logitechGamepad, 1);
        b.whenPressed(new AutoPlace());
        x = new JoystickButton(logitechGamepad, 1);
        x.whenPressed(new AutoPickup());
        rB = new JoystickButton(logitechGamepad, 1);
        rB.whenPressed(new ClawClose());
        lB = new JoystickButton(logitechGamepad, 1);
        lB.whenPressed(new ClawOpen());


        // SmartDashboard Buttons
        SmartDashboard.putData("ClawOpen", new ClawOpen());
        SmartDashboard.putData("ClawClose", new ClawClose());
        SmartDashboard.putData("DriveToTarget", new DriveToTarget());
        SmartDashboard.putData("BackAwayFromTarget", new BackAwayFromTarget());
        SmartDashboard.putData("AutoPickup", new AutoPickup());
        SmartDashboard.putData("AutoPlace", new AutoPlace());

    }

    public Joystick getLogitechGamepad() {
        return logitechGamepad;
    }

    
}

