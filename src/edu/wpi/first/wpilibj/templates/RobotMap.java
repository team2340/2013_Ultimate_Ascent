package edu.wpi.first.wpilibj.templates;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    public static final int LEFT_DRIVE_JAG_ID = 5;
    public static final int RIGHT_DRIVE_JAG_ID = 2;
    
    public static final int DRIVE_CONTROLLER_PORT = 1;
    
    public static final int COMPRESSOR_RELAYCHANNEL = 1;
    public static final int COMPRESSOR_PRESSURESWITCHCHANNEL = 1;
    
    public static final int PISTONUP_CHANNEL  = 1;
    public static final int PISTONDOWN_CHANNEL = 2;
    
    public static final int ACCEL_CHANNEL = 1;
    
    public static final double DRIVE_SPEED = 1.0;
    
    public static final int RATEGCHANNEL = 1;
    
    public static final int TEMPGCHANNEL = 2;
    
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static final int rangefinderPort = 1;
    // public static final int rangefinderModule = 1;
}
