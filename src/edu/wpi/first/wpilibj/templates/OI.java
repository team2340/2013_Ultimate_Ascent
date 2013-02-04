package edu.wpi.first.wpilibj.templates;

import team2340.Direction;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.buttons.DigitalIOButton;
import edu.wpi.first.wpilibj.templates.commands.AButtonCommand;
import edu.wpi.first.wpilibj.templates.commands.DriveWithControllerCommand;
import edu.wpi.first.wpilibj.templates.commands.ExecuteDPCommand;
import edu.wpi.first.wpilibj.templates.commands.ExecuteGyroMonitorCommand;
import edu.wpi.first.wpilibj.templates.commands.ExecutePistonDownCommand;
import edu.wpi.first.wpilibj.templates.commands.ExecutePistonUpCommand;
import team2340.DPadIncreaser;
import team2340.LogitechF310;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {

    LogitechF310 driveController = new LogitechF310("Drive Controller",
            RobotMap.DRIVE_CONTROLLER_PORT);
    
    public OI() {
        driveController.getAButton().whenPressed(new ExecuteDPCommand());
        //driveController.getBButton().whenPressed(new ExecutePistonUpCommand());
        //driveController.getXButton().whenPressed(new ExecutePistonDownCommand());
        //driveController.getYButton().whenPressed(new ExecuteGyroMonitorCommand());
    }
    
    public double getRightStickY() {
        return driveController.getRightStick().getY();
    }
    
    public double getLeftStickY() {
        return driveController.getLeftStick().getY();
    }
    
}
