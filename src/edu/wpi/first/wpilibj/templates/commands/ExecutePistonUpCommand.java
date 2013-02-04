/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.commands;

/**
 *
 * @author bbarker
 */
public class ExecutePistonUpCommand extends CommandBase {
    boolean onState = false;
    public ExecutePistonUpCommand() {
        requires(dps);
        setTimeout(.5);
    }

    protected void initialize() {
    }

    protected void execute() {
        if (!onState){
            System.out.println(" turn on UP command");
            onState = true;
            dps.pistonUpdate("UP", true);   
        }   
    }

    protected boolean isFinished() {
        return isTimedOut();
    }

    protected void end() {
        onState = false;
        dps.pistonUpdate("UP", false);
    }

    protected void interrupted() {
    }
    
}
