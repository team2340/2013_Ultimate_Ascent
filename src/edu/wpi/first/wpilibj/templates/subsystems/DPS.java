/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.subsystems;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.templates.RobotMap;
import team2340.CANJaguarFactory;
import edu.wpi.first.wpilibj.templates.RobotMap;

/**
 *
 * @author Team 2340
 */
public class DPS extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    static DPS subsystem = null;
    Compressor compressor = null;
    Solenoid pistonUp = null;
    Solenoid pistonDown = null;
    
    static public DPS getInstance() {
        if(subsystem == null)
        {
            subsystem = new DPS();
        }
        return subsystem;
    }
    
    private DPS() {
        compressor = new Compressor(RobotMap.COMPRESSOR_PRESSURESWITCHCHANNEL, 
                RobotMap.COMPRESSOR_RELAYCHANNEL);
        pistonUp = new Solenoid(RobotMap.PISTONUP_CHANNEL);
        pistonDown = new Solenoid(RobotMap.PISTONDOWN_CHANNEL);
    }

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
        System.out.println("starting compressor");
        compressor.start();
        pistonUp.set(false);
        pistonDown.set(false);
    }
    
    public void goUp() {
        System.out.println("goUp");
        pistonUp.set(false);
        pistonDown.set(true);
    }
    
    public void goDown() {
        System.out.println("goDown");
        pistonUp.set(true);
        pistonDown .set(false);
    }
    
    public void stop() {
        System.out.println("DPS stop");
        pistonUp.set(false);
        pistonDown.set(false);
    }
    
    public void pistonUpdate(String piston, boolean state) 
    {
        if (piston.equalsIgnoreCase("UP"))
        {
            System.out.println("PistonUP: " + (state ? "on" : "off"));
            pistonUp.set(state);
        }
        
        else if (piston.equalsIgnoreCase("DOWN"))
        {
            System.out.println("PistonDown: " + (state ? "on" : "off"));
            pistonDown.set(state);
        }
    }
    


}
