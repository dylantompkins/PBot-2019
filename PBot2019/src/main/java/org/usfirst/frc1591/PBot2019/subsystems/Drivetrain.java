package org.usfirst.frc1591.PBot2019.subsystems;


import org.usfirst.frc1591.PBot2019.commands.*;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.PIDOutput;
import edu.wpi.first.wpilibj.PIDSource;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.drive.MecanumDrive;

/*
* Controls the mecanum wheel drivetrain of the robot.
*/
public class Drivetrain extends Subsystem {

    private WPI_TalonSRX talonSRX1;
    private WPI_TalonSRX talonSRX2;
    private WPI_TalonSRX talonSRX3;
    private WPI_TalonSRX talonSRX4;
    private MecanumDrive mecanumDrive1;

    public Drivetrain() {
        talonSRX1 = new WPI_TalonSRX(0);
        
        
        
        talonSRX2 = new WPI_TalonSRX(1);
        
        
        
        talonSRX3 = new WPI_TalonSRX(2);
        
        
        
        talonSRX4 = new WPI_TalonSRX(3);
        
        
        
        mecanumDrive1 = new MecanumDrive(talonSRX1, talonSRX2,
              talonSRX3, talonSRX4);
        addChild("Mecanum Drive 1",mecanumDrive1);
        mecanumDrive1.setSafetyEnabled(true);
        mecanumDrive1.setExpiration(0.1);
        mecanumDrive1.setMaxOutput(1.0);
        
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

