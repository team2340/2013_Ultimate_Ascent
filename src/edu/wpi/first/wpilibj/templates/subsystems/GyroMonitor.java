/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.subsystems;

import edu.wpi.first.wpilibj.Gyro;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.templates.RobotMap;

/**
 *
 * @author bbarker
 */
public class GyroMonitor extends Subsystem{
    public static GyroMonitor subsystem = null;
    Gyro rateGyro = null;
    Gyro tempGyro = null;
    private boolean resetState = false;

    private GyroMonitor() {
        rateGyro = new Gyro(RobotMap.RATEGCHANNEL);
        tempGyro = new Gyro(RobotMap.TEMPGCHANNEL);
    }
    
    public static GyroMonitor getInstance(){
        if (subsystem == null) {
            subsystem = new GyroMonitor();  
        }
        return subsystem;
    }
    
    protected void initDefaultCommand() {
    }
    
    public void resetGyro() {
        resetState = true;
        System.out.println("Reset gyros ");
        rateGyro.reset();
        tempGyro.reset();
        
    }
    
    public double getRateRotation() {
        return rateGyro.getAngle();
    }
    
    public double getTempRotation() {
        return tempGyro.getAngle();
    }
    
    public void startMonitor() {
        System.out.println("Start Monitor");
        if (!resetState) {
            resetGyro();
        }
        System.out.println("RateAngle: " + getRateRotation());
        System.out.println("temp info: " + getTempRotation());
    }
    
    public void stopMonitor() {
        resetState = false;
        System.out.println("Stop Montiro");

    }
}