/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.commands;

/**
 *
 * @author bbarker
 */
public class ExecuteGyroMonitorCommand extends CommandBase {
    
    public ExecuteGyroMonitorCommand() {
     //   requires(gyro);
        setTimeout(10);
    }
 protected void initialize() {
    }

    protected void execute() {
       // gyro.startMonitor();
    }

    protected boolean isFinished() {
        return isTimedOut();
    }

    protected void end() {
        //gyro.stopMonitor();
    }

    protected void interrupted() {
    }
    
    
}
