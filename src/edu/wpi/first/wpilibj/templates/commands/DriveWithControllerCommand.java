package edu.wpi.first.wpilibj.templates.commands;

import edu.wpi.first.wpilibj.templates.subsystems.Drive;
import team2340.Direction;

/**
 *
 * @author bradmiller
 */
public class DriveWithControllerCommand extends CommandBase {

  
    
    public DriveWithControllerCommand() {
         requires(drive);
        
    }

    // Called just before this Command runs the first time
    protected void initialize() {
      
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        //System.out.println("driving!");
        double right = oi.getRightStickY();
        double left = oi.getLeftStickY();
        drive.drive(-left, -right);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
