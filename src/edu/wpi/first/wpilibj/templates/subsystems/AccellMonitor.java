/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.subsystems;

import edu.wpi.first.wpilibj.Accelerometer;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.templates.RobotMap;

/**
 *
 * @author bbarker
 */
public class AccellMonitor extends Subsystem {
    static AccellMonitor subsystem = null;
    Accelerometer accel = null;
    private AccellMonitor() {
        accel = new Accelerometer(RobotMap.ACCEL_CHANNEL);
        
    }
    
    public AccellMonitor getInstance() {
        if (subsystem == null) {
            subsystem = new AccellMonitor();
        }
        return subsystem;
    }

    protected void initDefaultCommand() {
    }
    
}
