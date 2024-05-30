import java.util.ArrayList;

public class Go {
    
    public static void main(String[] args) {
       var leftmotor = new Motor(24.2,Motor.MotorType.CIM,Motor.MotorDirection.Left);
       var rightMotor = new Motor(24,Motor.MotorType.BANE_BOTS,Motor.MotorDirection.Right);

        var motors = new ArrayList<Motor>();
        motors.add(0, leftmotor);
        motors.add(1, leftmotor);
        motors.add(2, leftmotor);
        motors.add(3, rightMotor);
        motors.add(4, rightMotor);
        motors.add(5, rightMotor);
        
        for (Motor m : motors) {
            System.out.print(m.motorCompany+" ");
            System.out.print(m.Direction+" ");
            System.out.print(m.getMotorVolt()+"V");
            System.out.println("");
            System.out.println("------------------------------------------------");
        }
                
       motors.get(2).Go(Motor.MovingDirection.Forward,100);
       System.out.println(motors.get(2).GetDirASpeed());; motors.get(2).GetDirASpeed();
    }
}
