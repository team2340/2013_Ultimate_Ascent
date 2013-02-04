package edu.wpi.first.wpilibj.templates.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.CANJaguar;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.can.CANTimeoutException;
import team2340.CANJaguarFactory;
import edu.wpi.first.wpilibj.templates.RobotMap;
import edu.wpi.first.wpilibj.templates.commands.DriveWithControllerCommand;


/**
 *
 */
public class Drive extends Subsystem {

    static Drive subsystem = null;
    RobotDrive robotDrive = null;

    static public Drive getInstance() {
        if(subsystem == null)
        {
            subsystem = new Drive();
        }
        return subsystem;
    }
    
    private Drive() {
        robotDrive = new RobotDrive(CANJaguarFactory.getInstance().get(RobotMap.LEFT_DRIVE_JAG_ID), 
                CANJaguarFactory.getInstance().get(RobotMap.RIGHT_DRIVE_JAG_ID));
    }

    public void initDefaultCommand() {
        setDefaultCommand(new DriveWithControllerCommand());
    }
    
    public void stop() {
        robotDrive.tankDrive(0, 0);
    }
    
    public void drive(double left, double right) {
     
        System.out.println("right Speed: " + right + " Left Speed: " + left);
      
        robotDrive.tankDrive(left * (RobotMap.DRIVE_SPEED),right * (RobotMap.DRIVE_SPEED));
          try {
            System.out.println("jagrt Speed: " + CANJaguarFactory.getInstance().get(RobotMap.LEFT_DRIVE_JAG_ID).getSpeed() + " jaglt Speed: " + CANJaguarFactory.getInstance().get(RobotMap.LEFT_DRIVE_JAG_ID).getSpeed());
        } catch (CANTimeoutException ex) {
            ex.printStackTrace();
        }
    }
}
