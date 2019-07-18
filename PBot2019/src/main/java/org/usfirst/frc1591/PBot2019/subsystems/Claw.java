package org.usfirst.frc1591.PBot2019.subsystems;


import org.usfirst.frc1591.PBot2019.commands.*;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.PIDOutput;
import edu.wpi.first.wpilibj.PIDSource;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;

/*
* Controls the open and closing of the game piece manipulator on the robot.
*/
public class Claw extends Subsystem {
    private Compressor compressor;
    private DoubleSolenoid doubleSolenoid;

    public Claw() {
        compressor = new Compressor(0);
        addChild("Compressor",compressor);
        
        
        doubleSolenoid = new DoubleSolenoid(4, 4, 5);
        addChild("Double Solenoid",doubleSolenoid);

    }

    @Override
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }

    @Override
    public void periodic() {
        // Put code here to be run every loop

    }
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

}

