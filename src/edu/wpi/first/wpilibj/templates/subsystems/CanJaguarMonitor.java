/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.subsystems;

import edu.wpi.first.wpilibj.CANJaguar;
import edu.wpi.first.wpilibj.can.CANTimeoutException;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.templates.RobotMap;

import java.util.*;
import team2340.CANJaguarFactory;

/**
 *
 * @author bbarker
 */
public class CanJaguarMonitor extends Subsystem {

    CanJaguarMonitor monitor = null;
    private final CANJaguar leftWheelJag;
    private final CANJaguar rightWheelJag;
    Vector faults = null;
    
    private CanJaguarMonitor() {
        leftWheelJag = CANJaguarFactory.getInstance().get(RobotMap.LEFT_DRIVE_JAG_ID);
        rightWheelJag = CANJaguarFactory.getInstance().get(RobotMap.RIGHT_DRIVE_JAG_ID);
        faults = new Vector();
    }
    protected void initDefaultCommand() {
    }
    
    public CanJaguarMonitor getInstance() {
        if (monitor == null) {
            monitor = new CanJaguarMonitor();
        }
        return monitor;          
    }
    
    public void getFirmwareState() {
        try {
           // faults.addElement(rightWheelJag.getFaults());
            rightWheelJag.getFaults();
        } catch (CANTimeoutException ex) {
            ex.printStackTrace();
        }
    }
    
}
