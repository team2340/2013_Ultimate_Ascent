/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.commands;

/**
 *
 * @author bbarker
 */
public class ExecutePistonDownCommand extends CommandBase {
    boolean onState = false;
    public ExecutePistonDownCommand(){
        requires(dps);
        setTimeout(.5);
       
    }

    protected void initialize() {
    }

    protected void execute() {
        if (!onState) {
            onState = true;
            dps.pistonUpdate("DOWN", true);
        }
    }

    protected boolean isFinished() {
        return isTimedOut();
    }

    protected void end() {
        onState = false;
        dps.pistonUpdate("DOWN", false);
    }

    protected void interrupted() {
    }
    
}
