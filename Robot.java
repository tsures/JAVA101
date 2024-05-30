import java.util.ArrayList;
import java.util.List;

public class Robot {

    
    private ArrayList<Sensor> RobotSensors;
    private ArrayList<Motor> RobotMotors;
    private Motor RobotMotor;
 

    public Robot(ArrayList<Sensor> sensors, ArrayList<Motor> motors) {        
        RobotSensors = sensors;
        RobotMotors = motors;    
    }
}
